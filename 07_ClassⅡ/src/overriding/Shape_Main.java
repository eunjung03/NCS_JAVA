package overriding;

/*
 * 메서드 재정의(method overriding)?
 * - 부모클래스에서 정의한 메서드를 자식클래스에서
 *   다시 작성(재정의)하는 것을 말함.
 *   
 * [메서드 재정의 특징]
 * 1. 반드시 상속 관계에서만 발생함.
 *    (메서드 다중정의 - 동일한 클래스에서 발생)
 * 2. 부모클래스의 원형 메서드를 자식클래스에서 재정의(다시 작성).
 * 
 * [메서드 재정의 조건]
 *   ※※※※※※※※※※※※※※
 * 1. 반드시 접근지정자, 리턴타입(반환형), 매개변수 모두 일치해야 함.
 *    (메서드 다중정의 - 매개변수의 갯수가 다르던지, 리턴타입이 다르던지 해야 함)
 * 2. 접근지정자는 확장 가능(축소 불가능).
 * 
 */

class Shape {
	
	void draw() {							// 접근지정자 지정 안 했으므로 default 값.
		System.out.println("그리다");
	}
}

class Line extends Shape {
	
	// 메서드 재정의
	@Override
	public void draw() {					// protected 로도 확장가능. 접근지정자 확장. // private으로 축소는 안됨
		System.out.println("선을 그리다");
	}
}

class Rect extends Shape {
	
	// 메서드 재정의
	@Override
	void draw() {	
		System.out.println("사각형을 그리다");
	}
}

class Circle extends Shape {
	
	// 메서드 재정의
	@Override
	void draw() {
		System.out.println("원을 그리다");
	}
}

public class Shape_Main {

	public static void main(String[] args) {

		Line line = new Line();
		Rect rect = new Rect();
		Circle circle = new Circle();
		
		line.draw(); rect.draw(); circle.draw();
		
	}

}
