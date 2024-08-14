package num1010_1044;

import java.util.Scanner;

public class Num1034_scanner {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String strNum  = scan.nextLine();
		int intNum8 = Integer.valueOf(strNum,8); 
		
		System.out.printf("%d", intNum8);
		
		scan.close();
	}
}
