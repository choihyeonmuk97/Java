package p0619;

import java.util.Scanner;

public class C0619_09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		final int STU = 20;
		String[] stuNo = new String[STU];
		String[] name = new String[STU];
		int[][] score = new int[STU][4]; // 국,영,수,합
		double[] avg = new double[STU];
		int[] rank = new int[STU];
		String[] title = {"학번","이름","국어","영어","수학","합계","평균","등수"};
		
		
		Loop1:while(true) {
			System.out.println("[학생성적 프로그램]");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 성적수정");
			System.out.println("0. 종료");
			System.out.println("--------------------");
			System.out.println("원하는 번호를 입력하세요 : ");
			int choice = scan.nextInt();
			scan.nextLine();
			int count = 0;
			
			switch(choice) {
			
			case 1:
				System.out.println("[성적입력]");
				// 학번이 알아서 따라온다
				stuNo[count] = "S"+String.format("%04d", count+1);
				System.out.println("학번 : "+stuNo[count]);
				
				
				System.out.println("이름 입력(0:취소) : ");
				String temp = scan.nextLine(); 
				if (temp.equals("0")) {
					System.out.println("이전화면으로 돌아갑니다.");
					break;
				}
				name[count] = temp;
				
				// 국,영,수
				for(int i=0; i<3; i++) {
					System.out.printf("%s점수를 입력하세요 : ",title[i+2]);
					score[count][i]= scan.nextInt();
				}
				// 합계, 평균
				score[count][3] = score[count][0]+score[count][1]+score[count][2];
				avg[count] = score[count][3]/3.0; // double
				
				System.out.printf("학번 : %s, 이름 : %s \n",stuNo[count],name[count]);
				System.out.println("입력 완료");
				System.out.println();				
				
				break;
				
			case 2:
				System.out.println("학생성적출력");
				
				// 입력 데이터 출력 
				for(int i=0; i<title.length; i++) {
					System.out.print(title[i]+"\t");
				}
				System.out.println();
				System.out.println("------------------------------------------------------------");
				
				for(int i=0; i<count; i++) {				
					System.out.print(stuNo[i]+"\t");
					System.out.print(name[i]+"\t");
					System.out.printf("%d\t%d\t%d\t",score[i][0],score[i][1],score[i][2]);
					System.out.printf("%d\t%.2f\t",score[i][3],avg[i]);
					System.out.printf("%d\n",rank[i]);
				}
				System.out.println();				
				break;
				
			case 3:
				System.out.println("학생검색");
				System.out.println("-------------------------------");
				System.out.println("수정할 학생을 입력하세요 : ");
				String search = scan.nextLine();
				
				int temp_no = -1; // 
				for(int i=0; i<count; i++) {
					if(name[i].equals(search)) {
						temp_no = i;
						System.out.printf("%s 학생이 검색되었습니다. \n",search);
						break;
					}
				}
				// 검색이 안될경우
				if(temp_no==-1) {
					System.out.println("학생이 없습니다. 다시 입력하세요.");
				}else {
					System.out.printf("%s 성적수정",search);
					System.out.println("-----------------------------");
					System.out.println("1. 국어 수정");
					System.out.println("2. 영어 수정");
					System.out.println("3. 수학 수정");
					System.out.println("-----------------------------");
					System.out.println("번호를 입력하세요.");
					choice = scan.nextInt();
					
					switch(choice) {
					case 1: // 국어
						System.out.printf("[%s점수 수정]\n",title[choice+1]);
						System.out.printf("현재 %s점수 : %d \n",title[choice+1],score[temp_no][choice-1]);
						System.out.println("-------------------------");
						System.out.printf("변경할 %s점수를 입력하세요 : \n",title[choice+1]);
						score[temp_no][choice-1] = scan.nextInt();
						
						// 합계, 평균도 변경
						score[temp_no][3] = score[temp_no][0]+score[temp_no][1]+score[temp_no][2];
						avg[temp_no] = score[temp_no][3]/3.0;
						
						System.out.printf("변경된 %s점수 : %d \n",title[choice+1],score[temp_no][choice-1]);
						System.out.println();
						break;
					case 2: // 수학
						break;
					case 3: // 영어
						break;
					} //case 3 - switch
					
					
				} // 큰 case3
				break;
				
				
				
				
			case 0:
				System.out.println("프로그램 종료");
				break Loop1;
				
			
			} // switch
						
			
		} // while
		
	} // main

} // class
