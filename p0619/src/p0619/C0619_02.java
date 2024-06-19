package p0619;

public class C0619_02 {

	public static void main(String[] args) {
//		// 1~45 로또 번호 생성, 랜덤으로 섞은 후 출력하기
//		
//		// 1. 로또 배열 생성
//		int[] ball = new int[45];
//		for(int i=0; i<ball.length; i++) {
//			ball[i] = i+1;
//		}
//
//		// 2. 생성된 배열을 무작위로 섞기
//		int no = 0; // ball 배열의 no 번째 방의 숫자와 바꿀 자리를 랜덤 값 지정
//		int imsi = 0; // ball 배열의 번호를 임시로 저장
//		
//		for(int i=0; i<300; i++) { // 무작위로 300번 섞기
//			no = (int)(Math.random()*45); // 0~44 무작위 숫자 생성
//			imsi = ball[0]; // ball[0]자리의 숫자를 임시로 저장
//			ball[0] = ball[no]; // 값이 없는 ball[0] 자리에 ball[no] 숫자를 저장
//			ball[no] = imsi; // 또 저장
//		}
//		
//		// 3. 무작위로 섞인 배열 출력
//		for(int i=0; i<ball.length; i++) {
//			System.out.print(ball[i]+" ");
//		}
//		System.out.println();
		

		
		int[][] arr = new int[5][5];
		// 2차원 배열에 1~25 번호를 넣고 랜덤으로 섞은 후 출력하기		
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = 5*i+(j+1);
			}
		}
		
		// 배열 섞기
		int no = 0;
		int no1 = 0;
		int n = 0;
		for (int i=0; i<300; i++) {
			no = (int)(Math.random()*5);
			no1 = (int)(Math.random()*5);
			n = arr[0][0];
			arr[0][0] = arr[no][no1];
			arr[no][no1] = n;
		}
		
		// 출력
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
		
		// ball 이용
		
//		int[] ball = new int[25];
//		for(int i=0; i<ball.length; i++) {
//			ball[i] = i+1;
//		}
		
//		for(int i=0; i<arr.length; i++) {
//			for(int j=0; j<arr[i].length; j++) {
//				arr[i][j] = ball[5*i+j];
//			}
//		}
//
//		for(int i=0; i<arr.length; i++) {
//			for(int j=0; j<arr[i].length; j++) {
//				System.out.print(arr[i][j]+"\t");
//			}
//			System.out.println();
//		}
		
		
		
	} // main

} // class
