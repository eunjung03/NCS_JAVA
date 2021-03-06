package sist;

import java.util.Scanner;

/*
 * [문제] Ex18 예제를 switch~case문으로 변경하여 출력해 보세요.
 */

public class Ex22 {

	public static void main(String[] args) {

		// 메뉴 선택
		Scanner sc = new Scanner(System.in);
		
		System.out.println("*** 메뉴를 선택하세요. ***");
		System.out.println("1. Pizza");
		System.out.println("2. 돈까스");
		System.out.println("3. 제육볶음");
		System.out.println("4. 김치찌개");
		System.out.println("5. 짜장면");
		System.out.print("위 메뉴 중 하나를 선택하세요. : ");
		int menu = sc.nextInt();
		
		// 입력한 메뉴 출력
		switch (menu) {
			case 1:
				System.out.println("Pizza 선택");
				break;
			case 2:
				System.out.println("돈까스 선택");
				break;
			case 3:
				System.out.println("제육볶음 선택");
				break;
			case 4:
				System.out.println("김치찌개 선택");
				break;
			case 5:
				System.out.println("짜장면 선택");
				break;
			default :
				System.out.println("선택하신 메뉴는 없는 메뉴입니다.");
				break;
		}
		sc.close();
	}

}
