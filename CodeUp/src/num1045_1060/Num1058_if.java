package num1045_1060;

import java.util.Scanner;

public class Num1058_if {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// System.out.print("0,1로 두개의 정수를 입력하세요: ");
		String strNum = scan.nextLine();
		String[] strNumAB = strNum.split(" ");
		int intNumA = Integer.parseInt(strNumAB[0]);
		int intNumB = Integer.parseInt(strNumAB[1]);
		
		if (intNumA == 0 && intNumB == 0) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
		
		scan.close();
	}

}
