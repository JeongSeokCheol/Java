package my_game;

public class KimbobCheon {
	String name;
	int price;
	int food;
	
	KimbobCheon(String name, int price){
		this.name = name;
		this.price = price;

		}

	@Override
	public String toString() {
		return name + "(" + price + "원)";

	}

	

}	
	
class Jeyuk extends KimbobCheon{
	Jeyuk(){
		super("제육덮밥" , 6000);
	}
	
}

class Kimbob extends KimbobCheon{
	Kimbob(){
		super("김밥" , 2500);
	}
}

class Ramen extends KimbobCheon{
	Ramen(){
		super("라면" , 3500);
	}
}


