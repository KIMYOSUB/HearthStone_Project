
public class Player { 	  
	boolean turn;                   //내 턴일 때 true
	int mana = 1;                   //플레이어가 쓸 수 있는 마나
	
	public Player() {
	
	}
	
	public int pay(int cost) {    //
		mana -= cost;
		return mana;
	}

}
