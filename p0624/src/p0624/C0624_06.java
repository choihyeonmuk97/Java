package p0624;

import java.util.Scanner;

public class C0624_06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] score = new int[3];
		score[0] = 100;
		score[1] = 99;
		score[2] = 90;
		
		
		int kor = 100;
		int eng = 99;
		int math = 90;
		System.out.println("현재 국어점수 : "+kor);
		System.out.println("현재 영어점수 : "+eng);
		System.out.println("현재 수학점수 : "+math);

		// 메소드 사용 
		Calculate c = new Calculate();
//		c.change(kor,eng,math);
		c.change(score);
		
//		kor = c.korChange(kor);
//		eng = c.engChange(eng);
//		math = c.mathChange(math);
	
//		System.out.println("변경된 국어점수 : "+kor);
//		System.out.println("변경된 영어점수 : "+eng);
//		System.out.println("변경된 수학점수 : "+math);
		System.out.println("변경된 국어점수 : "+score[0]);
		System.out.println("변경된 영어점수 : "+score[1]);
		System.out.println("변경된 수학점수 : "+score[2]);
		
	}

}
