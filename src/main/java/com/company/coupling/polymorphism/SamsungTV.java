package com.company.coupling.polymorphism;

public class SamsungTV implements TV{

	@Override  //어노테이션 
	public void powerOn() {
		System.out.println("SamsungTV ===> 전원을 켠다.");
	}

	@Override
	public void volumnUp() {
		System.out.println("SamsungTV ===> 볼륨을 올린다.");
	}

	@Override
	public void volumnDown() {
		System.out.println("SamsungTV ===> 볼륨을 내린다.");
	}

	@Override
	public void powerDown() {
		System.out.println("SamsungTV ===> 전원을 끈다.");		
	}

}
