package kr.co.hyh;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
//�׳� @Component�� ���̸� samsungTV �ձ��ڰ� �ҹ��ڷ� ������ 
public class SamsungTV implements TV {
	
	// @Inject�� ���� ���� ����Ʈ�� ���� ��
	// �������̽� ����, �̸��� ������ �� �ִ� Resource ���. ��� ���� �Ⱦ�
	@Resource(name="samsungSpeaker")
	private Speaker speaker;
	// Ŭ���� ����
	@Autowired 
	private Internet internet;
	

	@Override
	public void power() {
		// TODO Auto-generated method stub
		System.out.println("�Ｚ ������");
	}

	@Override
	public void chUp() {
		// TODO Auto-generated method stub
		System.out.println("�Ｚ ä�ξ�");
	}

	@Override
	public void chDown() {
		// TODO Auto-generated method stub
		System.out.println("�Ｚ ä�δٿ�");
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
