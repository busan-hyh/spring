package kr.co.hyh;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.stereotype.Component;

@Component("ltv")
//이름을 ltv로 지정. 보통 안함
public class LgTV implements TV {
	
	// @Component로 생성된 speaker, internet객체를 여기로 주입, @Inject 하는것
	// 인터페이스 주입
	@Resource(name="lgSpeaker")
	private Speaker speaker;
	// 클래스 주입
	@Inject
	private Internet internet;

	
	@Override
	public void power() {
		// TODO Auto-generated method stub
		System.out.println("엘지 전원켬");
	}

	@Override
	public void chUp() {
		// TODO Auto-generated method stub
		System.out.println("엘지 채널업");
	}

	@Override
	public void chDown() {
		// TODO Auto-generated method stub
		System.out.println("엘지 채널다운");
	}

	@Override
	public void soundDown() {
		// TODO Auto-generated method stub
		speaker.soundDown();
	}

	@Override
	public void soundUp() {
		// TODO Auto-generated method stub
		speaker.soundUp();
	}
	@Override
	public void connect() {
		// TODO Auto-generated method stub
		internet.connect();
	}
	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		internet.disconnect();
	}

}
