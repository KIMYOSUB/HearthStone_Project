
class Hero extends Characters_attribute {
	int health = 30;        	 //시작 체력은 30으로 초기화 한다.
	boolean dead = false;   	 //생존으로 초기화     
	
	public Hero(String name) {   //생성자
		this.name = name;
	}
	

}
