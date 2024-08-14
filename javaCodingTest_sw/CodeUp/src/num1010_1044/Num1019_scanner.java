package num1010_1044;

import java.util.Scanner;

public class Num1019_scanner {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//System.out.print("연.월.일: ");
		String str = scan.nextLine();
		
		String[] date = str.split("\\.");
		
		int dateY = Integer.parseInt(date[0]);
		int dateM = Integer.parseInt(date[1]);
		int dateD = Integer.parseInt(date[2]);
		
		System.out.printf("%04d.%02d.%02d", dateY, dateM, dateD);
		
	scan.close();
	
	}

}