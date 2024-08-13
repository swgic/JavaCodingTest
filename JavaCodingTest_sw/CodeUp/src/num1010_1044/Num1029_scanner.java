package num1010_1044;

import java.util.Scanner;

public class Num1029_scanner {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//System.out.print("실수 1개 입력: ");
		float flNum  = scan.nextFloat();
		
			System.out.printf("%12.11f",flNum);
		
		
		scan.close();
	}
}