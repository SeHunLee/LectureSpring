package com.test.main;

import com.test.bean.HelloBeanEn;
import com.test.bean.HelloBeanKo;

public class MainClass {

	public static void main(String[] args) {
		HelloBeanEn aa = new HelloBeanEn();
		HelloBeanKo bb = new HelloBeanKo();
		com.test.bean1.HelloBeanKo cc = new com.test.bean1.HelloBeanKo();
		aa.sayHello();
		bb.sayHello();
		cc.sayHello();
	}
}
