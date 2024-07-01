package p0701;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.tools.FileObject;

public class OutputStream {
	
	public static void main(String[] args) throws Exception {
		
		FileOutputStream fos = new FileOutputStream("c:/save/abc.txt");
		String str = "S0001,홍길동,100,100,100,300,100.0,0\r\n";
		str += "S0002,유관순,50,50,50,150,50.0,0\r\n";
		byte[] bytes = str.getBytes();
		for(byte b : bytes) {
			fos.write(b);
		}
		
		
//		try {
//			// 1byte 씩 저장
//			FileOutputStream fos1 = new FileOutputStream("c:/save/abc.txt");
//			String str1 = "S0001,홍길동,100,100,100,300,100.0,0\r\n";
//			str1 += "S0002,유관순,50,50,50,150,50.0,0\r\n";
//			byte[] bytes1 = str.getBytes();
//			for(byte b : bytes) {
//				// 단순 for 문
//				try {
//					fos.write(bytes);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		}
				
				
				
				
//		파일, 폴더 생성
//		String str = "c:/save1";
//		File folder = new File(str);
//		File file = new File(str+"/15.txt");
//		try {
//			if(!(folder.exists())) { 
//				System.out.println("폴더를 생성했습니다.");
//				folder.mkdirs(); // 지정 폴더가 없는 경우 폴더를 생성
//			}
//			file.createNewFile();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		
		System.out.println("파일이 생성되었습니다.");
				
				
	} // main
	
} // class


