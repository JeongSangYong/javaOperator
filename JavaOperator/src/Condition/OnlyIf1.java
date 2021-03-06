package Condition;

/*
 * @ Date : 2015. 07. 07
 * @ Author : me
 * @ Story : if만 있는 구문에 관한 문법
 * */

public class OnlyIf1 {
	public static void main(String[] args) {
		/*
		 * 구문(statement) 자바 연산식에서 3가지 종류의 구문으로 나뉜다. 
		 * 1.조건문 if, if-else, switch
		 * 2.반복문 while, do-while, for 
		 * 3.기타구문 continue, break, return
		 */
		int x = 1, y = 2;
		if (x==y) {
			System.out.println("숫자 x와 y의 값은 같다.");			
		}
		if (x != y) {
			System.out.println("숫자 x와 y의 값은 다르다.");
		}
		if (x > y) {
			System.out.println("숫자 x는 y보다 크다.");
		}
		if (x < y) {
			System.out.println("숫자 x는 y보다 작다.");
		}
		if (x >= y) {
			System.out.println("숫자 x는 y보다 크거나 같다.");
		}
		if (x <= y) {
			System.out.println("숫자 x는 y보다 작거나 같다.");
		}
		/*
		 * 한 구문은 반드시 하나의 견과만을 리턴하게끔 코딩되어야 하며
		 * only if문을 코딩할 때는 개발자가 단 한가지 케이스만 출력할 것이라는
		 * 확신이 있을 때 다룬다.
		 * */
	}
}
