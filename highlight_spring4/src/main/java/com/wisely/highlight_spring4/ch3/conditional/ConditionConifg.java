package com.wisely.highlight_spring4.ch3.conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @Title: 配置类
 * @Author: bcl
 * @Date: 2020/3/18 4:06 下午
 */
@Configuration
public class ConditionConifg {
	@Bean
    @Conditional(WindowsCondition.class) //1符合Windows条件则实例化windowsListService
    public ListService windowsListService() {
        return new WindowsListService();
    }

    @Bean
    @Conditional(LinuxCondition.class) //2符合Linux条件则实例化LinuxListService
    public ListService linuxListService() {
        return new LinuxListService();
    }

    @Bean
    @Conditional(MacCondition.class) //2符合Mac条件则实例化LinuxListService
    public ListService macListService() {
        return new MacListService();
    }

}
