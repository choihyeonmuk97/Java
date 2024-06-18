package p0618;

import java.util.Arrays;

public class C0618_06 {

	public static void main(String[] args) {
		
		// int 배열 10개 선언 -> 1,3,5,7,9... 10개
//		int [] score = {1,3,5,7,9,11,13,15,17,19};
//		System.out.println(Arrays.toString(score));
		
		int [] s = new int[40];
		for (int i=0; i<s.length; i++) {
			s[i] = i*2+1;
		}
		System.out.println(Arrays.toString(s));
		
		
		
		// 배열 선언
//		int [] score = new int[5];
//		
//		// 초기화
//		score[0] = 1;
//		score[1] = 2;
//		score[2] = 3;
//		score[3] = 4;
//		score[4] = 5;
//		
//		// 배열 선언, 초기화
//		int [] sc = {1,2,3,4,5};
//		
//		int [] sc2 = new int[] {1,2,3,4,5};
//		
//		int [] s = new int[5];
//		for(int i=0; i<5; i++) {
//			s[i] = i+1;
//		}
		
		
		
	} // main

} // class
