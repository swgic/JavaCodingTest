package num1010_1044;

import java.util.Scanner;

public class Num1028_scanner {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//System.out.print("정수 1개 입력: ");
		long lnNum  = scan.nextLong();
		
		if (lnNum >= -2147483648 && lnNum <= 2147483647) {
			int intNum = (int)lnNum;
			System.out.println(intNum);
		} else {
			System.out.println(lnNum);
		}
		
		scan.close();
	}
}