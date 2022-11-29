package io_2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Ex5 {

	public static void main(String[] args) {
		
		// 입력받아 파일로 출력하는 방법
		
		//-------------------입력받기 (inputStream, inputStreamReader, BufferedReader)--------------
//		InputStream is = System.in;
//		
//		InputStreamReader isr = new InputStreamReader(is);
//		
//		BufferedReader buffer = new BufferedReader(isr);
		
		// 위 3개의 문장을 (입력) 한 줄로 표현
//		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		// => Scanner sc = new Scanner(System.in); 으로 표현 가능
		
		
		//--------------파일---------------
		File f = new File("c:\\temp\\readme.txt");
		
//		FileWriter fw = new FileWriter(f);
//		PrintWriter pw = new PrintWriter(fw);
		
		
		//위 문장을 한 문장으로 표현
//		PrintWriter out = new PrintWriter(new FileWriter(f));
		
		try(BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
				PrintWriter out = new PrintWriter(new FileWriter(f))) {
			
			String str = buffer.readLine();
			out.println(str);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		

	}

}
