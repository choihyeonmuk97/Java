package p0627;

public class C0627_07 {

	public static void main(String[] args) {
		Person p1 = new Person(8801011011111L);
//		p1.id = 8801011011111L;
		
		Person p2 = new Person(8801011011111L);
		
		System.out.println(p1);
		System.out.println(p2);
		
		if(p1.equals(p2)) {
			System.out.println("ㅇㅇ");
		}else {
			System.out.println("ㄴㄴ");
		}
		
		Students s = new Students("홍길동",100,100,90);
		System.out.println(s);
		
		String str = "abc";
		System.out.println(str.hashCode());
		str = "abcd";
		System.out.println(str.hashCode());
		
	}

}
