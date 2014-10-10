/**
 * 
 */
package com.godpaper.javapostsforlearning;

/**
 * @author yangboz
 *
 */
import org.springframework.core.io.ClassPathResource;
import org.springframework.context.ApplicationContext;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InheritenceInSpringMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("/main/resources/ApplicationContext.xml");  
		  Employee emp=(Employee) appContext.getBean("employeeBean");  
		  System.out.println("Employee name:"+emp.getName());  
		  System.out.println("Employee number:"+emp.getEmployeeNumber());
	}

}
