package com.logan.consumer;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.logan.service.DemoService;

public class ConsumerMain {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext(new String[] {"/META-INF/spring/dubbo-demo-consumer.xml"});
	
		context.start();
		DemoService demoService = (DemoService) context.getBean("demoService");
		for(int i = 0 ; i < Integer.MAX_VALUE; i ++) {
			try {
				// 执行远程方法
				String hello = demoService.sayHello("Logan-" + i);
				// 本地输出
                System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] " + hello);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				Thread.sleep(2 * 1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
}
