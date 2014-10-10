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
public class Spring4HelloWorldMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext beanFactory = new ClassPathXmlApplicationContext("/main/resources/Spring4HelloWorld.xml");
		Spring4HelloWorld myBean = (Spring4HelloWorld) beanFactory.getBean("Spring4HelloWorldBean");
		myBean.printHello();
	}	

}
