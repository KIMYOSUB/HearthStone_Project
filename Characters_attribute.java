
abstract class Characters_attribute {   	//ĳ���͵��� ���� �� �ִ� Ư����
	String name; 							//�̸�
    int attack; 							//���ݷ�
	int health; 							//ü��
	int cost;                               //���
	boolean dead; 							//������ ����
    
	public int deal(int attack) { 			//���� �� ��
		return attack;
	}
	
	public int be_dealed(int dealed){       //���� ������ �� 
		health -= dealed;
		if (health <= 0) {
			dead = true;
		}
		return health;
	}
	
	public String getName( ) {              //�̸� �ҷ�����            
		return this.name;
	}
	
	public int getHealth() {                //ü�� �ҷ�����
		return this.health;
	}

}


