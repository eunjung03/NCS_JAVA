package sist;

import java.util.Scanner;

// 숫자 맞추기 게임

public class Ex31 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("*** 숫자 맞추기 게임 ***");
		
		int number = (int)(Math.random() * 99) + 1;
		
		System.out.println("1~99 사이의 숫자 중에서 하나의 숫자를 맞추세요.");
		
		int count = 0;		// 몇번 만에 맞추는지 카운트하는 변수
		int no = 0;			// 키보드로 입력받은 숫자
		
		while(no != number) {
			System.out.print("어떤 숫자일까?? >>> ");
			no = sc.nextInt();
			
			if(no > number) {
				System.out.println("더 작은 숫자입니다.");
			}else if(no < number) {
				System.out.println("더 큰 숫자입니다.");
			}
			System.out.println("::::::::::::::::::::::");
			count++;
		}
		System.out.println("축하합니다. 정답입니다.");
		System.out.println("정답 숫자 >>> " + number);
		System.out.println("정답 소요 횟수 >>> " + count);
		sc.close();
	}

}
