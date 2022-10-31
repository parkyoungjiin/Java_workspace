package java_util_package;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Ex5 {

	public static void main(String[] args) {
		
		/*
		 * 날짜 및 시각 정보에 대한 형식화(Formatting)
		 * - 날짜 또는 시각 정보를 원하는 형식으로 변환하는 과정
		 * - SimpleDateFormat 클래스와 DateTimeFormatter 클래스 사용
		 *   1) SimpleDateFormat : Date 타입 객체에 대한 형식화
		 *   2) DateTimeFormatter : LocalXXX 타입 객체에 대한 형식화
		 *   
		 * < 형식 문자 >
		 * 기호		의미		표현		예
		 * ------------------------------------------
		 *   y		연도		yyyy, yy	2022, 22
		 *   M		월			MMM, MM		06월, 06
		 *   d		일			dd			01
		 *   E		요일		EEEE, E		화요일, 화
		 *   H		시(24시)	HH			15
		 *   K		시(12시)	KK			3
		 *   m		분			mm			02
		 *   s		초			ss			30
		 *   a		오전/오후	a			오전 또는 오후
		 */
		//1. today라는 date 객체 생성
		Date today = new Date();
		System.out.println(today);
		
		String pattern = "yyyy년 MM월 dd일 EEEE";
		
		SimpleDateFormat sdf = new SimpleDateFormat(pattern); //pattern 변수를 통해 형식을 저장
		
		System.out.println(sdf.format(today));
		
		pattern = "yyyy/MM/dd(E) a HH:mm:ss";
		SimpleDateFormat sdf2 = new SimpleDateFormat(pattern);
		
		System.out.println(sdf2.format(today));
		
		
		//2. now라는 LocalDateTime 객체 생성
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);
		System.out.println();
	}// main 메서드 끝

}
