package num1010_1044;

import java.util.Scanner;

public class Num1027_scanner {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// System.out.print("년.월.일 입력: ");
		String strDate = scan.nextLine();
		
		String[] strSlDate = strDate.split("\\.");
		
		int intDateY = Integer.parseInt(strSlDate[0]);
		int intDateM = Integer.parseInt(strSlDate[1]);
		int intDateD = Integer.parseInt(strSlDate[2]);
		
		System.out.printf("%02d-%02d-%04d", intDateD, intDateM, intDateY);
		
		scan.close();
		
	}
}