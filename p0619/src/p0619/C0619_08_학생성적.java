package p0619;

import java.util.Scanner;

public class C0619_08_학생성적 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		final int STU = 20; // 전체 학생 수
		String[] stuNo = new String[STU];
		String[] name = new String[STU];
		int[][] score = new int [STU][4];
		double[] avg = new double[STU];
		int [] rank = new int[STU];
		String[] title = {"학번","이름","국어","영어","수학","합계","평균","등수"};
		int s_count = 0; // 입력 학생 수
		
		Loop1:while(true) {
			System.out.println("[학생성적 프로그램]");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 성적수정");
			System.out.println("0. 프로그램 종료");
			System.out.println("------------------");
			System.out.println("원하는 번호를 입력하세요 : ");
			int choice = scan.nextInt();
			scan.nextLine();
			
			switch(choice) {
			case 1:
				
				while(true) {
					System.out.println("[성적입력]");
					// 학번,이름,국,영,수,합계,평균,등수
					// 학번 자동부여 - S0001
					stuNo[s_count] = "S"+String.format("%04d", s_count+1);
					System.out.println("학생번호 : "+stuNo[s_count]);
					
					// 이름 입력
					System.out.println("이름을 입력하세요(0:취소) :  ");
					String temp = scan.nextLine();					
					if(temp.equals("0")) {
						System.out.println("이전화면 이동");
						System.out.println();
						break; // while break
					}
					name[s_count] = temp;
					
					// 점수 입력
					for(int i = 0; i<3 ; i++) {
						System.out.printf("%s 점수를 입력하세요 : ",title[i+2]);
						score[s_count][i] = scan.nextInt();
					}
					scan.nextLine();
					// 합계, 평균
					score[s_count][3] = score[s_count][0]+score[s_count][1]+score[s_count][2];
					avg[s_count] = score[s_count][3]/3.0;
					
					System.out.printf("학번 : %s, 이름 : %s \n",stuNo[s_count],name[s_count]);
					System.out.println("입력이 완료되었습니다.");
					System.out.println();
					
					s_count++;
				} // case1 - while
				break;
				
				
			case 2:
				System.out.println("[성적출력]");

				// 출력
				for(int i=0; i<title.length; i++) {
					System.out.print(title[i]+"\t");
				}
				System.out.println();
				System.out.println("--------------------------------------------------------");
				
				for (int i=0; i<s_count; i++) {					
					System.out.print(stuNo[i]+"\t");
					System.out.print(name[i]+"\t");
					System.out.printf("%d\t%d\t%d\t",score[i][0],score[i][1],score[i][2]);
					System.out.printf("%d\t%.2f\t",score[i][3],avg[i]);
					System.out.printf("%d\n",rank[i]);
				}
				System.out.println();
				break;
				
			case 3:
				System.out.println("[학생검색]");
				System.out.println("----------------------");
				System.out.println("성적을 수정할 학생 입력 : ");
				String search = scan.nextLine();
				
				// 검색
				int temp_no = -1;
				for(int i=0; i<s_count; i++) {
					if(name[i].equals(search)) {
						temp_no = i; // 찾는 학생이 검색되었을 경우
						System.out.printf("%s 학생이 검색되었습니다. \n",search);
						break;
					}
				}
				
				if(temp_no==-1) { // 찾는학생이 없을 경우
					System.out.println("찾는 학생이 없습니다. 다시 입력하세요.");
				}else {
					// 학생 검색 후 진행
					System.out.printf("[%s 성적수정] \n",search);
					System.out.println("----------------------");
					System.out.println("1. 국어점수 수정");
					System.out.println("2. 영어점수 수정");
					System.out.println("3. 수학점수 수정");
					System.out.println("----------------------");
					System.out.println("원하는 번호를 입력하세요 : ");
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
					case 2: // 영어
						System.out.printf("[%s점수 수정]\n",title[choice+1]);
						System.out.printf("현재 %s점수 : %d \n",title[choice+1],score[temp_no][choice-1]);
						System.out.println("-----------------------------");
						System.out.printf("변경할 %s점수를 입력하세요 : \n",title[choice+1]);
						score[temp_no][choice-1] = scan.nextInt();
						
						// 합계, 평균도 변경
						score[temp_no][3] = score[temp_no][0]+score[temp_no][1]+score[temp_no][2];
						avg[temp_no] = score[temp_no][3]/3.0;
						
						System.out.printf("변경된 %s점수 : %d \n",title[choice+1],score[temp_no][choice-1]);
						System.out.println();
						
						break;
					case 3: // 수학
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
					
					} // case3 - switch
					
				}
				
				System.out.println("입력이름 : "+search);
				
				
				break;
				
			case 0:
				System.out.println("[프로그램 종료]");
				break Loop1;
			default:
				break;
			} // main - while - switch
			
		} // main - while

	} // main

} // class
