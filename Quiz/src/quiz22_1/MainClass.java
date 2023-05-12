package quiz22_1;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class MainClass {
	public static void main(String[] args) {
		
	
		/*
		 * 1.버퍼리더를 사용해서 건담.txt를 읽어들입니다.
		 * 2.정규표현식을 이용해서 날짜, 지점, 등급, 내용, 가격 을 정규표현식으로 패턴분석
		 * Product객체에 저장하고 리스트에 저장
		 * 
		 * 3.외부라이브러리 (POI) - 자바에서 엑셀파일로 xlsx 형태로 파일을 쓸 수 있도록하는 기능
		 *   하나에 시트에 각 행데이터를 엑셀로 파일로 출력 
		 *   
		 */
		List<Product> list = new ArrayList<>();
		String path = "C:\\Users\\user\\Desktop\\coures\\java\\work\\Quiz\\src\\quiz22_1\\건담.txt";
	
		try(BufferedReader br = new BufferedReader(new FileReader(path))) {	
		
			String str;
			while((str = br.readLine()) != null) {
				String pattern1 = "\\d+-\\d+-\\d+";
				String pattern2 = "[가-힣]+\s[가-힣]+";
				String pattern3 = "\\[[A-Z가-힣]+\\]";
				
				String pattern5 = "\\d+,*\\d+원";

				Matcher m1 = Pattern.compile(pattern1).matcher(str);
				Matcher m2 = Pattern.compile(pattern2).matcher(str);
				Matcher m3 = Pattern.compile(pattern3).matcher(str);
				
				Matcher m5 = Pattern.compile(pattern5).matcher(str);
				
				if(m1.find()&& m2.find() && m3.find() && m5.find()) {
					System.out.println("==============00");
					String day = m1.group(); 
					String store = m2.group();
					String grade = m3.group();
					String detail = str.substring(m3.end() + 1,m5.start() - 1);
					String price = m5.group();
					
					//1행을 Product객체에 저장
					Product product = new Product(day, store, grade, detail, price);					
					//product를 리스트
					list.add(product);			
				}
			}//end while
			
			createExcel(list);
		
				
		} catch (Exception e) {
				
			e.printStackTrace();
		}
	
	}

	public static void createExcel(List<Product> list){
		XSSFWorkbook workbook = new XSSFWorkbook();
		//시트
		XSSFSheet sheet = workbook.createSheet();
		//시트안에 행
		XSSFRow row1 = sheet.createRow(0);
		row1.createCell(0).setCellValue("날짜");
		row1.createCell(1).setCellValue("지점");
		row1.createCell(2).setCellValue("등급");
		row1.createCell(3).setCellValue("상세");
		row1.createCell(4).setCellValue("가격");
		
		//리스트를 엑셀파일
		for(int i = 0; i <list.size(); i++) {
			
			XSSFRow row = sheet.createRow(i+1);
			Product product = list.get(i); //리스트 안에 객체
			
			row.createCell(0).setCellValue(product.getDay());
			row.createCell(1).setCellValue(product.getStore());
			row.createCell(2).setCellValue(product.getGrade());
			row.createCell(3).setCellValue(product.getDetail());
			row.createCell(4).setCellValue(product.getPrice());
		}
		
		
		String path = "C:\\Users\\user\\Desktop\\coures\\java\\work\\Quiz\\src\\quiz22_1\\건담.xlxs";	
			
		try (FileOutputStream fos = new FileOutputStream(path)){
			
			workbook.write(fos);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
