package stuPjt;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Students {
	static int count = 1; // 
	{ // 초기화 블럭 (학번 자동 부여)
		Date d = new Date(); 
		SimpleDateFormat sdf = new SimpleDateFormat("yy");
		this.stuNo = "S"+sdf.format(d)+String.format("%03d", count++);
	}
	
	Students(){} // 기본 생성자
	
	Students(String name, int kor, int eng, int math){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total =kor+eng+math;
		this.avg = this.total/3.0;
	} // 인스턴스 생성자
	
	String stuNo, name;
	int kor,eng,math,total,rank;
	double avg;
	
	
	
} // class
