package num1045_1060;

import java.util.Scanner;

public class Num1045_scanner {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 a,b를 입력하세요: ");
		String strNum = scan.nextLine();
		
		String[] strNumAB = strNum.split(" ");
		int intNumA = Integer.parseInt(strNumAB[0]);
		int intNumB = Integer.parseInt(strNumAB[1]);
		
		
		if (0 <= intNumA && 2147483647 >= intNumB && 0 != intNumB) {
			System.out.println(intNumA + intNumB);
			System.out.println(intNumA - intNumB);
			System.out.println(intNumA * intNumB);
			System.out.println(intNumA / intNumB);
			System.out.println(intNumA % intNumB);
			
			float flNum = (float)intNumA / (float)intNumB;
			flNum = Math.round(flNum *1e2)/ 1e2f;
			System.out.printf("%3.2f", flNum);
		} else {
			System.out.println("범위내 값을 입력해주세요 ");
		}
		
		scan.close();
	}

}
