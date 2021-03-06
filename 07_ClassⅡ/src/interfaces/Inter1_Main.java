package interfaces;

interface Inter1 {
	void aa();
}

//인터페이스끼리 상속을 하는 경우에는 extends 키워드를 사용함.
interface Inter2 extends Inter1 {	
	void bb();
}

// 자바에서는 일반적으로 단일 상속만 가능.
// 하지만 인터페이스는 다중 상속이 가능함.
interface Inter3 extends Inter1, Inter2 { // Inter2만 해도 상관 없음(Inter2가 Inter1을 상속받았기 때문)
	void cc();
}

class BB implements Inter3 {

	@Override
	public void aa() {
		
	}

	@Override
	public void bb() {
		
	}

	@Override
	public void cc() {
		
	}
	
}

public class Inter1_Main {

	public static void main(String[] args) {
		
		

	}

}
