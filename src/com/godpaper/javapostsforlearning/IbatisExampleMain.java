/**
 * 
 */
package com.godpaper.javapostsforlearning;

/**
 * @author yangboz
 *
 */
import com.godpaper.javapostsforlearning.iBatis.domain.Contact;
import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

import java.io.*;
import java.sql.SQLException;
import java.util.*;

public class IbatisExampleMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException,SQLException {
//		FileReader reader = new FileReader(new File("com/godpaper/javapostsforlearning/SqlMapConfig.xml"));
		Reader reader = Resources.getResourceAsReader("com/godpaper/javapostsforlearning/SqlMapConfig.xml");
		  SqlMapClient sqlMap = 
		  SqlMapClientBuilder.buildSqlMapClient(reader);
		  //Output all contacts
		  System.out.println("All Contacts");
		  List<Contact> contacts = (List<Contact>)
		  sqlMap.queryForList("Contact.getAll",null);
		  Contact contact = null;
		  for (Contact c : contacts) {
		  System.out.print("  " + c.getId());
		  System.out.print("  " + c.getFirstName());
		  System.out.print("  " + c.getLastName());
		  System.out.print("  " + c.getEmail());
		  contact = c; 
		  System.out.println("");
		  }  
	}

}
