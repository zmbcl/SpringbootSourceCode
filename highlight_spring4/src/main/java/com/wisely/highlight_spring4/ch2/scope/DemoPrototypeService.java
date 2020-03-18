package com.wisely.highlight_spring4.ch2.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * @Title: prototype的Bean
 * @Author: bcl
 * @Date: 2020/3/17 9:03 下午
 */
@Service
@Scope("prototype")//声明Bean为prototype
public class DemoPrototypeService {

}
