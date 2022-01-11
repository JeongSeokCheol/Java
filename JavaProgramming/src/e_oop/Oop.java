package e_oop;

public class Oop {

	public static void main(String[] args) {
		/*
		 * 객체지향 프로그램밍(Object Oriented Programming)
		 * - 프로그램밍을 단순히 코드의 연속으로 보는것이 아니라 객체간의 상호작용으로 보는것
		 * - 코드의 재사용성이 높고 유지보수가 용이하다
		 */
		
		SampleClass sc = new SampleClass();
		
		System.out.println(sc.field);
		String returnValue = sc.method(5);
		sc.method2();
		System.out.println(returnValue);
		sc.flowTest1();
		
		//방금 만든 클래스의 객체를생성하고 변수에 저장해주세요
		//객체가 저장된 변수를 통해 메서드를 호출해주세요
		//파라미터가 있는 메서드는 타입에 맞는 값을 넘겨주시고,
		//리턴타입이 있는 메서드는 리턴반은 값을 출력해주세요
		
		ClassMaker cm = new ClassMaker();
		cm.a();
		int b = cm.b();
		System.out.println(b);
		cm.c(13);
		System.out.println(cm.d(3, 4));
		
	}

}
