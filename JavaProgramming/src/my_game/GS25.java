package my_game;

public class GS25 {
	String name;
	int price;
	int food;
	
	GS25(String name, int price){
		this.name = name;
		this.price = price;

		}

	@Override
	public String toString() {
		return name + "( " + price + "원)";

	}


 }


class Samkok extends GS25{
	Samkok(){
		super("삼각김밥",1200);
	}
}

class Gogi extends GS25{
	Gogi(){
		super("불고기도시락",4500);
	}
}

class CupRamen extends GS25{
	CupRamen(){
		super("컵라면",1500);
	}
}