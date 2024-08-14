package num1010_1044;

import java.util.Scanner;

public class Num1039_scanner {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String strNum = scan.nextLine();
		String[] strSlNum = strNum.split(" ");
		
		long lnNum1 = Long.parseLong(strSlNum[0]);
		long lnNum2 = Long.parseLong(strSlNum[1]);
		
		long lnNum = lnNum1 + lnNum2;
		
		System.out.println(lnNum);
		
		
		scan.close();
	}
}
