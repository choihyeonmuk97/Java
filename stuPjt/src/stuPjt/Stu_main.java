package stuPjt;

import java.util.*;


public class Stu_main {

	public static void main(String[] args) {
		// ArrayList 변수 선언
		ArrayList list = new ArrayList();
		list.add(new Students("홍길동",100,100,99));
		list.add(new Students("유관순",89,87,99));
		list.add(new Students("이순신",90,90,92));
		list.add(new Students("김구",100,99,99));
		list.add(new Students("김유신",50,80,71));
		list.add(new Students("홍길자",90,99,98));
		list.add(new Students("홍길순",80,85,98));
		Stu_process sp = new Stu_process(); // 객체 선언
		
		while(true) {
			int choice = sp.screen(list);
			
			switch(choice) {
			case 1: // 학생 성적 입력
				sp.stu_input(list);
				break;
			case 2: // 학생 성적(전체) 출력
				sp.stu_print(list);
				break;
			case 3:
				break;
			} // switch
			
		} // while
		
	} // main
	
} // class
