package ifCondition;

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
public class CalcAvgPro {
	public static void main(String[] args) {
		//선언부
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
		} else if((avg >= 70)&&(avg < 90)) {
			msg = "합격";
		}else{
			msg = "불합격";
		}
		System.out.println("학생	국어	영어	수학	총점	평균	합격여부");
		System.out.println(" --------------------------------");
		
		System.out.println(name+"\t"+kor+"\t"+eng+"\t"+math+"\t"+sum+"\t"+avg+"\t"+msg);

	}
}
