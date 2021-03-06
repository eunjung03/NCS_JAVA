package method;

/*
 * ※※※※※※※※※※※※※※ 
 * 메서드 호출 방식 - 2가지
 *  1. call by value
 *     - 값을 전달하여 호출하는 방식.
 *     - 매개변수가 기본자료형(int, float) 사용.
 *  2. call by reference	==> ★★★★★★★★ 중요함
 *     - 주소값을 전달하여 호출하는 방식.
 *     - 매개변수가 참조자료형(배열명, 클래스명) 사용.
 */

public class Ex05 {
	
	public static void call(int num) {	// main의 num과는 다른 변수임.(지역변수)
		System.out.println("call() 메서드 호출.....");
		num = 100;	// 값을 변경
	}

	public static void main(String[] args) {

		// 1. call by value 방식
		int num = 200;
		System.out.println("메서드 호출 전.....");
		System.out.println("num >>> " + num);	// num >>> 200
		
		call(num);
		
		System.out.println("메서드 호출 후.....");
		System.out.println("num >>> " + num);	// num >>> 100(X)
		
	}

}
