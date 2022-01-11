package my_game;

public class Store {
	int price;
	String name;
	
	
	Store(String name, int price){
		this.name = name;
		this.price = price;

		}

	@Override
	public String toString() {
		return name + "(" + price + "원)";

	}
	
	
}


class Keybord extends Store{
	Keybord(){
		super("키보드", 100000);
	}
}

class Gum extends Store{
	Gum(){
		super("껌", 7000);
	}
}

class Candy extends Store{
	Candy(){
		super("사탕",5000);
	}
}

class Coke extends Store{
	Coke(){
		super("콜라", 15000);
	}
}

class Vita500 extends Store{
	Vita500(){
		super("비타500", 1300);
	}
}