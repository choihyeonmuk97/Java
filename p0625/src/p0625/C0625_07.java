package p0625;

public class C0625_07 {

	public static void main(String[] args) {
		Car c = new Car();
		Car c2 = null;
		Ambulance a = new Ambulance();
		Ambulance a2 = null;
		FireEngine f = new FireEngine();
		FireEngine f2 = null;

		// 다형성 : 부모의 참조변수로 자손의 객체를 다루는 것
		
//		a2 = (Ambulance)c; - error : 자손의 참조변수로 조상의 객체 안됨
		
		c = a;
		if (c instanceof Ambulance) {
			System.out.println("가능");
			c = a;
		}
		a2 = (Ambulance)c;
		
//		// 형변환 - 자손타입에서 조상타입 : 형변환 타입 생략 가능
//		a.siren();
//		c2 = a;
//		c2.drive();
////		c2.siren(); // 부모의 참조변수로는 사용할 수 없음
//		
//		a2 = (Ambulance)c2;
//		a2.siren();
////		c2 = (Car)a;
//		
//		// 조상에서 자손 : 형변환 타입 무조건 붙여야 함 
//		a2 = (Ambulance)c2;
		
	}

}
