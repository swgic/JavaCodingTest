package num1045_1060;

import java.util.Scanner;

public class Num1057_if {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// System.out.print("0,1중에서 정수 2개를 입력해주세요: ");
		String strNum = scan.nextLine();
		String[] strNumAB = strNum.split(" ");
		int intNumA = Integer.parseInt(strNumAB[0]);
		int intNumB = Integer.parseInt(strNumAB[1]);
		
		if (intNumA == intNumB) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
		
		scan.close();
		
	}

}
