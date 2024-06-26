package p0626;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Car {
	
	static int count = 1;
	{ // 초기화 블럭
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
		this.serialNo = "C"+sdf.format(d)+String.format("%04d", count++);
	}
	
	Car(){} // 기본 생성자
	
	Car(String color, int door){
		this.serialNo = serialNo;
		this.color = color;
		this.door = door;
	}
	
	String serialNo;
	String color;
	int door;
}
