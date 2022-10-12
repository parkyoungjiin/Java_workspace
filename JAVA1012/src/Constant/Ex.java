package Constant;

public class Ex {

	public static void main(String[] args) {
		/*
		 * 상수
		 * 
		 */
		//차량정보 저장
		CarInfo ci = new CarInfo();
		ci.setCompany("현대");
		ci.setCompany("소나타");
		ci.setCompany("0x000000"); 
		
		
		// 차량정보 비교
		if(ci.getCompany() =="현대") {
			System.out.println("현대차 입니다");
		}else {
			System.out.println("현대차가 아닙니다.");
		}
		
		if(ci.getCarModeName() == "소나타") {
			System.out.println("소나타 임");
		}else {
			System.out.println("소나타 아님");
		}
		
		
		
	}//main 끝

}

class CarInfoWithConstant{
	private String company;
	private String carModeName;
	private int color;
	// 1. 제조사 정보를 문자열로 저장하는 상수 선언
	public static final String COMPANY_HYUNDAI ="HYUNDAI";
	public static final String COMPANY_KIA ="KIA";
	public static final String COMPANY_CHEVORLET ="CHEVORLET";

	//2. 차량 모델 정보 저장
	public static final String CAR_MODEL_NAME_SONATA = "SONATA";
	public static final String CAR_MODEL_NAME_K5 = "K5";
	public static final String CAR_MODEL_NAME_SPARK = "SPARK";
	//3. 차량 색상 정보 정수로 저장
	public static final int COLOR_PERPECT_BLACK = 0x000001;
	public static final int COLOR_CREAM_WHITE = 0x000001;
	public static final int COLOR_BARCELONA = 0x000001;

}
class CarInfo{
	private String company;
	private String carModeName;
	private int color;
	
	// -------------company---------------
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	// --------------CarModeName--------------
	public String getCarModeName() {
		return carModeName;
	}
	public void setCarModeName(String carModeName) {
		this.carModeName = carModeName;
	}
	// -----------------Color----------
	
	public int getColor() {
		return color;
	}
	public void setColor(int color) {
		this.color = color;
	}
	
	// ---------------Color(int)--------------
	
}
