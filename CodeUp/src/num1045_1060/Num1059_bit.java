package num1045_1060;

import java.util.Scanner;

public class Num1059_bit {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
			
		// System.out.print("정수를 입력하세요: ");
		int intNum = scan.nextInt();
		System.out.printf("%d", ~intNum);
		
		
		scan.close();
		
	}

}
