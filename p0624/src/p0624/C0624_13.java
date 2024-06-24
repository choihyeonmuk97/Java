package p0624;

import java.util.Scanner;

public class C0624_13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] title = {"학번","이름","국어","영어","수학","합계","평균","등수"};
		String stuNo, name;
		int kor,eng,math,total,rank;
		double avg;
		
		System.out.println("학생성적 프로그램");
		System.out.println("----------------");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 성적수정");
		System.out.println("4. 학생검색");
		System.out.println("5. 등수처리");
		System.out.println("0. 프로그램 종료");
		System.out.println("-----------------");
		System.out.println("번호를 입력하세요 : ");
		int choice = scan.nextInt();
		scan.nextLine();
		
		while(true) {
			switch(choice) {
			case 1:
				System.out.println("학생성적입력");
				System.out.println("이름을 입력하세요(0 : 이전 페이지) : ");
				name = scan.nextLine();
				
				if(name.equals("0")) {
					System.out.println("이전 페이지로 이동합니다.");
					System.out.println();
					break;
				}
				
				System.out.println("국어 점수 : ");
				kor = scan.nextInt();
				System.out.println("영어 점수 : ");
				eng = scan.nextInt();
				System.out.println("수학 점수 : ");
				math = scan.nextInt();
				scan.nextLine();
				
				break;
			case 2:
				break;
			case 0:
				System.out.println("프로그램 종료");
				break;
			}
		}
		

	} // main

} // class
