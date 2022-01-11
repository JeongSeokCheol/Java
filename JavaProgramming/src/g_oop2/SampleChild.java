package g_oop2;

public class SampleChild extends SampleParent {

	void ChildMethod() {
		//상속받은 변수와 메거드를 사용할 수 있다.
		System.out.println(var); //상속받은 변수
		System.out.println(method(7,13)); //상속받은 메서드
	}

	//오버라이딩 - 상속받은 메서드 내용을 바꾸기
	//super, super() - 부모클래스와 자식클래스를 구분할때 사용한다
	//다형성  - 부모클래스 타입의 변수를 사용한다
	
	//오버라이딩 : 상속받은 메서드의 내용을 재정의 하는것
	@Override // 어노테이션 : 클래스, 변수, 메서드 등에 표시해 놓는것
	int method(int a, int b) /*선언부가 똑같아야한다*/{
		return a * b;
	}
	
	//super, super()
	int var;
	
	void test(double var) {
		System.out.println(var); // 지역변수
		System.out.println(this.var); // 전역변수(인스턴스변수)
		System.out.println(super.var); // 부모클래스의 전역변수
		
		System.out.println(this.method(10, 20));//자식클래스의 메서드
		System.out.println(super.method(10, 20));// 부모클래스의 메서드
	}
	
	SampleChild(){
		super(); //부모클래스의 생성자 호출 (생략시 반드시 super()가 호출된다.) - **생성자의 첫줄에서만 사용이 가능
		
	}

	//다형성
	public static void main(String[] args) {
		SampleChild sc = new SampleChild();
		
		SampleParent sp = (SampleParent)new SampleChild();//부모클래스 변수에 자식클래스를 넣는 것 ()를 안치면 생략이 된거다.
		
//		SampleChild sc2 = (SampleChild)new SampleParent(); //반대는 불가능 형변환은 가능하나 컴파일에러가 난다.
		
		SampleChild sc3 = (SampleChild)sp; //sp안에 객체가 SampleChild이기 때문에 가능하다
		
	}

}





















