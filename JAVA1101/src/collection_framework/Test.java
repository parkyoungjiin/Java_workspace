package collection_framework;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
//		Set<Integer> thisWeekLotto = new TreeSet<Integer>();
//		thisWeekLotto.add(4);
//		thisWeekLotto.add(5);
//		thisWeekLotto.add(8);
//		thisWeekLotto.add(11);
//		thisWeekLotto.add(34);
//		thisWeekLotto.add(45);

		//위 작업을 asList로 한 줄로 작성이 가능하다.
		Set<Integer> thisWeekLotto = new TreeSet<Integer>(Arrays.asList(7, 8, 11, 13, 15, 23)); //asList는 static 정적 메서드
		System.out.println("이번 주 로또 1등 번호 : " + thisWeekLotto);
//myLotto 생성
		Set<Integer> myLotto = new TreeSet<Integer>();
		
		Random rnd = new Random();
		
		while(myLotto.size() < 6 ) { //myLotto.size() =! 6 도 가능
			myLotto.add(rnd.nextInt(46));
		}
		
		System.out.println("내 로또 번호 : " + myLotto);
		Integer[] myLottoArr = myLotto.toArray(new Integer[0]);
		Integer[] thisWeekLottoArr = thisWeekLotto.toArray(new Integer[0]);

		// 당첨번호와 일치하는 개수 카운팅
		int count = 0; // 결과 저장 변수
		
		//비교 방법
		//1. 향상된 for문 사용
		for(int num : myLotto) { //내 로또 번호를 num에 하나씩 꺼냄
			if(thisWeekLotto.contains(num)) {//꺼낸 값과 이번 주 로또 값을 비교하여 참일 경우 count 값 증가
				count++;
			}
		}
		
		System.out.println(count);
		
		switch (count) {
		case 4:
			System.out.println("3등"); break;
		case 5:
			System.out.println("2등"); break;
		case 6:
			System.out.println("1등"); break;
		default : System.out.println("꽝!");
			
		}
		
		
		//2. Iterator 사용
		Iterator<Integer> ite = myLotto.iterator();
		while(ite.hasNext()) {
			int num = ite.next();
			if(thisWeekLotto.contains(num)) {
				count++;
			}
		
		}
		
			
			
//			if(myLottoArr[i] == thisWeekLottoArr[i]) {
//				
//			}
			
		
	}

}
