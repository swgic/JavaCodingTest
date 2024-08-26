package programmers.basics01_10_Test_01;

import java.util.Scanner;

public class basics08_scannerStr {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// System.out.println("두개의 문자열을 입력하세요: ");
		String str1 = scan.next();
		String str2 = scan.next();
		
		if (str1.length() >= 1 && str2.length() <= 10) {
			System.out.println(str1 + str2);
		} else {
			System.out.println("문자 길이 수가 범위 내에 있지 않습니다.");
		}
		
		scan.close();
	}

}
