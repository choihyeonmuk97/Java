package p0617;

public class C0617_17 {

	public static void main(String[] args) {
		// 1~100 중 랜덤 숫자 10개 생성 -> 합계
		int sum = 0;
		
		for (int i=1; i<=10; i++) {
			int num = (int)(Math.random()*100)+1;
			sum += num;
			System.out.println("생성 숫자 : "+num);
			System.out.println("현재까지의 합 : "+sum);
		}
		System.out.println("총합 : "+sum);
	} // main

} // class
