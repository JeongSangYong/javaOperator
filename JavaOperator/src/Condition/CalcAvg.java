package Condition;

import java.util.Scanner;

public class CalcAvg {
	public void calcAvg() {
		// 선언부
		String name = "", msg = "";
		int kor = 0, math = 0, avg = 0, eng = 0, sum = 0;
		Scanner scanner = new Scanner(System.in);

		System.out.println("이릅을 입력하세요");
		name = scanner.next();
		System.out.println("국어점수를 입력하세요");
		kor = scanner.nextInt();
		System.out.println("영어점수를 입력하세요");
		eng = scanner.nextInt();
		System.out.println("수학점수를 입력하세요");
		math = scanner.nextInt();

		sum = kor + eng + math;
		avg = sum / 3;

		if (avg >= 90) {
			msg = "장학생";
		} else if ((avg >= 70) && (avg < 90)) {
			msg = "합격";
		} else {
			msg = "불합격";
		}
		System.out.println("학생	국어	영어	수학	총점	평균	합격여부");
		System.out.println(" --------------------------------");

		System.out.println(name + "\t" + kor + "\t" + eng + "\t" + math + "\t" + sum + "\t" + avg + "\t" + msg);
	}
}
