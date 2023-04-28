package stock_Prj;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
			File f = new File("C:\\Users\\정해석\\교안\\자바심화\\day_data\\THTSKS010H00.dat");
			BufferedReader br = new BufferedReader(new FileReader(f));
			
			String readtxt;
			int Linecnt = 0;
			int n = 1;
			StringBuffer s = new StringBuffer();
			while(true) {
				char [] ch = new char[1000];
				n = br.read(ch);
				
				if (n == -1) break;
				
				for (char c : ch) {
					if (c == '\n') {
						System.out.printf("[%s]***\n", s.toString());
						s.delete(0, s.length());
					} else {
						s.append(c);
					}
				}
				
				Linecnt ++;
			}
			System.out.printf("[%s]***\n", s.toString());
			br.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
