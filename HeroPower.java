
public class HeroPower extends Hero {
	int cost = 2;
	public HeroPower(String name) {
		super(name);
	}

	public void hero_power() {
		switch(this.name) {
		case "Jaina":
			this.deal(1);
			break;
		case "Rexxr":
			getHealth();        //공격받을 Hero의 체력을 가져온다.
			health -= 2;
			break;
		case "Garosh":
			this.health += 2;  //영웅의 최대 체력이 정해져있지 않기 때문에 방어도 체력이라고 본다.
			
		}

	}

}
