package num1010_1044;

import java.util.Scanner;

public class Num1020_scanner {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//System.out.print("주민번호(-포함): ");
		String str = scan.nextLine();
		
		String[] hNum = str.split("\\-");
		
		int bathNum = Integer.parseInt(hNum[0]);
		int exNum   = Integer.parseInt(hNum[1]);
		
		System.out.printf("%06d%07d", bathNum, exNum);
		
	scan.close();
	
	}

}