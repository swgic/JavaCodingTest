package num1045_1060;

import java.util.Scanner;

public class Num1046_Scanner {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		// System.out.print("정수 3개를 입력해주세요");
		String strNum = scan.nextLine();
		String[] strNumABC = strNum.split(" ");
		
		int intNumA = Integer.parseInt(strNumABC[0]);
		int intNumB = Integer.parseInt(strNumABC[1]);
		int intNumC = Integer.parseInt(strNumABC[2]);
		
		long lnSumABC = intNumA + intNumB + intNumC;
		// System.out.println("총합");
		System.out.println(lnSumABC);
		
		float flAvg = (float)lnSumABC / 3;
		flAvg = Math.round(flAvg * 10)/10f;
		// System.out.println("평균");
		System.out.println(flAvg);
		
		
		scan.close();
	}
}
