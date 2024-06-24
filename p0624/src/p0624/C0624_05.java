package p0624;

import java.util.Scanner;

public class C0624_05 {

	public static void main(String[] args) {
		// 입력받은 값 사칙연산 하긔 (2 숫자, 1 연산부호 입력받음)
		Scanner scan = new Scanner(System.in);
		
		int[] arr= new int [2];
		for (int i=0; i<arr.length; i++) {
			System.out.println("숫자 입력 : ");
			arr[i] = scan.nextInt();
		}
		System.out.println("연산 부호 : ");
		String str = scan.next();
		
//		System.out.println("숫자 입력 : ");
//		int x = scan.nextInt();
//		System.out.println("숫자 입력 : ");
//		int x2 = scan.nextInt();
//		System.out.println("연산 부호 : ");
//		String str = scan.next();
		
		// 배열 사용
		
		
		
		
		// cal() 메소드 사용
		// 인스턴스 메소드 = 객체 선언 후 참조변수명.메소드명
		Calculate c = new Calculate();
//		int result = c.cal(x, x2, str);
//		int result = c.cal(arr, str);
		
		
//		int result = 0;
//		switch(str) {
//		case "+":
//			result = x + x2;
//			break;
//		case "-":
//			result = x - x2;
//			break;
//		case "*":
//			result = x * x2;
//			break;
//		case "/":
//			result = x / x2;
//			break;
//		}
//		System.out.println(result);
		
		

		
		

	} // main

} // class
