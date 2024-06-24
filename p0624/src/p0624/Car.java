package p0624;

public class Car {
	static int count = 0; 
	String serial_no;
	String color;
	String gearType;
	int door;
	// 초기화 블럭 - 생성자를 호출하기 전에 먼저 실행을 시켜준다.
	{
		count +=1;
		this.serial_no = "HD"+String.format("%04d",count);
	}
	Car(){}
	
	Car(String color){
		this.color = color;
	}
	
	Car(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	
}
