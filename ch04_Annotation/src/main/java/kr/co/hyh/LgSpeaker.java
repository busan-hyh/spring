package kr.co.hyh;

import org.springframework.stereotype.Component;

@Component
public class LgSpeaker implements Speaker {

	@Override
	public void soundUp() {
		// TODO Auto-generated method stub
		System.out.println("¿¤Áö º¼·ý¾÷");
	}

	@Override
	public void soundDown() {
		// TODO Auto-generated method stub
		System.out.println("¿¤Áö º¼·ý´Ù¿î");
	}

}
