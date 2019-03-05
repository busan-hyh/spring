package kr.co.hyh;

public class LgTV implements TV {
	
	private Speaker speaker;
	private Internet internet;
	
	// setter로 추가하는 경우
	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}
	
	public void setInternet(Internet internet) {
		this.internet = internet;
	}
	
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
