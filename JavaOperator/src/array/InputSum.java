package array;

import java.util.Scanner;

/*
 * @ Date : 2015. 07. 13
 * @ Author : me
 * @ Story : int형 배열 입력예제
 * */

public class InputSum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int sum=0,avg=0;
		System.out.println("3개의 점수를 입력하세요");
		int[] arr = new int[3];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		//입력된 값을 출력
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
		//입력된 합산
		
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];			
		}
		System.out.println("\n3개의 점수의 합은 :"+sum);
		//avg = sum / 3;
		avg = sum / arr.length;
		System.out.println("3개의 점수의 평균 :"+avg);
		
	}
}
