package com.wisely.highlight_spring4.ch3.conditional;

/**
 * @Title: Linux下Bean的类
 * @Author: bcl
 * @Date: 2020/3/18 4:05 下午
 */
public class LinuxListService implements ListService{

	@Override
	public String showListCmd() {
		return "ls";
	}

}
