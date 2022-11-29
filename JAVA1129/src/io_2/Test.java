package io_2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.Buffer;

public class Test {

	public static void main(String[] args) {
		//BufferedReader 를 사용하여 입력받은 문자열을 OutputStream을 사용하여 출력
		
		InputStream io = System.in;
		
		InputStreamReader reader = new InputStreamReader(System.in);
		
		
//		InputStreamReader reader = new InputStreamReader(System.in);
//		int n = reader.read();
		
		// 향상된 입력 보조 스트림 BufferedReader 객체 생성 = String 단위 처리
		
		
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));OutputStream os = System.out){
			System.out.println("데이터를 입력하세요 : ");
			
			String str = br.readLine();
			
			System.out.println("");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
	}

}
