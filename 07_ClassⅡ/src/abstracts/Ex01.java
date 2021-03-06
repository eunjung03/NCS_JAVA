package abstracts;

/*
 * 추상클래스(abstract class)?
 * 1. 추상메서드를 포함하는 클래스.
 * 2. 추상메서드는 본체(body)가 없는 메서드.
 *    예) void display();	// { }가 없다.
 * 3. 클래스 앞에 abstract 키워드가 온다.
 * 4. 추상메서드를 재정의하지 않으면 error 발생.
 *    => 추상메서드 재정의 강제성.
 * 5. 추상클래스는 객체 생성이 불가능.
 *    => 자식클래스를 대상으로 객체 생성.
 * 6. 추상 클래스는 추상메서드를 가진 클래스를 말함.
 * 7. 물론 일반 멤버(멤버변수, 멤버메서드)를 가질 수 있음.
 * 8. 그러나 한 개 이상의 추상메서드는 반드시 존재해야 함.
 *    형식) 
 *         [접근제한] abstract class 클래스명 {	} 
 * 9. 용도 : 응용프로그램에서 설계와 구현부분을 분리해서 작업.
 */

/*
 * 추상클래스에서 error 발생 ==> 해결방법 2가지
 * 1. 자식클래스에서 추상메서드를 재정의(O).
 * 2. 자식클래스에서 재정의하지 않는 경우
 *    => 자식클래스 이름 앞에 abstract 키워드를 붙여야 함.
 */

abstract class Super {	// 부모클래스 - 추상클래스
	
	int num1;	// 인스턴스 멤버변수
	
	int calc() {	// 인스턴스 멤버메서드
		int sum = num1 + 100;
		return sum;
	}
	
	abstract void display();	// 추상메서드
	
}

class SubA extends Super {

	@Override			// 재정의를 안 하려면 자식클래스도 abstract을 붙여줘야한다.
	void display() {
		System.out.println("추상메서드 재정의 했어요~");
	}
	
}

public class Ex01 {

	public static void main(String[] args) {

		// 추상클래스이기 때문에 객체 생성이 불가능.
		// 완성이 덜 된 클래스이기 때문에 객체 생성이 불가능.
		// Super super = new Super();
		
		// 자식클래스로 객체 생성
		SubA a = new SubA();
		
		a.num1 = 100;
		System.out.println("calc() 매서드 호출 >>> "+a.calc());
		a.display();	//  추상메서드 재정의
		
	}

}
