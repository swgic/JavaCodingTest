package num1045_1060;

import java.util.Scanner;

public class Num1050_if {
	public static void main(String[] arg){
		Scanner scan = new Scanner(System.in);
		
		// System.out.print("두 정수를 입력하세요: ");
		String strNum = scan.nextLine();
		String[] strNumAB = strNum.split(" ");
		int intNumA = Integer.parseInt(strNumAB[0]);
		int intNumB = Integer.parseInt(strNumAB[1]);
		
		if (intNumA ==intNumB) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
		
		scan.close();
	}

}
