package kr.co.hyh;

public class SamsungTV implements TV {
	
	private Speaker speaker;
	private Internet internet;
	
	// �Ű������� �߰��ϴ� ���
	public SamsungTV(Speaker speaker, Internet internet) {
		this.speaker = speaker;
		// ���ͳ� �Ű����� �߰�
		this.internet = internet;
	}
	
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
