package com.logan.provider.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.alibaba.dubbo.rpc.RpcContext;
import com.logan.service.DemoService;

public class DemoServiceImpl implements DemoService {

	/**
	 * SayHello Demo
	 */
	public String sayHello(String name) {
		System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] Hello " + name
				+ ", request from consumer: " + RpcContext.getContext().getRemoteAddress());
		return "Hello " + name + ", response form provider: " + RpcContext.getContext().getLocalAddress();
	}

}
