package p0624;
import java.util.Scanner;
public class C0624_12 {
	public static void main(String[] args) {
		
		//변수선언부분
		Stu_score[] sc = new Stu_score[10]; //배열선언
		Stu_process sp = new Stu_process();
		
		
		while(true) {
			//화면 부분 메소드 호출
			int choice = sp.screen();

			switch(choice) {
			case 1: // 학생성적입력
				sp.stu_input(sc);
				break;
				
			case 2: // 학생성적출력
				sp.stu_output(sc);
				break;
			
			case 5:
				sp.stu_rank(sc);
				break;
			}//switch
			
		}//while	
		
	}//main
	
}//class