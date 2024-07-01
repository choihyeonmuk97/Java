package p0701;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReader_C {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("c:/save/abc.txt");
			BufferedReader br = new BufferedReader(fr); // 1줄씩 가져온다
			while(true) {
				String line = br.readLine(); // 1줄 가져옴
				if(line == null)break;
				System.out.println(line);
			} // while

//			String rline = "";
//			while((rline = br.readLine())!= null) {
//				System.out.println(rline);
//			} // while
			
			fr.close();
			br.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		} // try-catch
		
	} // main

} // class
