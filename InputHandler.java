import java.util.Scanner;
public class InputHandler{
	private Scanner scanner = new Scanner(System.in);

	public int getPlayerHand(){
		while(true){
			System.out.println("番号を入力してください");
			
			System.out.println("1:グー");
			System.out.println("2:チョキ");
			System.out.println("3:パー");

			int hand = scanner.nextInt();

			if(hand >= 1&& hand <= 3){
				return hand;
			}

			System.out.println("1~3の数字を入力してください");
		}
	}
}
