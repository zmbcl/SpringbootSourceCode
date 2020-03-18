package com.wisely.highlight_spring4.ch2.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @Title: 事件监听器
 * @Author: bcl
 * @Date: 2020/3/17 11:33 下午
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent> {// 实现ApplicationListener并指定监听的事件类型

	public void onApplicationEvent(DemoEvent event) {// 对消息进行接受处理
		
		String msg = event.getMsg();
		
		System.out.println("我(bean-demoListener)接收到了bean-demoPublisher发布的消息:"
				+ msg);

	}

}
