package kr.co.hyh;

public class SamsungTV implements TV {
	
	@Override
	public void power() {
		System.out.println("Samsung TV 전원 켬");
	}
	
	@Override
	public void chUp() {
		System.out.println("Samsung TV 채널 위로");
	}
	
	@Override
	public void chDown() {
		System.out.println("Samsung TV 채널 아래로");
	}
}
