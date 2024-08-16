package num1010_1044;

import java.util.Scanner;

public class Num1035_scanner {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String strNum  = scan.nextLine();
		int intNum16 = Integer.valueOf(strNum,16); 
		
		System.out.printf("%o", intNum16);
		
		scan.close();
	}
}
