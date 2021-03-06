package util;

import java.util.Arrays;
import java.util.Scanner;

/*
 * [문제] 키보드로 배열의 크기를 입력받은 후
 *       해당 배열에 정수 값을 배열의 크기만큼 입력을 받는다.
 *       입력 받은 데이터를 Arrays 클래스의 sort() 메서드를
 *       이용하여 오름차순으로 정렬 후 화면에 오름차순으로 정렬된 배열을 출력해 보자.
 *       내림차순으로도 정렬을 해 보자.
 */

public class Ex05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// 배열의 크기 입력
		System.out.print("배열의 크기를 입력하세요. : ");
		int[] arr = new int[sc.nextInt()];
		
		// 배열의 값 입력
		System.out.println(arr.length+"만큼 정수를 순서대로 입력하세요 : ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println();
		
		// 오름차순으로 정렬 후 출력
		// Arrays.sort() 메서드를 이용하자.
		Arrays.sort(arr);
		
		System.out.println("오름차순 정렬");
		for(int k : arr) {
			System.out.print(k+"\t");
		}
		System.out.println();
		System.out.println();
		
		// 내림차순으로 정렬 후 출력
		System.out.println("내림차순 정렬");
			for(int k=arr.length-1; k>=0; k--) {
			System.out.print(arr[k]+"\t");
		}
		
		sc.close();
	}

}
