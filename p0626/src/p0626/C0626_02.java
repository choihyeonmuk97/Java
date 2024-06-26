package p0626;

public class C0626_02 {

	public static void main(String[] args) {
		Buyer b = new Buyer("aaa","1111",3000,0);
		
		
		// 구매
		Product t = new Tv();
		Product t2 = new Tv();
		
		b.buy(t);  // TV 1ea 
		b.buy(t2); // TV 1ea
		
		Product c = new Computer();
		b.buy(c); // computer
		
		Product a = new Audio();
		b.buy(a); // audio
		
		Product r = new Refrigerator();
		b.buy(r);
		b.buy(new Refrigerator());
		b.buy(new Audio()); 
		b.buy(new Audio()); 
		b.buy(new Audio()); 
		b.buy(new Audio()); 
		b.buy(new Refrigerator());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Tv());
		b.buy(new Tv());
		b.buy(new Tv());
		
		// cart 제품명, 가격 모두 출력
		b.summary();

//		System.out.println("[구매 내역]");
//		int sum = 0;
//		for(int i=0; i<b.list.size(); i++) {
//			Product p = (Product)b.list.get(i);
//			System.out.println(p.pName);
//			sum += p.price;
//		}
//		System.out.println("총 구매 개수 : "+b.list.size());
//		System.out.println("총 구매 금액 : "+sum);
		
	}

}
