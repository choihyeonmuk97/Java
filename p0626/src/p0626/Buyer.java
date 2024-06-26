package p0626;

import java.util.ArrayList;

public class Buyer {
	String userId ;
	String userPw ;
	int money;
	int bonusPoint;
	ArrayList list = new ArrayList(); // 객체 배열 선언
//	Product[] cart = new Product[10]; // 구매내역
//	int count;
	
	
	Buyer(){} // 기본 생성자
	
	Buyer(String userId, String userPw, int money, int bonusPoint){
		this.userId = userId;
		this.userPw = userPw;
		this.money = money;
		this.bonusPoint = bonusPoint;
		
	}
	
	// 구매 메소드 - 부모의 참조변수
	void buy(Product p) {
		if(money<p.price) {
			System.out.printf("잔액 부족(잔액 : %d 만원) \n",money);
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		list.add(p); // 객체 배열에 추가 - add()
//		cart[count++] = p; // 구매 물품 저장
		System.out.printf("%s 제품을 구매했습니다.(잔액 : %d 만원) \n",p.pName,money);
	}

	void summary() {
		System.out.println("[구매 내역]");
		int sum = 0;
		for(int i=0; i<list.size(); i++) {
			Product p = (Product)list.get(i);
			System.out.println(p.pName);
			sum += p.price;
		}
		System.out.println("총 구매 개수 : "+list.size());
		System.out.println("총 구매 금액 : "+sum);
	}
	
//	void buy(Refrigerator r) {
//		money -= r.price;
//		bonusPoint += r.bonusPoint;
//	}
	
	
	
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
}
