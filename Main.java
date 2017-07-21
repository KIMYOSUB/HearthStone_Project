import java.util.*;


public class Main {                                        //���� ���� �� ���� 
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Hero warrior = new Hero("Garrosh");
		Hero hunter = new Hero("Rexxar");
		Hero mage = new Hero("Jaina");
		//������ 3���� �����߽��ϴ�.
		
		Card[] deck1 = new Card[8];               //player1�� ����� ī��� ,ī��� 8�常 ��������ϴ�.
		Card[] deck2 = new Card[8];               //player2�� ����� ī��� ,�Ȱ��� ī�� 8���Դϴ�.
		
		deck1[0] = new Card("Murloc", 2, 1, 1);
		deck2[0] = (Card) deck1[0].clone();
		deck1[1] = new Card("Raptor", 3, 2, 2);
		deck2[1] = (Card) deck1[1].clone();
		deck1[2] = new Card("S_Tank",3 ,4 ,3);
		deck2[2] = (Card) deck1[2].clone();
		deck1[3] = new Card("Yeti", 4, 5, 4);
		deck2[3] = (Card) deck1[3].clone();
		deck1[4] = new Card("Fighter", 5, 6, 5);
		deck2[4] = (Card) deck1[4].clone();
		deck1[5] = new Card("Ogre", 6, 7, 6);
		deck2[5] = (Card) deck1[5].clone();
		deck1[6] = new Card("Hound", 9, 5, 7);
		deck2[6] = (Card) deck1[6].clone();
		deck1[7] = new Card("Horror", 6, 10, 8);
		deck2[7] = (Card) deck1[7].clone();
	   
		//2���� �÷��̾�� ���� ���� 8�徿 ������ �ִٰ� �����Ѵ�.
		
		Player player1;
		Player player2;
		
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("�Ͻ������� ���� �˴ϴ�!");
		
		System.out.print("ù ��° player1�� �����˴ϴ�");
		player1 = new Player();           //�÷��̾� ��ü ���� �Ϸ�
		
		System.out.println("");
		
		System.out.print("�� ��° player2�� �����˴ϴ�");
		player2 = new Player();           //�÷��̾� ��ü ���� �Ϸ�
		
		System.out.println("");
		System.out.println("player1 ����");
		player1.turn = true;
		int i, j;                         //ī�� 2�� �������� �ޱ�
		i = rand.nextInt(8)-1;
		do {
			j = rand.nextInt(8)-1;
		}while(i == j);
		System.out.println("ī�� 2���� �޽��ϴ�.");
		System.out.println(deck1[i].name +"  " + deck1[j].name);
		System.out.println(deck1[i].attack + "  " +deck1[i].health + "  " + deck1[j].attack + "   " + deck1[j].health);
        
		if(player1.turn == false) { //���� �����ϸ� ���� ����
        	player1.mana++;
        }
		
		//���� ���� �����߽��ϴ�.
		//
		//
		
		
	}

}
