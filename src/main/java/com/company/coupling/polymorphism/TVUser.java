package com.company.coupling.polymorphism;




public class TVUser {

	public static void main(String[] args) {
		TV tv = new LgTV();
		 
		tv.powerOn();
		tv.volumnUp();
		tv.volumnDown();
		tv.powerDown();
		
	}


}
