package num1010_1044;

import java.util.Scanner;

public class Num1026_scanner {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//System.out.print("시:분:초 입력: ");
		String strTime = scan.nextLine();
		
		String[] strSlTime = strTime.split("\\:");
		
		int intTimeH = Integer.parseInt(strSlTime[0]);
		int intTimeM = Integer.parseInt(strSlTime[1]);
		int intTimeS = Integer.parseInt(strSlTime[2]);
		
		System.out.println(intTimeM);
		
	    scan.close();
	}
}