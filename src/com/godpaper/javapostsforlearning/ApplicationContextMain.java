/**
 * 
 */
package com.godpaper.javapostsforlearning;

/**
 * @author yangboz
 *
 */
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("/main/resources/ApplicationContext.xml");  
		  Country countryObj = (Country) appContext.getBean("country");  
//		  System.out.println("Capital Name:"+countryObj.getCapitalName("capital"));
	}

}
