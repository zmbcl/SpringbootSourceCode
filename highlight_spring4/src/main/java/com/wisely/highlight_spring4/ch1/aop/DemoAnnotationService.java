package com.wisely.highlight_spring4.ch1.aop;

import org.springframework.stereotype.Service;
/**
 * @description: 使用注解的被拦截类
 * @author: bcl
 * @date: 2020/3/17 8:45 下午
 */
@Service
public class DemoAnnotationService {
	@Action(name="注解式拦截的add操作")
    public void add(){} 
   
}
