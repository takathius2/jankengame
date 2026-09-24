import java.util.Scanner;
public class InputHandler{
	private Scanner scanner = new Scanner(System.in);

	//プレイヤーの手を入力
	public int getPlayerHand(){
		while(true){
			System.out.println("番号を入力してください");
			
			System.out.println("1=グー");
			System.out.println("2=チョキ");
			System.out.println("3=パー");

			String input = scanner.next();

			//数字かどうかの判定
			if (input.equals("1")||input.equals("2")||input.equals("3")){
				return Integer.parseInt(input);
			}
			System.out.println("1~3の数字を入力してください");
		}
	}
	//再戦するか否かの入力
	public boolean getPlayAgain(){
		while (true){
			System.out.println("もう一度あそぶ？");		
			System.out.println("あそぶ！=y/やめる！=n");
			
			String answer = scanner.next();
			if (answer.equalsIgnoreCase("y")){
				return true;
			}else if (answer.equalsIgnoreCase("n")){
				return false;
			}
			System.out.println("yまたはnを入力してください");
		}
	}
	//Scannerを閉じる
	public void close(){
		scanner.close();
	}
}
