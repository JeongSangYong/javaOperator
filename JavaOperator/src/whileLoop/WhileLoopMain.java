package whileLoop;

/*
 * @ Date : 2015. 07. 09
 * @ Author : me
 * @ Story : While Loop
 * */

public class WhileLoopMain {
	//loop : 순환의 의미
	//인덱스 값을 통해 순환 횟수를 설정하고 limit값을 통해 마감인덱스까지만 회전
	/*
	 * while loop은 limit 값을 알 수 있는 상황과 없는 상화 두가지 버전으로 사용된다.
	 * 
	 * limit값이 설정된 경우
	 * */
	public static void main(String[] args) {
		int idx = 1;
		while (idx < 11) {
			System.out.println(idx);
			idx++;
		}
	}
}
