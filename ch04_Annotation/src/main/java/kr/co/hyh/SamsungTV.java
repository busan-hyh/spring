package kr.co.hyh;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
//그냥 @Component만 붙이면 samsungTV 앞글자가 소문자로 지정됨 
public class SamsungTV implements TV {
	
	// @Inject와 같은 역할 인젝트를 많이 씀
	// 인터페이스 주입, 이름을 적용할 수 있는 Resource 사용. 얘는 많이 안씀
	@Resource(name="samsungSpeaker")
	private Speaker speaker;
	// 클래스 주입
	@Autowired 
	private Internet internet;
	

	@Override
	public void power() {
		// TODO Auto-generated method stub
		System.out.println("삼성 전원켬");
	}

	@Override
	public void chUp() {
		// TODO Auto-generated method stub
		System.out.println("삼성 채널업");
	}

	@Override
	public void chDown() {
		// TODO Auto-generated method stub
		System.out.println("삼성 채널다운");
	}

	@Override
	public void soundUp() {
		// TODO Auto-generated method stub
		speaker.soundUp();
	}

	@Override
	public void soundDown() {
		// TODO Auto-generated method stub
		speaker.soundDown();
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
