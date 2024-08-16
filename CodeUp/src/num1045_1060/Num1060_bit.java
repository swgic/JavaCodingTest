package num1045_1060;

import java.util.Scanner;

public class Num1060_bit {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// System.out.print("정수 두 개 입력해주세요: ");
		String strNum = scan.nextLine();
		String[] strNumAB = strNum.split(" ");
		
		int intNumA = Integer.parseInt(strNumAB[0]);
		int intNumB = Integer.parseInt(strNumAB[1]);
		System.out.println(intNumA & intNumB);
	}

}
