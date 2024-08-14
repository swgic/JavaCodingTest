package num1010_1044;

import java.util.Scanner;

public class Num1013_scanner {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// System.out.print("정수형1: ");
		int intNum1 = scan.nextInt();
		// System.out.println(intNum1);
		
		// System.out.print("정수형2: ");
		int intNum2 = scan.nextInt();
		// System.out.print(intNum2);
		System.out.printf("%s %s",intNum1 ,intNum2);
		
		scan.close();
	}
}

