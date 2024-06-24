package p0624;

import java.util.Scanner;

public class Calculate {
	static Scanner scan = new Scanner(System.in);
	
	// 메소드 1개를 사용해서 처리하는 방법
//	void change(int kor, int eng, int math) {
	void change(int[] score ) {
		System.out.println("변경 점수 입력(국어) : ");
//		kor = scan.nextInt();
		score[0] = scan.nextInt();
		
		System.out.println("변경 점수 입력(영어) : ");
//		eng = scan.nextInt();
		score[1] = scan.nextInt();
		
		System.out.println("변경 점수 입력(수학) : ");
//		math = scan.nextInt();
		score[2] = scan.nextInt();
		
		
//		System.out.println("변경된 국어점수 : "+kor);
//		System.out.println("변경된 영어점수 : "+eng);
//		System.out.println("변경된 수학점수 : "+math);
		
	}
	
	// 
	int korChange(int kor) {
		System.out.println("변경 점수 입력 : ");
		kor = scan.nextInt();
		return kor;
	}
	int engChange(int eng) {
		System.out.println("변경 점수 입력 : ");
		eng = scan.nextInt();
		return eng;
	}
	int mathChange(int math) {
		System.out.println("변경 점수 입력 : ");
		math = scan.nextInt();
		return math;
	}
	
	
	
//	int result = 0;
//	
//	int cal(int arr[], String str) {
//		
//		switch(str) {
//		case "+":
//			result = arr[0] + arr[1];
//			break;
//		case "-":
//			result = arr[0] - arr[1];
//			break;
//		case "*":
//			result = arr[0] * arr[1];
//			break;
//		case "/":
//			result = arr[0] / arr[1];
//			break;
//		}
//		
//		
//		return result;
//	}
		
	
}
