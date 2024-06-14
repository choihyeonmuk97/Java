package p0614;

import java.util.Scanner;

public class C0614_12 {

	public static void main(String[] args) {
		/* 
		Integer.parseInt() : 문자열을 숫자로 변경
		next(), nextLine(), nextInt(), nextDouble()
		charAT()
		*/
		
		// 대문자 입력하면 소문자로 출력
		Scanner scan = new Scanner(System.in);
		
		System.out.println("대문자 : ");
		String str = scan.next();
		char input = str.charAt(0); // 문자열에서 0번째 문자를 가져옴.
		System.out.println((char)(input+32));
//		System.out.println(str.toLowerCase()); // 문자열 소문자변환 메소드
				
		
		
	} // main

} // class
