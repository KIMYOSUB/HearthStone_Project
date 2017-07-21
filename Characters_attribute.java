
abstract class Characters_attribute {   	//캐릭터들이 가질 수 있는 특성들
	String name; 							//이름
    int attack; 							//공격력
	int health; 							//체력
	int cost;                               //비용
	boolean dead; 							//죽음의 여부
    
	public int deal(int attack) { 			//공격 할 때
		return attack;
	}
	
	public int be_dealed(int dealed){       //공격 당했을 때 
		health -= dealed;
		if (health <= 0) {
			dead = true;
		}
		return health;
	}
	
	public String getName( ) {              //이름 불러오기            
		return this.name;
	}
	
	public int getHealth() {                //체력 불러오기
		return this.health;
	}

}


