package com.company.coupling.polymorphism;

public interface TV {
	//앞으로 여러 클래스가 공통으로 가져야할 기능을 추상 메소드로 정의하자!!
	public void powerOn();
	public void volumnUp();
	public void volumnDown();
	public void powerDown();
}
