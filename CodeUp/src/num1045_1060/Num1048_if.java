package num1045_1060;

import java.util.Scanner;

public class Num1048_if {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		// System.out.print("정수 2개를 입력해주세요: ");
		String strNum = scan.nextLine();
		String[] strNumAB = strNum.split(" ");
		int intNumA = Integer.parseInt(strNumAB[0]);
		int intNumB = Integer.parseInt(strNumAB[1]);
		
		if (0 <= intNumA && 10 >= intNumA && 0 <= intNumB && 10 >= intNumB){
			System.out.println(intNumA << intNumB);
		} else {
			System.out.println("0~10 값을 입력해주세요");
		}
		
		scan.close();
	}

}
