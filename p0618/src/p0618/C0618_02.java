package p0618;

import java.util.Scanner;

public class C0618_02 {

	public static void main(String[] args) {
		// if 문으로
		Scanner scan = new Scanner(System.in);
		System.out.println("주민번호 입력 : ");
		String str = scan.nextLine();
		
		String year = str.substring(0,2);
		String cent = str.substring(7,8);
		int age = 0;
		
		if(cent.equals("1") || cent.equals("2")) {
			age = 2024 - Integer.parseInt("19"+year);
			System.out.println(age);
			
		}else if (cent.equals("3") || cent.equals("4")) {
			age = 2024 - Integer.parseInt("20"+year);
			System.out.println(age);
			
		}

	}

}
