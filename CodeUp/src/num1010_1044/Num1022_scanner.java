package num1010_1044;

import java.util.Scanner;

public class Num1022_scanner {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		// System.out.print("문자 입력: ");
		String str = scan.nextLine();
		
		if (str.length() <= 2000) {
			System.out.println(str);
		} else {
			System.out.println("최대 2000자까지 입력 가능합니다.");
		}
	
	scan.close();
	
	}
}