package p0626;

import java.util.Scanner;

public class C0626_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Buyer b = new Buyer("aaa","1111",10000000,0);
		while(true) {	
			System.out.println("ID : ");
			String id = scan.next();
			System.out.println("PW : ");
			String pw = scan.next();
			
			if(b.userId.equals(id) && b.userPw.equals(pw)) {
				System.out.println("로그인 성공!");
				break;
			}else {
				System.out.println("아이디 또는 비밀번호가 일치하지 않습니다.");
			}
			
		}
		
		System.out.println("접속완료");
		
	} // main

} // class
