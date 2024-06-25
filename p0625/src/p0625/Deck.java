package p0625;

public class Deck {
	
	Card[] c = new Card[52]; // 배열 선언
	Card[] cc = new Card[5];
	String[] shape = {"SPADE","DIAMOND","HEART","CLOVER"};
	int count = 0;
	
	// 1,2,3,4,5,6,7,8,9,10
	Deck() {
		for(int i=0; i<52; i++) {			
			c[i] = new Card(i%13+1,shape[i/13]);
		}
	}
	
	// 카드 섞기 메소드
	void shuffle() {
		for(int i=0;i<300;i++) {
			int random = (int)(Math.random()*52); 
			Card temp = c[0];
			c[0] = c[random];
			c[random] = temp;
		}
	}
	
	Card pick() {
		Card card = c[count];
		count ++;
		
		return card;
	}
	
	Card pick(int n) {
		return c[n];
	}
	
	Card[] pick5() {
		for(int i=0; i<5; i++) {
			cc[i] = c[count++];   
		}
		return cc; 
	}
	
}
