package p0625;

public class Singleton {
	
	private int hour; // 인스턴스 변수
	private static Singleton s = new Singleton(); // 클래스 변수 - 객체 선언없이 사용
	
	private Singleton(){} // 기본 생성자
	
	// 클래스 메소드 
	public static Singleton getInstance() {
		return s;
	}
	
}
