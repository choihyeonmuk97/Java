package p0701;

import java.util.ArrayList;
import java.util.HashMap;

public class C0701_03 {

	public static void main(String[] args) {
		// Card list 가져오기
		Process p = new Process();
		ArrayList<Card> clist = p.clistAdd();
//		for(int i=0; i<clist.size(); i++) {
//			System.out.println(clist.get(i));
//			System.out.println(clist.get(i).getKind());
//		}
		
		// Students list 가져오기
//		ArrayList<Students> slist = p.slistAdd();
//		for(int i=0; i<slist.size(); i++) {
//			System.out.println(slist.get(i));
//			System.out.println(slist.get(i).getName());
//		}
		
		// 2개를 모두 가져오기;;
		HashMap<String, Object> map = p.listAdd();
		
		clist = (ArrayList<Card>)map.get("clist") ; 
		for(int i=0; i<clist.size();i++) {
			System.out.println(clist.get(i));
		}

		ArrayList<Students>slist = (ArrayList<Students>)map.get("slist") ; 
		for(int i=0; i<slist.size();i++) {
			System.out.println(slist.get(i));
		}
		
		
		
	} // main

} // class
