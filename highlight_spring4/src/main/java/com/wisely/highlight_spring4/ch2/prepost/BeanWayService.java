package com.wisely.highlight_spring4.ch2.prepost;

/**
 * @Title: 使用@Bean的形式
 * @Author: bcl
 * @Date: 2020/3/17 11:18 下午
 */
public class BeanWayService {
    public void init() {
        System.out.println("@Bean-init-method");
    }

    public BeanWayService() {
        super();
        System.out.println("初始化构造函数-BeanWayService");
    }

    public void destroy() {
        System.out.println("@Bean-destory-method");
    }
}
