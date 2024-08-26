package programmers.basics01_10_Test_01;

import java.util.Scanner;

public class basics02_scannerInt {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정두 2개를 입력하세요: ");
		int intNumA = scan.nextInt();
		int intNumB = scan.nextInt();
		
		if (intNumA >= -100000 && intNumA <= 100000 && intNumB >= -100000 && intNumB <= 100000 ) {
			System.out.println("a = " + intNumA);
			System.out.println("b = " + intNumB);
			
		scan.close();
		}
	}

}
