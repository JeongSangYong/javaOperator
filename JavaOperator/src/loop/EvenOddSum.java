package loop;

import java.util.Scanner;

/*
 * @ Date : 2015. 07. 13
 * @ Author : me
 * @ Story : for-loop + if 결합예제
 * */

public class EvenOddSum {
	/*
	 * 입력 받은수 (1) 부터 입력받은수(10) 가지의 수 중에서
	 * 각각 짝수의 합과 홀수의 합을 분리해서 출력하시오
	 * */
	public void calc() {
		int a=0, b=0, evenSum=0, oddSum = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("시작할 정수를 입력하시오");
		a = scanner.nextInt();
		System.out.println("마지막 정수를 입력하시오");
		b = scanner.nextInt();
		
		for(int i=a; i<=b; i++)
		{
			if( i%2 == 0 )
			{
				evenSum += i;
			}
			
			else			
			{
				oddSum += i;
				//oddSum = oddSum + i;
			}
			
		}
		
		System.out.println(a+" 부터" +b+"까지의 정수 중에서\n"
				+ "짝수의 합은"+ evenSum+"이고\n"
				+ "홀수의 합은"+ oddSum+"이다\n");
		
	}
}
