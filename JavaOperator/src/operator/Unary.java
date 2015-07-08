package operator;

/*
 * @ Date : 2015. 07. 07
 * @ Author : me
 * @ Story : 단항 연산자 문법
 * */

public class Unary {
	/*
	 * 단항연산자
	 * i++(후위 연산자) 또는 ++i(전위 연산자)
	 * */
	
	public static void main(String[] args) {
		int i=0, j=0, x=0,y=0; // 지역변수는 디폴트값으로 초기화
		i=5;
		x=5;	
		System.out.println("i의값은"+i);
		//후위형은 변수값을 읽어온 후 연산한다.
		j = i++;
		System.out.println("j의값은"+j);
		//전위형은 x의 값을 증가시키고 연산한다.
		//i = i+1;	
		y = ++x;
		System.out.println("y의값은"+y);
	}
}
