package p0619;

import java.util.Scanner;

public class C0619_01 {

	public static void main(String[] args) {
		// 로또 프로그램 구현
		// 1~45 까지의 배열을 랜덤으로 섞어, 그 가운데 6개를 가져옴
		// 입력한 번호 6개와 비교하여 맞은 번호 비교
		
		Scanner scan = new Scanner(System.in);
		
		// ball 배열을 만들고 1~45 숫자 입력
		int[] ball = new int[45];
		for(int i=0; i<45; i++) {
			ball[i] = i+1;
		}
		
		// ball 배열 섞기
		int no = 0; // 0번째 배열과 바꿀 배열 번호
		int n_value = 0; // ball 배열의 숫자 임시 저장 공간
		
		for(int i=0; i<300; i++) {
			no = (int)(Math.random()*45);
			n_value = ball[0]; // ball[0]번째 방의 숫자를 임시로 n_value에 저장
			ball[0] = ball[no]; // 랜덤 ball[no] 번째 방의 숫자를 ball[0]에 대입
			ball[no] = n_value; // 빈 ball[no]번째 방의 숫자에 임시로 저장한 n_value값을 다시 대입
			
		}
		
		// 나의 번호 입력
		int[] my_ball = new int[6];
		for(int i=0; i<6; i++) {
			System.out.printf("%d번째 번호를 입력하세요 : ",i+1);
			my_ball[i] = scan.nextInt();
		}
		
		// 입력 번호 출력
		System.out.print("입력 번호 : ");
		for (int i=0; i<6;i++) {
			System.out.printf("%4d",my_ball[i]);
		}
		System.out.println();
		
		// ball 배열 출력
		System.out.print("로또 번호 : ");
		for (int i=0; i<6;i++) {
			System.out.printf("%4d",ball[i]);
		}
		System.out.println();
		
		// 당첨 개수
		int count = 0;
		int[] coNum = new int[6];
		for(int i=0; i<6; i++) {
			for(int j=0; j<6; j++) {
				if (ball[i]==my_ball[j]) {
					coNum[count] = ball[i];
					count++;
					break;
				}
			}
		}
		System.out.println("당첨 개수 : "+count);
		
		// 당첨된(일치한) 번호 출력
		System.out.print("당첨 번호 : ");
		for(int i=0; i<count; i++) {
			System.out.print(coNum[i]+" ");
		}
		if (count==0) System.out.print("없음");
		
		System.out.println();
		
		
		


	} // main

} // class
