package p0617;

import java.util.Scanner;

public class C0617_12 {

	public static void main(String[] args) {
		// 점수를 입력 받아 90 A~F 를 출력
		// 90~92 A-, 97~100 A+
		Scanner scan = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요 :");
		int num = scan.nextInt();
		String score = "";
		if (num>=90) {
			score = "A";
			if (num>=97) score = score+"+";
			else if (num<=92) score = score+"-";
		}else if (num>=80) {
			score = "B";
			if (num>=87) score = score+"+";
			else if (num<=82) score = score+"-";
		}else if (num>=70) {
			score = "C";
			if (num>=77) score = score+"+";
			else if (num<=72) score = score+"-";
		}else if (num>=60) {
			score = "D";
			if (num>=67) score = score+"+";
			else if (num<=62) score = score+"-";
		}else score = "F";
		
		System.out.println(score);
		
		} // main

	} // class


