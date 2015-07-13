package array;

import java.util.Scanner;

/*
 * @ Date : 2015. 07. 13
 * @ Author : me
 * @ Story : int형 배열에서 입력값 중 최대값 구하기
 * */

public class InputMaxx {
	public static void main(String[] args) {
		int max = 0;
		
		System.out.println("3개의 점수를 입력하세요");
		Scanner scanner = new Scanner(System.in);
		
		// 배열 선언및 초기화
		int[] arr = new int[3];
		
		// for-loop으로 입력
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i] = scanner.nextInt();
		}
		// 비교
		max = arr[0];
		
		for (int i = 0; i < (arr.length)-1; i++) 
		{
			if(arr[i+1] > max)
			{
				max = arr[i+1];
			}
		}

		System.out.println("3개의 정수중 최대값 : "+max);
	}
}
