package com.spring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
		Book book = (Book)context.getBean("book");
		System.out.println("Book Name:"+ book.getBookName());
	        context.registerShutdownHook();
	}
} 