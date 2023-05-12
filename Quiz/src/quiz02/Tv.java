package quiz02;

public class Tv {

	String company = "LG"; //회사
	int channel; //채널
	boolean power; //전원
	
	/*
	 * 메서드
	 * changeChannel : int - 매개변수 채널번을 받아서 
	 * 채널을 변경, 채널을 리턴
	 * 
	 * power : void - 켜져있으면 꺼지고, 꺼져있으면 켜지고 동작될 수 있도록
	 * 
	 */

	
	int changeChannel(int c) {
		channel = c;
		System.out.println("채널변경:" + channel);
		return channel;
	}
	
	void power() {
		if(power) {
			power = false;
			System.out.println("tv off");
		}else{
			power = true;
			System.out.println("tv on");
		}
		
	}
	
}
