import java.util.*;


public class Main {                                        //게임 진행 및 메인 
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Hero warrior = new Hero("Garrosh");
		Hero hunter = new Hero("Rexxar");
		Hero mage = new Hero("Jaina");
		//영웅은 3개만 구현했습니다.
		
		Card[] deck1 = new Card[8];               //player1이 사용할 카드들 ,카드는 8장만 만들었습니다.
		Card[] deck2 = new Card[8];               //player2가 사용할 카드들 ,똑같은 카드 8장입니다.
		
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
	   
		//2명의 플레이어는 각각 덱에 8장씩 가지고 있다고 가정한다.
		
		Player player1;
		Player player2;
		
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("하스스톤이 시작 됩니다!");
		
		System.out.print("첫 번째 player1이 생성됩니다");
		player1 = new Player();           //플레이어 객체 생성 완료
		
		System.out.println("");
		
		System.out.print("두 번째 player2가 생성됩니다");
		player2 = new Player();           //플레이어 객체 생성 완료
		
		System.out.println("");
		System.out.println("player1 선공");
		player1.turn = true;
		int i, j;                         //카드 2장 랜덤으로 받기
		i = rand.nextInt(8)-1;
		do {
			j = rand.nextInt(8)-1;
		}while(i == j);
		System.out.println("카드 2장을 받습니다.");
		System.out.println(deck1[i].name +"  " + deck1[j].name);
		System.out.println(deck1[i].attack + "  " +deck1[i].health + "  " + deck1[j].attack + "   " + deck1[j].health);
        
		if(player1.turn == false) { //턴이 종료하면 마나 증가
        	player1.mana++;
        }
		
		//여기 까지 구현했습니다.
		//
		//
		
		
	}

}
