package p0701;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputStream {

	public static void main(String[] args) {
		
		// 기본적인 InputStream의 형태
		try {
			FileInputStream fis = new FileInputStream("c:/save/aaa.txt");
			int read = 0;
				while((read = fis.read())!= -1) { // fis.read() 파일의 데이터를 읽어와 read 에 데이터 입력 / read = -1이면 종료
					System.out.println((char)read);
				}
		} catch (Exception e) {e.printStackTrace();}
		
		
//		try {
//			FileInputStream fis = new FileInputStream("c:/save/aaa.txt");
//			int read = 0;
//			try {
//				while((read = fis.read())!= -1) { // fis.read() 파일의 데이터를 읽어와 read 에 데이터 입력 / read = -1이면 종료
//					System.out.println((char)read);
//				}
//			} catch (IOException e) {e.printStackTrace();}
//			
//		} catch (FileNotFoundException e) {e.printStackTrace();}
		
		
//		byte[] b = new byte[1024];
//		try {
//			FileInputStream fis = new FileInputStream("c:/save/aaa.txt");
//			fis.read(b);
//			System.out.println(new String(b));
//			
//		} catch (FileNotFoundException e) {e.printStackTrace();}
		
	} // main

} // class
