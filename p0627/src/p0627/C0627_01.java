package p0627;

public class C0627_01 extends Object{

	public static void main(String[] args) {
//		Marine m = new Marine(); //추상클래스를 상속받은 클래스 -> 객체선언 가능
//		Unit u = new Unit(); //추상클래스는 미완성클래스. 객체선언을 해도 사용할 수가 없다
		Marine m = new Marine();
		System.out.println("현재 체력 : "+m.hitPoint);
		Tank t = new Tank();
		System.out.println("현재 체력 : "+t.hitPoint);
		DropShip d = new DropShip();
		System.out.println("현재 체력 : "+d.hitPoint);

		System.out.println("탱크가 포탄을 맞았습니다.");
		hpDown(t);
		hpDown(t);
		hpDown(t);
		hpDown(t);
		hpDown(t);
		System.out.println("Tank 현재 체력 : "+t.hitPoint);
		hpDown(d);
		hpDown(d);
		System.out.println("DropShip 현재 체력 : "+d.hitPoint);
		hpDown(m);
		hpDown(m);
		hpDown(m);
		System.out.println("Marine 현재 체력 : "+m.hitPoint);

		// SCV 는 기계를 수리할 수 있는 능력
		Scv s = new Scv(); // scv 1대
		s.repair(t);
		System.out.println("Tank 현재 체력 : "+t.hitPoint);

		System.out.println("수송선 수리를 진행합니다.");
		s.repair(d);
		System.out.println("DropShip 현재 체력 : "+d.hitPoint);

		System.out.println("마린을 수리를 진행합니다.");
//		s.repair(m);
		System.out.println("Marine 현재 체력 : "+m.hitPoint);



	}
	static void hpDown(Unit u){
		u.hitPoint -= 10;

	}

}
