package p0619;

import java.util.Scanner;

public class C0619_04 {

	public static void main(String[] args) {
		
		// quiz
		// 5,5 배열을 생성, 1 5개 나머지 0
		// 번호 확인 배열
		int[][] num = new int[5][5];
		for(int i=0; i<5; i++) {
			num[0][i] = 1;
		}

		// 번호 섞기
		int no = 0;
		int no1 = 0;
		int n = 0;
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				no = (int)(Math.random()*5);
				no1 = (int)(Math.random()*5);
				n = num[0][0];
				num[0][0] = num[no][no1];
				num[no][no1] = n;
			}
		}
		
		//-------------------
		
		// 번호 맞추기 화면
		String[][] lotto = new String[5][5];
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				lotto[i][j] = "♥";
			}
		} // string 배열
		
		while(true) {
			
			System.out.println("                      [좌표]");
			System.out.println("   |\t0\t1\t2\t3\t4\t");
			System.out.println("---------------------------------------------");
			for(int i=0; i<5; i++) {
				System.out.print(i+"  |\t");
				for(int j=0; j<5; j++) {
					System.out.print(lotto[i][j]+"\t");
				}
				System.out.println();
			}
			
			// 좌표 입력
			Scanner scan = new Scanner(System.in);
			System.out.println("---------------------------------------------");
			System.out.println("가로 좌표 입력 : ");
			int x = scan.nextInt();
			System.out.println("세로 좌표 입력 : ");
			int y = scan.nextInt();
			
			// num 배열에서 x,y 좌표값 비교
			// 1이면 당첨, 0이면 꽝
			
			// 이미 오픈한 좌표면 확인된 좌표 라고 출력

			if ((x<0 || x>=5) || (y<0 || y>=5)) {
				System.out.println("잘못된 좌표값 입니다. 다시 입력하세요(0~4)");
				System.out.println();
				continue;
			}
			
			if(lotto[x][y].equals("꽝") || lotto[x][y].equals("당첨")) {
				System.out.println("이미 확인된 좌표 입니다. 다른 좌표를 입력하세요.");
				System.out.println();
				continue;
			}

			if(num[x][y] == 1) {
				lotto[x][y] = "당첨";
			}else {
				lotto[x][y] = "꽝";
			}

			int cnt = 0;
			if(lotto[x][y].equals("당첨")) {
				cnt++;
			}
			
			if(cnt == 5) {
				System.out.println("전부 맞혔습니다. 프로그램을 종료합니다.");
				break;
			}
			
		} // while
		
		
		
		
		
		


//		System.out.println("                      [좌표]");
//		System.out.println("   |\t0\t1\t2\t3\t4\t");
//		System.out.println("---------------------------------------------");
//		for(int i=0; i<5; i++) {
//			System.out.print(i+"  |\t");
//			for(int j=0; j<5; j++) {
//				System.out.print(num[i][j]+"\t");
//			}
//			System.out.println();
//		}
		
		
		
		
	} // main

} // class
