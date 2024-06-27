package p0627;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class C0627_06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("파일 이름 입력 : ");
		String fileName = scan.nextLine();
		
		if(fileName.equals("") || fileName == null)
			fileName = "제목없음";
		
		File f = new File("c:/save/"+fileName+".txt");
		
		try {
			f.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
		System.out.println("파일 1개가 저장되었습니다.");
		
	}

}
