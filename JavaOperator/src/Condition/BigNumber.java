package Condition;

import java.util.Scanner;

/*
 * 학생 3명의 점수를 입력받아서 가장 큰 수를 출력(점수는 1~100)
 * 결과
 * 1등은 98점입니다.
 * a 와 b 비교, b와 c를 비교, a 와 c를 비교
 * */

public class BigNumber {
	public static void main(String[] args) {
		int a = 0, b = 0, c = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("각각의 점수를 입력하세요 : ");
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
		
		/*
		 * 조건식을 따져서 결과를 가정하지 말고, 
		 * 결과를 상정한 다음 거기에 맞는 조건식을
		 * 설정
		 * */

		if ( a > b && a > c)
		{
			System.out.println("가장큰 수는 "+a+"입니다.");
		}
		else if(a < b && b > c)
		{
			System.out.println("가장큰 수는 "+b+"입니다.");
		}
		else
			System.out.println("가잔큰 수는 "+c+"입니다.");
				
	}
}
