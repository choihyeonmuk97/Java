package p0626;

import java.util.ArrayList;
import java.util.Scanner;


public class Stu_main {

	public static void main(String[] args) {
		//변수선언부분
		ArrayList list = new ArrayList();
		list.add(new Students("홍길동",100,100,99));
		list.add(new Students("유관순",89,87,99));
		list.add(new Students("이순신",90,90,92));
		list.add(new Students("김구",100,99,99));
		list.add(new Students("김유신",50,80,71));
		list.add(new Students("홍길자",90,99,98));
		list.add(new Students("홍길순",80,85,98));
		Stu_process sp = new Stu_process();

		l1:while(true) {
			int choice = sp.screen(list); // 화면 메소드 호출

			switch(choice) {
			case 1: // 학생성적 입력
				sp.stu_input(list);
				break;
			
			case 2: // 학생성적 출력
				sp.stu_print(list);
				break;
				
			case 3: // 학생성적 수정
				sp.stu_update(list);
				break;
			
			case 4: // 학생 삭제
				sp.stu_delete(list);
				break;
			
			case 5: // 학생검색
				sp.stu_search(list);
				break;
			
			case 6: // 등수처리
				sp.stu_rank(list);
				break;
				
			case 0:
				System.out.println("프로그램을 종료합니다.");
				break l1;
			} // switch
				
		} // while
		
	} // main

} // class
