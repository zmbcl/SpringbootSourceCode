package com.wisely.highlight_spring4.ch2.scope;

import org.springframework.stereotype.Service;
/**
 * @Title: singleton的Bean
 * @Author: bcl
 * @Date: 2020/3/17 9:02 下午
 */
@Service // 相当于再添加一个@Scope("singleton")
public class DemoSingletonService {

}
