package kr.co.hyh;

public class SamsungTV implements TV {
	
	private Speaker speaker;
	private Internet internet;
	
	// 매개변수로 추가하는 경우
	public SamsungTV(Speaker speaker, Internet internet) {
		this.speaker = speaker;
		// 인터넷 매개변수 추가
		this.internet = internet;
	}
	
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
