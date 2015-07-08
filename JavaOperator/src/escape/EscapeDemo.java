package escape;

import java.util.Scanner;

public class EscapeDemo {
	public static void main(String[] args) {
		/*
		 * 문제. 홍길동씨는 30세이고
		 * 		김유신씨는 25세이다.
		 * 		홍길동씨와 김유신씨의 나이차이를 출력하는데
		 * 		"홍길동씨는 김유신보다 5세가 많습니다." 
		 */
		// 지역변수 선언부 
		int hongAge = 0, kimAge = 0, age = 0;
		String hong = "", kim = "";
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("홍길동의 나이를 입력하세요(30)");
		hongAge = scanner.nextInt();
		
		System.out.println("김유신의 나이를 입력하세요(25)");
		kimAge = scanner.nextInt();
		
		System.out.println("이름을 입력하세요(홍길동)");
		hong = scanner.next();
		
		System.out.println("이름을 입력하세요(김유신)");
		kim = scanner.next();
		
		age = hongAge - kimAge;
		System.out.println(hong+"씨는\t"+kim+"씨와\t"+age+"살 \n차이가납니다");		
	
		/*
		 escape 문자 (\t, \n)처럼 아파벳에 \를 첨부하여 특수한 기능을 나타내도록 한 문법 
		 */
	}
}
