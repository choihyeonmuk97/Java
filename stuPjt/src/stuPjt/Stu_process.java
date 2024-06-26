package stuPjt;

import java.util.*;

public class Stu_process {
	Scanner scan = new Scanner(System.in);
	String[] title = {"학번","이름","국어","영어","수학","합계","평균","등수"};
	
	String stuNo, name;
	int kor,eng,math,total,rank,choice;
	double avg;
	
	// 화면 메소드
	int screen(ArrayList list) {
		System.out.println("[학생성적 프로그램]");
		System.out.println("--------------------");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 성적수정");
		System.out.println("4. 학생삭제");
		System.out.println("5. 학생검색");
		System.out.println("6. 등수처리");
		System.out.println("7. 학생성적정렬");
		System.out.println("--------------------");
		System.out.println("원하는 번호 입력 : ");
		choice = scan.nextInt();
		scan.nextLine();
		return choice;
	} // screen
	
	// 1. 성적입력 메소드
	void stu_input(ArrayList list) {
		while(true) {
			System.out.println("학생 이름을 입력하세요(0.이전으로 이동) :");
			name = scan.nextLine();
			if(name.equals("0")) {
				System.out.println("이전으로 이동");
				System.out.println();
				break;
			}
			// 점수 입력
			System.out.printf("%s점수 : \n",title[2]);
			kor = scan.nextInt();
			System.out.printf("%s점수 : \n",title[3]);
			eng = scan.nextInt();
			System.out.printf("%s점수 : \n",title[4]);
			math = scan.nextInt();
			scan.nextLine();
			
			// list 에 저장
			list.add(new Students(name,kor,eng,math));
			
			System.out.printf("%s 학생 입력 완료. \n",name);
			System.out.println();
			
		} // while
		
	} // stu_input
	
	
	// 2. 성적출력 메소드
	void stu_print(ArrayList list) {
		System.out.println("                  [학생 성적 출력]");
		for(int i=0; i<title.length; i++) {
			System.out.printf("%s\t",title[i]);
		}
		System.out.println();
		System.out.println("-------------------------------------------------------------");
		for(int i=0; i<list.size(); i++) {
			Students s = (Students)list.get(i);
			System.out.printf("%s\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d \n",
					s.stuNo,s.name,s.kor,s.eng,s.math,s.total,s.avg,s.rank);
		}
		System.out.println();
	} // stu_print
	
	// 3. 성적수정 메소드
	void stu_update(ArrayList list) {
		// 검색 메소드 수정,삭제부분에서 같이 쓰여 분리
		int temp_no = stu_find(list); // 검색 메소드 사용
		
		// 학생을 찾지 못했을 경우
		if(temp_no == -1) { // 검색 메소드에서 temp_no 리턴 값 사용
			System.out.println("해당 학생이 없습니다. 다시 입력하세요");
			System.out.println();
		}
		
		// 학생을 찾고 리턴받은 값을 이용하여 학생 위치값을 찾음
		Students s =(Students)list.get(temp_no);
		
		// 수정 진행
		System.out.printf("        [%s 성적수정] \n",s.name);
		System.out.println("---------------------------------");
		System.out.println("1. 국어");
		System.out.println("2. 영어");
		System.out.println("3. 수학");
		System.out.println("---------------------------------");
		System.out.println("원하는 과목의 번호를 입력하세요 : ");
		choice = scan.nextInt();
		
		switch(choice) { // 각 과목마다 메소드의 반복으로 분리
		case 1: // 국어 점수 수정
			
			break;
		}
		
		
	}
	
	
	/*-------------------------------------------------------------------*/
	// 성적수정 및 삭제부분에서 해당 학생 검색 메소드
	int stu_find(ArrayList list) {
		System.out.println("[학생검색]");
		System.out.println("검색할 학생이름을 입력하세요 : ");
		String search = scan.nextLine();
		
		// 검색 부분
		int temp_no = -1; // 검색 위치 값(임의지정)
		for(int i=0; i<list.size(); i++) {
			Students s = (Students)list.get(i);
			if(s.name.equals(search)) {
				temp_no = i; // 검색한 이름이 있을 경우 temp_no를 i 값으로 바꿔 학생을 찾음
				System.out.printf("%s 학생이 검색되었습니다. \n",search);
				System.out.println();
				break; // 검색 후 for 문을 빠져나와 temp_no 값을 수정,삭제 부분에 전달
			} // if
		} // for
		return temp_no;
	} // stu_find
	
	// 과목별 성적 수정 메소드
	void sub_update(Students s, int score, int choice) {
		System.out.printf("[%s점수 수정] \n",title[choice+1]);
		System.out.printf("현재 %s점수 : %d \n",title[choice+1],score);
		System.out.println("---------------------------------------");
		System.out.printf("변경할 %s점수를 입력하세요 : \n",title[choice+1]);
		score = scan.nextInt();
		
		// 점수가 변경되었으니 합계, 평균도 수정되어야 함
		if(choice == 1) s.kor = score;
		else if(choice == 2) s.eng = score;
		else s.math = score;
		
		s.total = s.kor+s.eng+s.math;
		s.avg = s.total/3.0;
		System.out.printf("변경된 %s점수 : %d \n",title[choice+1],score);
		System.out.println();
		
	} // sub_update
	
	
} // class
