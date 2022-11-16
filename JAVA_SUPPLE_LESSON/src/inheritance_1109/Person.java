package inheritance_1109;

public class Person {

//public -> 프로젝트 내의 모든 패키지 내에서 클래스를 사용 가능하다.
		private String name;

		public Person() {
			super();
		}

		public Person(String name) {
			this.name = name;
		}
		
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public void talk() {
			System.out.println("Person - 말하기");
		}
		public void jump() {
			System.out.println("Person - 뛰기");
		}
}
