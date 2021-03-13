package beepere.spring.polymorphism;

public class SamsungTV implements TV{
	private Speaker speaker;//Speaker 인터페이스 타입의 멤버변수
	private int price; //int price 멤버변수
	

	public void setSpeaker(Speaker speaker) {
		System.out.println("setSpeaker() 메서드 호출");
		this.speaker = speaker;
	}
	
	public void setPrice(int price) {
		System.out.println("setPrice() 메서드 호출");
		this.price = price;
	}
	
	public SamsungTV(Speaker speaker) {
		System.out.println("SamsungTV 객체 생성");
		this.speaker = speaker;
	}

	public SamsungTV(AppleSpeaker speaker, int price) {
		System.out.println("SamsungTV 객체 생성: 생성자 인젝션");
		this.speaker = speaker;
		this.price = price;
	}
	
	
	public void powerOn() {
		System.out.println("SamsungTV 전원을 켠다. 가격: "+price+")");
	}
	
	public void powerOff() {
		System.out.println("SamsungTV 전원을 끈다.");
	}
	
	public void volumeUp() {
		speaker.volumeUp();
	}
	
	public void volumeDown() {
		speaker.volumeDown();
	}
}
