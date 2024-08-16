package num1010_1044;

import java.util.Scanner;

public class Num1015_scanner {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// System.out.print("실수형: ");
		float flNum = scan.nextFloat();
		//flNum = Math.round(flNum * 100)/100f;
		flNum = Math.round(flNum * 1e2)/1e2f;
		System.out.printf("%3.2f",flNum);
	
	scan.close();
	}

}