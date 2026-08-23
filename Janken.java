import java.util.Scanner;
import java.util.Random;

public class Janken{
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

		scanner.close();

		//テスト用
		//System.out.println("入力された番号" + playerHand);
		System.out.println("CPU:" + cpuHand);
	}
}
