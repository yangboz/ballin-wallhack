/**
 * 
 */
package com.godpaper.javapostsforlearning;

/**
 * @author yangboz
 *
 */
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.beans.factory.xml.XmlBeanFactory;

public class ScopeInSpringMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("/main/resources/ApplicationContext.xml");  
		  Country countryObj1 = (Country) appContext.getBean("country");  
		  countryObj1.setCountryName("India");  
		  System.out.println("Country Name:"+countryObj1.getCountryName());  
		    
		  //getBean called second time  
		  Country countryObj2 = (Country) appContext.getBean("country");  
		  System.out.println("Country Name:"+countryObj2.getCountryName()); 
	}

}
