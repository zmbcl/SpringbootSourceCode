package com.wisely.highlight_spring4.ch1.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @description: 依赖注入示例
 * @author: bcl
 * @date: 2020/3/17 8:21 下午
 */
public class Main {
	public static void main(String[] args) {
		 AnnotationConfigApplicationContext context =
	                new AnnotationConfigApplicationContext(DiConfig.class); //1
		 
		 UseFunctionService useFunctionService = context.getBean(UseFunctionService.class); //2
		 
		 System.out.println(useFunctionService.SayHello("world"));
		 
		 context.close();
	}
}
