package num1010_1044;

import java.util.Scanner;

public class Num1037_scanner {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int intNum = scan.nextInt();
		
		if(intNum >= 0 && intNum <=255) {
			char ch = (char)intNum;
			System.out.println(ch);
		} else {
			System.out.println("아스크 문자로 출력할 수 없습니다.");
		}
		
		scan.close();
	}
}
