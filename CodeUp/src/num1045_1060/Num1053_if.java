package num1045_1060;

import java.util.Scanner;

public class Num1053_if {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// System.out.print("정수 0,1 중 하나를 입력하세요: ");
		int intNum = scan.nextInt();
		
		if(intNum == 1) {
			System.out.println(0);
		} else {
			System.out.println(1);
		}
		
		scan.close();
	}

}
