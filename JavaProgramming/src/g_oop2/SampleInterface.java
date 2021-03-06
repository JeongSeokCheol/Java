package g_oop2;


//인터페이스는 추상메서드만 가질수 있다.
//변수는 상수만 가질수 있다.
public interface SampleInterface {
	//인터페이스의 모든 멤버 변수는 public static final 제어자를 사용해야한다.
	public static final int NUM1= 1;
	
	//모든 멤버변수의 제어자가 같기 떄문에 생략이 가능하다.
	int NUM2 = 2;
	
	//인터페이스의 모든 메서드는 public abstract 제어자를 사용해야한다.
	public abstract void method1();
	//모든 메서드의 제어자가 같기 떄문에 생략이 가능하다.
	void method2();
}

interface SampleInterface2{
	void method1();
	void method3();
}

class SampleImplement implements SampleInterface,SampleInterface2{

	@Override
	public void method3() {
		
	}

	@Override
	public void method1() {
		
	}

	@Override
	public void method2() {
		
	}
	
}
