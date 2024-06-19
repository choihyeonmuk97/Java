package p0619;

public class C0619_05 {

	public static void main(String[] args) {
		// [5,5] 배열 1~25 숫자 입력 후 랜덤섞고 출력
		int[][] arr = new int[5][5];
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = 5*i+(j+1);
			}
		}

		int no = 0;
		int no1 = 0;
		int n =0;
		for(int i=0; i<300; i++) {
			no = (int)(Math.random()*5);
			no1 = (int)(Math.random()*5);
			n = arr[0][0];
			arr[0][0] = arr[no][no1];
			arr[no][no1] = n;
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
		
		
	} // main

} // class
