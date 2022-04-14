package com.company.coupling.factorypattern;


public class TVUser {

	public static void main(String[] args) {
		BeanFactory factory = new BeanFactory();
		TV tv = (TV)factory.getBean(args[0]);
		
		tv.powerOn();
		tv.volumnUp();
		tv.volumnDown();
		tv.powerDown();
		
	}


}
