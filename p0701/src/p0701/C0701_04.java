package p0701;

public class C0701_04 {

	public static void main(String[] args) {
		for(int i=0; i<300; i++) {
			System.out.println(i+":"+"-");
		}
		
		for(int i=0; i<300; i++) {
			System.out.println(i+":"+"|");
		}
		
		C0701_04 c = new C0701_04();
		int n = c.max(20,10);
		System.out.println(n);

	} // main

		int max(int a,int b) {
			return a>b?a:b;
		}
		
		


} // class
