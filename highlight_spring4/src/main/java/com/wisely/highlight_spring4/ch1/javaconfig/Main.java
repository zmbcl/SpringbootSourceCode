package com.wisely.highlight_spring4.ch1.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @description: Java配置，通过@Configuration和@Bean来实现
 * @author: bcl
 * @date: 2020/3/17 8:24 下午
 */
public class Main {
	public static void main(String[] args) {
		 AnnotationConfigApplicationContext context =
	                new AnnotationConfigApplicationContext(JavaConfig.class); 
		 
		 UseFunctionService useFunctionService = context.getBean(UseFunctionService.class); 
		 
		 System.out.println(useFunctionService.SayHello("java config"));
		 
		 context.close();
		
	}
}
