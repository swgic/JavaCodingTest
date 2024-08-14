package num1010_1044;

import java.util.Scanner;

public class Num1041_scanner {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		//System.out.print("영문자 1개 입력: ");
		char ch = scan.nextLine().charAt(0);
		
		System.out.println((char)(ch + 1));
		
		
		scan.close();
	}
}