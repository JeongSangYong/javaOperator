package controller;

import Condition.ArithmeticCalc;
import Condition.CalcAvg;
import Condition.SwitchAvg;
import loop.EvenOddSum;

public class OperatorController {
	public static void main(String[] args) {
		// 2015. 07. 09 성적계산기
		CalcAvg avg = new CalcAvg();
		//avg.calcAvg();
		
		// 2015. 07. 09 사칙연산 계산기
		ArithmeticCalc ar = new ArithmeticCalc();
		//ar.arithmetciCalc();
		
		//2015. 07. 10 스위치기반 성적계산기
		SwitchAvg sc = new SwitchAvg();
		//sc.calc();	//cacl 원 클래스의 메소드 이름이다.
		
		EvenOddSum evenOddSum = new EvenOddSum();
		evenOddSum.calc(); //객체가 메소드를 호출한다.
		
	}
}
