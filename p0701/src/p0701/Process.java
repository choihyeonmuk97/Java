package p0701;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Process {
	ArrayList<Card> clist = new ArrayList();
	ArrayList<Students> slist = new ArrayList();
	
	// Card list 보내기
	ArrayList<Card> clistAdd(){
		clist.add(new Card(1,"CLOVER"));
		clist.add(new Card(2,"CLOVER"));
		clist.add(new Card(3,"CLOVER"));
		clist.add(new Card(4,"CLOVER"));
		clist.add(new Card(5,"CLOVER"));
		return clist;
	}

	public Process() {}


	// Students list 보내기
	ArrayList<Students> slistAdd(){
		slist.add(new Students("홍길동",100,100,99));
		slist.add(new Students("유관순",90,90,99));
		slist.add(new Students("이순신",80,80,99));
		slist.add(new Students("김구",70,70,99));
		slist.add(new Students("강감찬",60,60,99));
		return slist;
	}
	
	// 2개를 모두 보내기
	HashMap<String, Object> listAdd() {
//		Map<String, Object> map = new HashMap<String, Object>();
		HashMap<String, Object> map = new HashMap();
		map.put("clist", clistAdd());
		map.put("slist", slistAdd());
		
		return map;
	}

	
	
	
}
