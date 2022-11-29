package io_2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex3 {

	public static void main(String[] args) {
//		자바 기본 데이터를 파일로 출력
		//1. FileOutputStream 객체 생성하여 출력할 파일 위치, 파일명 지정 
//		FileOutputStream fos = new FileOutputStream("c:\\temp\\data.txt");
		
		//2. DataOutputStream 객체를 생성하여 FileOutputStream 객체를 전달
		try (DataOutputStream dos = new DataOutputStream(
				new FileOutputStream("C:\\temp\\data.txt"))){
			
			dos.writeInt(100);
			dos.writeDouble(3.14);
			dos.writeUTF("홍길동");
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try (DataInputStream dis = new DataInputStream(
				new FileInputStream("C:\\temp\\data.txt"))){
			
			int num = dis.readInt();
			double dNum = dis.readDouble();
			String str = dis.readUTF();
			
			System.out.println("int형 진수 :" + num);
			System.out.println("double형	 진수 :" + dNum);
			System.out.println("문자열 :" + str);
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
