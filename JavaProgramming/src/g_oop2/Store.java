package g_oop2;

public class Store {

	public static void main(String[] args) {
		
		Desktop d = new Desktop();
		Product p = new Aircon();
		TV tv = new TV();
		
		Customer c = new Customer();
		
		c.buy(d);
		c.buy(p);
		c.buy(tv);
		System.out.println(c.money);
		
		
		
	}

}

class Product{
	String name;
	int price;
	
	Product(String name, int price){
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return name + "(" + price + "원)";
	}
	
}

class Desktop extends Product{
	Desktop(){
		super("삼성 컴퓨터", 1000000);
	}
	
	void programming() {
		System.out.println("프로그램을 만듭니다.");
	}
	
}

class Aircon extends Product{
	Aircon(){
		super("LG 에어컨" , 2000000);
	}
	
	void setTemperature() {
		System.out.println("온도를 성정합니다.");
	}
}

class TV extends Product{
	TV(){
		super("LG TV" , 3000000);
	}
	void setChannel() {
		System.out.println("채널을 변경합니다.");
	}
}


class Customer{
	int money = 10000000;
	
	Product[] items = new Product[10];
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔돈이 부족합니다.");
			return; // 메서드를 종료시킨다
		}
		
		money -= p.price;
		for(int i = 0; i< items.length; i++) {
			if(items[i] == null) {
				items[i] = p;
				break;
			}
		}
		System.out.println(p + " 를 구매했습니다.");
	}
	
	
}
















