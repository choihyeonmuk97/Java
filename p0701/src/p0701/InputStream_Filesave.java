package p0701;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class InputStream_Filesave {

	public static void main(String[] args) {
		File f = new File("c:/save1");
		if(!f.exists()) f.mkdir();
		
		try {
			FileInputStream fis = new FileInputStream("c:/save/n.jpg");
			FileOutputStream fos = new FileOutputStream("c:/save1/n2.jpg");
			while(true) {
				int read = fis.read();
				if(read == -1) break;
				fos.write(read);
			}
			
//			while((read = fis.read())!= -1) {
//				fos.write(read);
//			}
			
			fis.close();
			fos.close();
			System.out.println("이미지 파일이 저장되었습니다.");
		} catch (Exception e) {e.printStackTrace();} // try-catch
		
	} // main

} // class
