package p0701;

public class C0701_01 {

	public static void main(String[] args) {
		Card c = new Card();
//		c.setPassword("1111") ;
//		c.number = 15;  -> error : private 으로 접근 제한
		c.setNumber(12);
		System.out.println(c.getNumber());
//		System.out.println(c.getPassword("aaa"));
		System.out.println();
		
	} // main

} // class
