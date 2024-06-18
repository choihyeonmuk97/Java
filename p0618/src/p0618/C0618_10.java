package p0618;

import java.util.Scanner;

public class C0618_10 {

	public static void main(String[] args) {
		// 1~100 까지 랜덤 숫자 생성, 랜덤 숫자를 맞추는 프로그램
		// 숫자를 입력해서 큰(작은) 수를 입력하세요
		// 10번까지만
		Scanner scan = new Scanner(System.in);
		int[] input = new int[10];
		int ranNum = (int)(Math.random()*100)+1;
		
		int i = 0;
		int num = 0;
		while (i<10) {
			System.out.println("숫자를 입력하세요 : ");
			num = scan.nextInt();
			System.out.println("랜덤 번호 : "+ranNum);
			// 유효값 확인
			if(num<1 || num>100) {
				System.out.println("1~100 까지의 숫자만 입력 가능합니다.");
				continue;
			}
			
			input[i] = num; // 입력한 번호를 저장함
			i++;

			if(num>ranNum) {
				System.out.println("작은 수를 입력하세요.");
			}else if(num<ranNum) {
				System.out.println("큰 수를 입력하세요.");
			}else {
				System.out.println("정답입니다.");
				break;
			}
		}
//		System.out.println("랜덤 번호 : "+ranNum);
		System.out.print("입력 번호 : ");
		for(int j=0; j<i; j++) {
			System.out.print(input[j]+" ");
		}
		System.out.println();
		
		// 정답을 못 맞췄을 때 가장 근사치의 값을 출력
		int temp=0; // 값을 저장
		int arr_no=0; // 저장 위치
		if(i ==10) {
			
			int[] no = new int[10]; 
			for(int k=0; k<no.length; k++) {
				no[k] = Math.abs(ranNum-input[k]);										
			}
			
			for(int k = 0; k<10; k++) {

				if(temp>=no[k]) {
					arr_no = k;
					temp = no[k];
				}
			}
			
			System.out.println(input[arr_no]);
			
			System.out.print("근사치 : ");
			for(int k=0;k<10;k++) {
				System.out.print(no[k]+" ");
			}
			System.out.println();
		}
		
		
//			if (num!=ranNum) {
//				System.out.println("다 틀렸습니다 ㅋㅋ");
//				no = Math.abs(ranNum-input[k]);
//				
//				System.out.println(no);
//				
//			}
		
		
		
		
		
	} // main

} // class
