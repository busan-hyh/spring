package kr.co.hyh;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.stereotype.Component;

@Component("ltv")
//�̸��� ltv�� ����. ���� ����
public class LgTV implements TV {
	
	// @Component�� ������ speaker, internet��ü�� ����� ����, @Inject �ϴ°�
	// �������̽� ����
	@Resource(name="lgSpeaker")
	private Speaker speaker;
	// Ŭ���� ����
	@Inject
	private Internet internet;

	
	@Override
	public void power() {
		// TODO Auto-generated method stub
		System.out.println("���� ������");
	}

	@Override
	public void chUp() {
		// TODO Auto-generated method stub
		System.out.println("���� ä�ξ�");
	}

	@Override
	public void chDown() {
		// TODO Auto-generated method stub
		System.out.println("���� ä�δٿ�");
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
