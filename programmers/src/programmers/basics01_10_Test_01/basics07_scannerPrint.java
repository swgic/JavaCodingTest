package programmers.basics01_10_Test_01;

import java.util.Scanner;

// 문자열 돌리기
public class basics07_scannerPrint {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// System.out.print("문자여을 입력하세요: ");
		String str = scan.next();
		
		if (str.length() >= 1 && str.length() <= 10) {
			for (int i=0 ; i<str.length() ; i++) {
				System.out.println(str.charAt(i));
			}
		}
		scan.close();
	}

}
