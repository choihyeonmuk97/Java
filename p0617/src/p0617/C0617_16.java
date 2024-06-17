package p0617;

import java.util.Scanner;

public class C0617_16 {

	public static void main(String[] args) {
//		int sum = 0;
// 		for(int i=1; i<=10; i++) {
//			sum += i;
//			System.out.println(sum);
//		}
		
//		// 1~100 sum
//		int sum = 0;
//		for (int i=1; i<=100; i++) {
//			sum += i;					
//		}
//		System.out.println(sum);
//		
//		// 1~100까지 홀수만 더하기
// 		int sum2 = 0;
// 		for (int i=1; i<=100; i++) {
// 			if (i % 2 == 1) {
// 				sum2 += i;
// 			}
// 		}
// 		System.out.println(sum2);
 		
		// 10번 입력 받을 때 마다 더하기
		Scanner scan = new Scanner(System.in);
//		int sum = 0;
		
//		for (int i=1; i<=10; i++) {
//			System.out.println("숫자를 입력");	
//			int in = scan.nextInt();
//			sum += in;
//		}
//		System.out.println(sum);
		
		// 구구단 중첩 for
//		for (int i=2; i<=9; i++) {
//			System.out.printf("[ %d 단 ]\n",i);
//			for(int j=1; j<=9; j++) {
////				System.out.println(i+" * "+j+" = "+i*j);
//				System.out.printf("%d * %d = %d\t",i,j,i*j);
//			}
//			System.out.println();
//		}
		
		// 1~100 까지 합을 구하는데, sum 값이 150을 넘었을 때의 i 값과 sum 값을 출력
//		int sum = 0;
//		
//		for(int i=1; i<=100; i++) {
//			sum += i;
//			if (sum >= 150) {
//				System.out.printf("i : "+i+"\t");
//				System.out.printf("sum : "+sum);
//				System.out.println();
//			}
//		}
	
		
		// 1~10 합
//		int sum = 0;
//		int i = 0 ;
//		for (i=1; i<=10;i++) {
//			sum += i;
//		}
//		
//		System.out.println(i-1+" 까지의 합 : "+sum);
		
		// 구구단 홀수단 출력
		for (int i=2; i<=9; i++) {
			for (int j=1; j<=9; j++) {
				if(i%2==1) {
					System.out.printf("%d * %d = %d \n",i,j,i*j);
				}
			}
		}
		
		// continue 활용
		for (int i=2; i<=9; i++) {
			if(i%2==0) continue;
			System.out.printf("[ %d 단 ]\n",i);
			for(int j=1; j<=9; j++) {
				System.out.printf("%d * %d = %d\n",i,j,i*j);
			}
		}
		System.out.println();
		
	} // main

} // class
