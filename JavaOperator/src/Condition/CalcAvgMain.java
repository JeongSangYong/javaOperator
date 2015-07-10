package Condition;

import java.util.Scanner;

/*
 * @ Date : 2015. 07. 09
 * @ Author : me
 * @ Story : if-else 예제
 * */
/*
 * 학생	국어	영어	수학	총점	평균	합격여부
 * --------------------------------
 * 홍길동	90	90	90	270	90	장학생
 * 
 * 평균이 90 이상이면 장학생
 * 평균이 70~90 미만 합격
 * 평균 70미만이면 불합격
 * */
public class CalcAvgMain {
	public static void main(String[] args) {
		int guk=0, eng=0, math=0 ,avg=0, max=0;
		String name;		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("이릅을 입력하세요");
		name = scanner.next();	
		System.out.println("국어점수를 입력하세요");
		guk = scanner.nextInt();
		System.out.println("영어점수를 입력하세요");
		eng = scanner.nextInt();
		System.out.println("수학점수를 입력하세요");
		math = scanner.nextInt();
		
		max = guk + eng + math;
		avg = max/3;

		
		System.out.println("학생\t 국어\t 영어\t 수학\t 총점\t 평균\t 합격여부");
		System.out.println("-----------------------------------------------------");	
		
		System.out.print(name);
		System.out.print("\t" + guk);
		System.out.print("\t" + eng);
		System.out.print("\t" + math);
		System.out.print("\t" + max);
		System.out.print("\t" + avg);
		
		if(avg >= 90)
		{
			System.out.println("\t장학생입니다.");
		}
		else if(avg >=70 && avg <90 )
		{
			System.out.println("\t합격");
		}
		else 
		{
			System.out.println("\t불합격");
		}
	}
}
