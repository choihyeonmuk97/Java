package p0617;

import java.util.Scanner;

public class C0617_11 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("종료할까요? (종료 : x)");
		String str = scan.next();
//		if (str.equals("x") || str.equals("X")) {
		if (str.equalsIgnoreCase("x")){
			System.out.println("프로그램 종료");
		}else {
			System.out.println("계속 실행");
		}
		
//		String str = null;
//		String str = "";
//		if (str != null && !str.equals(""))
//			str.charAt(0);
//		else
//			System.out.println("빈 문자 입니다.");
		

	}

}
