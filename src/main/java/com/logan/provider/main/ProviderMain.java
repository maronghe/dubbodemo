package com.logan.provider.main;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProviderMain {

	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext(new String[] {"/META-INF/spring/dubbo-demo-provider.xml"});
		context.start();
		System.out.println("Service Strated!");
		System.out.println("任意键退出");
		System.in.read();// 退出
//		context.close();
	}
}
