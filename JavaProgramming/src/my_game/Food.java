package my_game;

public class Food {
	String name;
	int price;
	int food;
	
	


Food(String name, int price){
		this.name = name;
		this.price = price;

		}

	@Override
	public String toString() {
		return name + "(" + price + "원)";

	}

	

}	
	
class LunchBox extends Food{
	LunchBox(){
		super("도시락" , 3500);
	}
	
}
