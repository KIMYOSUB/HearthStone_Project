
public class Card extends Characters_attribute implements Cloneable  { //ī��(�ϼ���) Ŭ����
	  
	  boolean field;                //ī�尡 �ʵ忡 �ִ��� ����
	  boolean hand;                 //�ڵ忡 �ִ��� ����
	  boolean deck;                 //���� ����ִ��� ����

public Card(String name, int attack, int health, int cost) { //ī�� ������
	this.name = name;
	this.attack = attack;
	this.health = health;
	this.cost = cost;
}

	@Override 
	protected Object clone() throws CloneNotSupportedException { //ī�� 2�徿 ����� ���� Ŭ�� ���
		return super.clone(); 
	}

}



