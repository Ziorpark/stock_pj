package stock_Prj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main2 {
	// 파일 정제
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		File f = new File("C:\\Users\\정해석\\교안\\자바심화\\day_data\\THTSKS010H00.dat");
		BufferedReader br = new BufferedReader(new FileReader(f));
		
		File f1 = new File("C:\\Users\\정해석\\교안\\자바심화\\day_data\\StockDailyPrice.csv");
		BufferedWriter bw1 = new BufferedWriter(new FileWriter(f1));
		
		String readtxt;
		int cnt = 0; int wcnt = 0;
		while((readtxt = br.readLine()) != null) {
			StringBuffer s = new StringBuffer();
			String[] field = readtxt.split("%_%");
			
			if (field.length > 2 && field[2].replace("^", "").trim().substring(0,1).equals("A")) {
				s.append(field[0].replace("^","").trim());
				for (int j = 1; j < field.length; j++) {
					s.append("." + field[j].replace("^", "").trim());
				}
				bw1.write(s.toString());
				bw1.newLine();
				wcnt++;
			}
			cnt ++;
		}
		
		br.close();
		bw1.close();
		
		System.out.printf("Program END [%d][%d] records\n", cnt, wcnt);
	}

}
