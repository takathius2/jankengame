import java.util.Scanner;
import java.util.Random;


public class Janken{
	static String getHandName(int hand){
		if (hand ==1){
			return "グー✊";
		}else if (hand == 2){
			return "チョキ✌";
		}else{
			return "パー✋";
		}
	}


	public static void main(String[]args){
		//プレイヤーの入力を受け付け
		Scanner scanner = new Scanner(System.in);
		
		//CPUのランダムな手を作成
		Random random = new Random();

		//再戦するか
		boolean playAgain = true;

		while (playAgain){
			System.out.println("じゃんけんゲーム");
			System.out.println();
			
			System.out.println("1:グー");
			System.out.println("2:チョキ");
			System.out.println("3:パー");
			System.out.println();
		
			System.out.println("番号を入力してください");
		
			int playerHand = scanner.nextInt();
			int cpuHand = random.nextInt(3) + 1;

			String playerHandName = getHandName(playerHand);
			String cpuHandName = getHandName(cpuHand);

			System.out.println("あなた：" + playerHandName);
                	System.out.println("CPU:" + cpuHandName);

			//判定
	        	if (playerHand == cpuHand){
				System.out.println("あいこです！");
			}else if ((playerHand ==1 && cpuHand ==2)||(playerHand == 2 && cpuHand == 3)||(playerHand == 3 && cpuHand == 1))
					{
						System.out.println("あなたの勝ち！");
					}else{
						System.out.println("あなたの負け！");
					}
			System.out.println("もう一度遊びますか？");
			System.out.println("y/n");

			String answer = scanner.next();

			if (answer.equals("n")){
				playAgain = false;
			}
		}
			scanner.close();

		}
	}
