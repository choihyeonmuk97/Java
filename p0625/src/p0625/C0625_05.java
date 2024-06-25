package p0625;

public class C0625_05 {

	public static void main(String[] args) {
		Time t = new Time();
		t.setHour(12); 
//		t.day = 50;
		
		System.out.println("현재 시각 : "+t.getHour()+" 시");
//		System.out.println("현재 일자 : "+t.day+" 일");
	}

}
