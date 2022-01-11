package g_oop2;

//추상클래스는 객체를 만들지 못 한다.
//부모클래스의 역활을 위해 만든다
public abstract class SampleAbstractParent {
	
	void method() {
		
	}
	
	//추상메서드 --추상메서드를 가지려면 클래스도 추상클래스로 만들어야한다 
	abstract void abstractMethod();
	
	
	
	
	
}

class SampleAbstractChild extends SampleAbstractParent{
	@Override
	void abstractMethod() {
		
	}
	
}











