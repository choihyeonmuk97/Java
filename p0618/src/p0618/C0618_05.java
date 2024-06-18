package p0618;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class C0618_05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] score = new int[5];
//		score[0]=1;
//		score[1]=2;
//		score[2]=3;
//		score[3]=4;
//		score[4]=5;
		
		System.out.println(score); // score 주소값
		System.out.println(Arrays.toString(score)); // 배열의 모든 데이터 확인하는 메소드
		
		// 배열에 입력
		for(int i =0; i<5; i++) {
			score[i] = i+1;
		}
		
		
//		for(int i =0; i<5; i++) {
//			
//			System.out.println("숫자입력 :");
//			score[i] = scan.nextInt();
//		}
		
//		System.out.println(score[3]);
		
		// 배열 출력
		for (int i=0; i<5; i++) {
			System.out.println(score[i]);
		}
		
	} // main

} // class
