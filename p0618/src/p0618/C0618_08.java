package p0618;

import java.util.Scanner;

public class C0618_08 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		// 로또
		// 45개의 로또 배열 생성
		int[] lotto = new int[45];
		for (int i=0; i<lotto.length; i++) {
			lotto[i]=i;
		}
		
		// 로또 배열 섞기
		int no = 0; // 랜덤 번호
		int t = 0; // 값을 저장함
		
		for(int i=0; i<300; i++) {
			t = (int)(Math.random()*45);
			t = lotto[0];
			lotto[0] = lotto[no];
			lotto[no] = t;
		}
		
		// 6개 번호 입력
		int[] myNum = new int[6];
		for (int i=0; i<myNum.length; i++) {
			System.out.printf("%d번째 번호 입력 : "+i);
			myNum[i] = scan.nextInt();
		}
		System.out.print("내 번호 : ");
		for (int i=0; i<myNum.length; i++) {
			System.out.print(myNum+" "); 
		}
		
		

	} // main

} // class
