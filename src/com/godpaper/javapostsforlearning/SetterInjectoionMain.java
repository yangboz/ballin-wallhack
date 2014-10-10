/**
 * 
 */
package com.godpaper.javapostsforlearning;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
/**
 * @author yangboz
 *
 */
public class SetterInjectoionMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("/main/resources/ApplicationContext.xml");
		Country countryObj = (Country)appContext.getBean("CountryBean");
		String countryName = countryObj.getCountryName();
		String capitalName = countryObj.getCapital().getCapitalName();
		System.out.println(capitalName+" is capital of "+countryName);
	}

}
