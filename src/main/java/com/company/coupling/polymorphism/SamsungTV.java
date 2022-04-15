package com.company.coupling.polymorphism;

import com.company.coupling.polymorphism.SonySpeaker;

  /*구현 클래스 
    이 프로그램의 두 가지 문제점
  (1) SonySpeaker 객체가 쓸데 없이 두 개나 생성되는 것이고 
  (2) 운영과정에서 SonySpeaker의 성능이 떨어져서 AppleSpeaker로 변경하고자 할 때,
    	volumeUp(), volumeDown() 두 개의 메소드를 모두 수정해야 한다. 
    [결론] 위의 두가지 문제점을 해결하는 방법은 => DI를 적용 
 */

public class SamsungTV implements TV{
	//추가 
	private SonySpeaker speaker; 
	@Override  //어노테이션 
	public void powerOn() {
		System.out.println("SamsungTV ===> 전원을 켠다.");
	}
	@Override
	public void volumeUp() {
		speaker = new SonySpeaker();
		speaker.volumeUp();
	}

	@Override
	public void volumeDown() {
		speaker = new SonySpeaker();
		speaker.volumeDown();
	}


	@Override
	public void powerDown() {
		System.out.println("SamsungTV ===> 전원을 끈다.");		
	}

}
