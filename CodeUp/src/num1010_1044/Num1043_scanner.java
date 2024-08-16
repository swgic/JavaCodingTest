package num1010_1044;

import java.util.Scanner;

public class Num1043_scanner {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		//System.out.print("나눌 정수 2개 입력: ");
		String strNum = scan.nextLine();
		String strSlNum[] = strNum.split(" ");

		int intNum1 = Integer.parseInt(strSlNum[0]);
		int intNum2 = Integer.parseInt(strSlNum[1]);
		
		if (intNum2 != 0) {
			int intNum3 = intNum1 % intNum2;
			System.out.println(intNum3);
		} else {
			System.out.println("0 이외의 수를 입력하세요");
		}
		
		
		scan.close();
	}
}
