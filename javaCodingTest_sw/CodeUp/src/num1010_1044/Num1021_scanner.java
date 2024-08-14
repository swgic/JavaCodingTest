package num1010_1044;

import java.util.Scanner;

public class Num1021_scanner {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		// System.out.print("문자 입력: ");
		String str = scan.nextLine();
		
		if (str.length() <= 50) {
			System.out.println(str);
		} else {
			System.out.println("단어의 길이는 50자 이하입니다.");
		}
		
	scan.close();
	
	}

}