package num1010_1044;

import java.util.Scanner;

public class Num1012_scanner {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//System.out.print("실수형: ");
		double dblNum = scan.nextDouble();
		System.out.printf("%8.6f",dblNum);
		
		scan.close();
		
		
	}

}