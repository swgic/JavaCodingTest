package programmers.basics01_10_Test_01;

import java.util.Scanner;

public class basics01_scannerStr {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요: ");
		String strA = scan.nextLine();
		
		if(strA.length() >= 1 && strA.length() <= 1000000) {
			System.out.println(strA);			
		} else {
			System.out.println("범위에 벗어났습니다.");
		}
		
		
		scan.close();
	}

}
