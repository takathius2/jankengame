import java.util.Random;


public class Janken{
	//数字を手の名前に変換する
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
		
		//CPUのランダムな手を作成
		Random random = new Random();

		//入力処理
		InputHandler inputHandler = new InputHandler();
		boolean playAgain = true;

		while (playAgain){
			//プレイヤーの手を取得
			int playerHand = inputHandler.getPlayerHand();

			//CPUの手をランダムに決定
			int cpuHand = random.nextInt(3) + 1;

			//数字を手の名前に変換
			String playerHandName = getHandName(playerHand);
			String cpuHandName = getHandName(cpuHand);

			//お互いの手を出力
			System.out.println("あなた：" + playerHandName);
                	System.out.println("CPU:" + cpuHandName);

			//勝敗判定
	        	if (playerHand == cpuHand){
				System.out.println("あいこです！");
			}else if ((playerHand ==1 && cpuHand ==2)||(playerHand == 2 && cpuHand == 3)||(playerHand == 3 && cpuHand == 1))
					{
						System.out.println("あなたの勝ち！");
					}else{
						System.out.println("あなたの負け！");
					}
			//再戦するか否かを取得
			playAgain = inputHandler.getPlayAgain();
		}
		//ゲーム終了時にscannerを閉じる
		inputHandler.close();
		System.out.println("またね！");

		}
	}
