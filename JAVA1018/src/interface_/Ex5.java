package interface_;

public class Ex5 {

	public static void main(String[] args) {
		DesignerClient desinger = new DesignerClient();
		desinger.login();
		System.out.println("--------------------------------");
		
		DeveloperClient developer = new DeveloperClient();
		developer.login();
	}

}
interface LoginProcess{
	public abstract String login(String id, String pass);
	//인터페이스 내의 메서드는 추상메서드로 정의한 뒤에 오버라이드하여 각각 정의.
}
//디자이너
class Designer implements LoginProcess{
// 디자이너는 메서드에 전달되는 데이터가 정확한 지 확인하고 리턴값이 외부로 잘 전달되는지 확인한다.
	
	public String login(String id, String pass) {
		System.out.println("디자이너가 전달받은 아이디 : " + id);
		System.out.println("디자이너가 전달받은 패스워드 : " + pass);
		return "성공";
	}
	
}
class DesignerClient {
	Designer desinger = new Designer();
	public void login() {
		String id = "admin";
		String pass = "1234";
		String result = desinger.login(id, pass);
		System.out.println("로그인 결과 :" + result);
		
		if(result.equals("성공")) {
			
		}
	}
	
}

//개발자는 전달받은 값은 중요하지 않고, 전달받은 값을 사용하여 로그인 처리 작업 수행

class Developer implements LoginProcess{

	@Override
	public String login(String id, String pass) {
		System.out.println("개발자가 전달받은 아이디 : " + id);
		System.out.println("개발자가 전달받은 패스워드 : " + pass);
		System.out.println("아이디와 패스워드로 로그인 작업 처리 완료!");
		return "성공";
	}
}
class DeveloperClient{
	Developer developer = new Developer(); 
	
	public void login() {
		//디자이너가 전달할 아이디, 패스워드를 임의로 설정하여 전달하고
		//개발자 코드를 통해 로그인 작업을 수행한 후
		//리턴되어지는 값이 정상적인지 확인하면 된다.
		
		String result = developer.login("admin","1234");
		System.out.println("로그인 결과 :" + result);
	}
}
