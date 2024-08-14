package num1010_1044;

import java.util.Scanner;

public class Num1025_scanner {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//System.out.print("다섯자리 정수 1개 입력: ");
		int intNum = scan.nextInt();
		
		int intNum1 = (int)((int)(intNum/1e4)*1e4);
		
		intNum      = (intNum - intNum1);
		int intNum2 = (int)((int)(intNum/1e3)*1e3);
		
		intNum = (intNum - intNum2);
		int intNum3 = (int)((int)(intNum/1e2)*1e2);
		
		intNum = (intNum - intNum3);
		int intNum4 = (int)((int)(intNum/10)*10);
		
		int intNum5 = intNum - intNum4;
		
		System.out.println("[" + intNum1 + "]");
		System.out.println("[" + intNum2 + "]");
		System.out.println("[" + intNum3 + "]");
		System.out.println("[" + intNum4 + "]");
		System.out.println("[" + intNum5 + "]");
		
	scan.close();
	
	}
}