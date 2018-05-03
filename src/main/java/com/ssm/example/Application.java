package com.ssm.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
	public static void main(String[] args) {
	    ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring/spring-context.xml");
	    ctx.start();
	    System.out.println("===================provide started=======================================");
	    synchronized (Application.class) {
	        while (true) {
	            try {
	            	Application.class.wait();
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }
	    }
	}
}
