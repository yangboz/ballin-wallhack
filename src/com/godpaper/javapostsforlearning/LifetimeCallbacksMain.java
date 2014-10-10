/**
 * 
 */
package com.godpaper.javapostsforlearning;

/**
 * @author yangboz
 *
 */
import org.springframework.core.io.ClassPathResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.AbstractApplicationContext;

public class LifetimeCallbacksMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AbstractApplicationContext appContext = new ClassPathXmlApplicationContext("/main/resources/ApplicationContext.xml");
		Country countryObj = (Country) appContext.getBean("country");  
		  System.out.println("Country Name: "+countryObj.getCountryName());  
		  appContext.registerShutdownHook();
	}

}
