
public class Player { 	  
	boolean turn;                   //�� ���� �� true
	int mana = 1;                   //�÷��̾ �� �� �ִ� ����
	
	public Player() {
	
	}
	
	public int pay(int cost) {    //
		mana -= cost;
		return mana;
	}

}
