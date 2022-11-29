package io_2;

import java.io.OutputStream;

public class Ex {

	public static void main(String[] args) {
		
		char ch = 'A';
		
		try(OutputStream os = System.out) {
			os.write(ch);
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}

}
