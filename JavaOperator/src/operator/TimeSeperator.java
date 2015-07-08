package operator;

import java.util.Scanner;

public class TimeSeperator {
	public static void main(String[] args) {
		/*
		 *입력받은 초를 시간 분 초로 환산하는 프로그램 
		 *입력받는 초를 60으로 나눈 나머지가 초
		 *그 연산에서 나온 몫을 다시 60으로 나머지가 분
		 *윗 연산에서 나온 몫이 시간
		 */
		Scanner scanner = new Scanner(System.in);
		
		int a=0, h=0, m=0, s=0,b=0;
		System.out.println("초를 입력하세요 : ");
		a = scanner.nextInt();
		
		s = a % 60;
		m = (a / 60) % 60;
		h = (a / 60) / 60;
		
		System.out.println("입력한"+a+"초는"+h+"시간"+m+"분"+s+"초");
	}
}
