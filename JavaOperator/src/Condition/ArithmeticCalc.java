package Condition;

import java.util.Scanner;

/*
 * @ Date : 2015. 07. 09
 * @ Author : me
 * @ Story : 사칙연산 계산 프로그램
 * */

/*
 * 사칙연산 계산기
 * 덧셈, 뺄셈, 곱셈, 나눗셈(몫 : (), 나머지 : ())
 * 사칙연산 기호도 입력받는다. +, *, - , /
 * 
 * 출력결과
 * === 심플계산기 ===
 * 5 x 5 = 25
 * 5 + 5 = 10
 * 6 ÷ 5 = 1 (1)
 * 5 - 6 = -1
 * */

public class ArithmeticCalc {
	public void arithmetciCalc() {
		int a = 0, b = 0, msg = 0;
		String opcode = "";
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("연산할 첫번째 숫자를 입력하세요");
		a = scanner.nextInt();
		System.out.println("연산할 연산자를 입력하세요");
		opcode = scanner.next();
		System.out.println("연산할 두번째 숫자를 입력하세요");
		b = scanner.nextInt();
		
		if(opcode.equals("+")){
			msg = a+b;
		}
		else if(opcode.equals("-")){
			msg = a - b;
		}
		else if(opcode.equals("*")){
			msg = a * b;
		}
		else if(opcode.equals("/")){
			msg = a / b;
		}
		else{
			System.out.println("입력된 값이 올바르지 않습니다.");
		}
		
		System.out.println("=== 심플 계산기 ===");
		System.out.println(a+opcode+b+"="+msg);
	}
}
