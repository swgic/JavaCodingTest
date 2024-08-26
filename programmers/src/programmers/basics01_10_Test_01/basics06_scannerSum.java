package programmers.basics01_10_Test_01;

import java.util.Scanner;

public class basics06_scannerSum {
	 public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	        
	    // System.out.print("정수를 입력하세요: ");
		int intNumA = scan.nextInt();
		int intNumB = scan.nextInt();
		int intSum = intNumA + intNumB;
		
		if (intNumA >= 1 && intNumB <= 100) {
			System.out.println(intNumA  + " + " + intNumB + " = " + intSum);
	    }
		scan.close();
	 }
}
