package operator;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		/*
		 * order
		 * 스캐너를 이용하여 두값을 받은후 사칙연산
		 * ex) 20 + 7 = 27
		 * ex) 20 * 7 = 140
		 * */
		int a=0, b=0, add=0, sub=0, mul=0, div=0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("연산할 숫자를 입력하시오");
		a = scanner.nextInt(); //next는 커서 다음 글자(숫자)를 의미
		System.out.println("연산할 숫자를 입력하시오");
		b = scanner.nextInt();
		
		add = a+b;
		sub = a-b;
		mul = a*b;
		div = a/b;
		
		System.out.println(a+"+"+b+"="+add);
		System.out.println(a+"-"+b+"="+sub);
		System.out.println(a+"*"+b+"="+mul);
		System.out.println(a+"/"+b+"="+div);
		
	}
}
