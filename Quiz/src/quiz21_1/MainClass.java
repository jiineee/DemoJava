package quiz21_1;

import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainClass {
	public static void main(String[] args) {
		
		
		List<Data> list = new ArrayList<>();
		
		
		String path = "C:\\Users\\user\\Desktop\\coures\\java\\work\\Quiz\\bin\\quiz21\\주택도시보증공사_전국 평균 분양가격.csv";
		
		try(BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(path) , "EUC-KR"))) {
			br.readLine();//제목 한번 넘어감
			
			String str;
			while((str = br.readLine()) != null) {
				
				
				String[] arr = str.split("," , 5);
				
				String region = arr[0];
				String size = arr[1];
				String year = arr[2];
				String month = arr[3];
				String price = arr[4].replace(" ", "").replace(",", "").replace("\"", "").replace("-", "");
				
				price = price.equals("") ? "0" : price; //공백이라면, 0 대입 : 그대로
				
				System.out.println(Integer.parseInt(price));
				
				Data data = new Data(region,size,year,month,price);
				list.add(data); //리스트에 추가
			}
			System.out.println(list.size());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
