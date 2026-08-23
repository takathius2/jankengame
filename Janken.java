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
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

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
	
		scanner.close();




	}
}
