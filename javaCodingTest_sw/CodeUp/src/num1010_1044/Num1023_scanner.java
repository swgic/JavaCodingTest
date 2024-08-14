package num1010_1044;

import java.util.Scanner;

public class Num1023_scanner {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//System.out.print("실수 입력: ");
		String strFlNum = scan.nextLine();
		
		String[] strIndexNum = strFlNum.split("\\.");
		
		int intNum = Integer.parseInt(strIndexNum[0]);
		String flNum  = strIndexNum[1];
		
		//if (flNum.length() <= 6 && flNum.charAt(0) != '0' ){
			System.out.println(intNum);
			System.out.println(flNum);
			
		//} else {
		//	System.out.println("실수 부분을 6자리 이하, 0이 아닌 숫자로 입력해주세요");
		//}
		
	scan.close();	
	
	}
}