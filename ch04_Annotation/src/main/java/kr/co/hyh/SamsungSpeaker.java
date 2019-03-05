package kr.co.hyh;

import org.springframework.stereotype.Component;

@Component
public class SamsungSpeaker implements Speaker {

	@Override
	public void soundUp() {
		// TODO Auto-generated method stub
		System.out.println("»ï¼º º¼·ý¾÷");
	}

	@Override
	public void soundDown() {
		// TODO Auto-generated method stub
		System.out.println("»ï¼º º¼·ý´Ù¿î");
	}

}
