package num1010_1044;

import java.util.Scanner;

public class Num1031_scanner {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//System.out.print("10진수 입력: ");
		int intNum = scan.nextInt();
		System.out.printf("%o", intNum);
		
		scan.close();
	}
}
