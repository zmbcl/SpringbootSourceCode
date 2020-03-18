package com.wisely.highlight_spring4.ch2.event;

import org.springframework.context.ApplicationEvent;
/**
 * @Title: 自定义事件
 * @Author: bcl
 * @Date: 2020/3/17 11:32 下午
 */
public class DemoEvent extends ApplicationEvent{
    private static final long serialVersionUID = 1L;
    private String msg;

    public DemoEvent(Object source,String msg) {
        super(source);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

}
