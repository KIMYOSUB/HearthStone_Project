
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
			getHealth();        //���ݹ��� Hero�� ü���� �����´�.
			health -= 2;;
			break;
		case "Garosh":
			this.health += 2;  //������ �ִ� ü���� ���������� �ʱ� ������ �� ü���̶�� ����.
			
		}

	}

}
