/**
 * 
 */
package com.godpaper.javapostsforlearning;

/**
 * @author yangboz
 *
 */
public class Spring4HelloWorld {
	String name;
	public void printHello()
	{
		System.out.println("Hello World from:"+name);
	}
	public String getName()
	{
		return name;
	}
	public void setName(String value)
	{
		this.name = value;
	}
}
