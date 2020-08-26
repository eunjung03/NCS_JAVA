package sist;

/*
 * 변수(Variable)?
 * - 하나의 데이터를 저장할 수 있는 메모리 공간을 의미함.
 * - 변수는 여러 개의 값을 저장할 수 없고, 오직 하나의 값만을 저장할 수 있음.
 * - 필요한 데이터를 저장할 곳을 미리 선언해 두고, 나중에 계속해서 사용하기 위해 변수를 만드다.
 * 
 * 변수 선언 방법
 * - 형식) 자료형 변수명;
 *        - 자료형 : 기본 자료형(8가지)
 *        - 변수명 : 사용자가 임의로 만들 수 있음.
 *        
 * 변수 사용 절차
 * 1. 변수 선언 - 자료형 변수명;
 * 2. 변수 초기화 - 변수에 값을 저장(= 기호를 사용함).
 * 3. 변수 이용 - 연산 및 출력 등등
 * 
 * 변수명(식별자) 작성 규칙
 * - 변수명, 메서드명, 클래스명 등의 이름을 지정할 때 사용함.
 * 1. 예약어(키워드 - 문법적으로 사용하는 단어) 사용 불가.
 * 2. 영문자 또는 특수문자(_ or $)로 시작.
 * 3. 숫자로 시작하면 안 됨. - 1sum(X)
 * 4. 대소문자는 구별함 - SUM과 sum은 다른 변수명으로 인식함.
 * 5. 변수명은 의미 있게 만드는 것이 좋음.
 */

/*
 * 자바의 기본 자료형(8가지)
 * 1. 정수형 : byte(1바이트), short(2바이트), int(4바이트-기본형), long(8바이트)
 * 2. 실수형 : float(4바이트), double(8바이트-기본형)
 * 3. 단일문자형 : char(2바이트), 
 * 4. 논리형 : boolean(true/false)
 * 
 * - 자료형의 크기 순서 : byte < short(char) < int < float < long < double
 * 
 * - 나머지 자료형은 참조자료형 - 5장부터 나오는 내용.
 */

public class Ex01 {

	public static void main(String[] args) {
		
		// 1. 변수 선언 - 자료형 변수명;
		//int su;
		
		// 2. 변수 초기화 - 변수에 값을 저장(= 기호를 사용함).
		//su = 124;
		
		// 1 + 2 : 변수 선언 및 변수 초기화
		int su = 124;
		
		su = 250;	// 기존의 값이 지워지고 새로운 값이 저장됨.
		
		su = su + 134;

		System.out.println("su >>> " + su); // +는 결합
		
		
	}

}