package p0624;

import java.util.Arrays;

public class C0624_07 {

	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		int[] result = new int[4];  
		
		// Element 메소드 활용하여 a,b 사칙연선 결과 값 출력
		
		Element e = new Element();
		e.allCal(a, b, result);
		
		System.out.println("합 : "+result[0]);
		System.out.println("차 : "+result[1]);
		System.out.println("곱 : "+result[2]);
		System.out.println("나눔 : "+result[3]);
		
		
	}

}
