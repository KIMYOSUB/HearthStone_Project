
public class Card extends Characters_attribute implements Cloneable  { //카드(하수인) 클래스
	  
	  boolean field;                //카드가 필드에 있는지 여부
	  boolean hand;                 //핸드에 있는지 여부
	  boolean deck;                 //덱에 들어있는지 여부

public Card(String name, int attack, int health, int cost) { //카드 생성자
	this.name = name;
	this.attack = attack;
	this.health = health;
	this.cost = cost;
}

	@Override 
	protected Object clone() throws CloneNotSupportedException { //카드 2장씩 만들기 위해 클론 사용
		return super.clone(); 
	}

}



