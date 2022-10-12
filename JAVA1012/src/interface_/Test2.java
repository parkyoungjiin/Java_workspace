package interface_;

public class Test2 {

	public static void main(String[] args) {
		BumbleBee bum = new BumbleBee();
		
		bum.fight();
		bum.transform(BumbleBee.MODE_NORMAL);
		bum.transform(BumbleBee.MODE_AIRPLANE);
		bum.transform(BumbleBee.MODE_CAR);
		bum.speak();
		
	}

}
interface Fightable{
	public abstract void fight();
	
}

interface Transformable {
	public static final int MODE_CAR = 1, MODE_AIRPLANE =2, MODE_NORMAL =3;
	public abstract void transform(int mode);
}

interface Robot extends Fightable, Transformable {
	public abstract void speak();
}

class BumbleBee implements Robot {

	@Override
	public void fight() {
		System.out.println("로켓 발사");
	}

	@Override
	public void transform(int mode) {
		if(mode == Transformable.MODE_NORMAL) {
			System.out.println("자동차 모드");
		}else if(mode == Transformable.MODE_AIRPLANE){
			System.out.println("비행기 모드");
		}else {
			System.out.println("일반모드");
		}
	}
		

	@Override
	public void speak() {
		System.out.println("라디오로 말하기");
	}
	
}