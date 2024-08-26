package programmers.basics01_10_Test_01;

import java.util.Scanner;

public class basics03_scannerStrInt {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요: ");
		String strA = scan.nextLine();
		
		System.out.print("정수를 입력하세요: ");
		int intNumB = scan.nextInt();
		
		if (strA.length() >= 1 && strA.length() <= 10 && intNumB >= 1 && intNumB <= 5) {
			for (int i=0 ;i < intNumB ; i++) {
				System.out.print(strA);
			}
		} else {
			System.out.println("잘 못 입력하셨습니다.");
		}
		
		scan.close();
	}

}
