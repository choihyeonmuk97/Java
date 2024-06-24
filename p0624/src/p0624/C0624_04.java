package p0624;

import java.util.Scanner;

public class C0624_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 3개의 수를 입력받아 더한 값을 출력하기
		
		int[] num = new int[3];
		
		for(int i=0; i<3; i++) {	
			System.out.println("숫자 입력 : ");
			num[i] = scan.nextInt();	
		}
		
		// 객체 선언 후 참조변수명,변수명
		Cal c = new Cal();
		int result = c.add(num[0],num[1],num[2]);
		
		int sum = c.add2(num);
		
		System.out.println("결과 : "+result);
		
		
//		int sum = 0;
//
//		for(int i=0; i<3; i++) {			
//			System.out.println("숫자 입력 : ");
//			num[i] = scan.nextInt();				
//			sum += num[i];
//		}
//		System.out.println("합 : "+sum);
		
		
	} // main

} // class
