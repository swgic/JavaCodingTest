package num1045_1060;

import java.util.Scanner;

public class Num1047_if {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		// System.out.print("정수를 입력하세요: ");
		int intNum = scan.nextInt();
		if (-1073741824 <= intNum && 1073741824 >= intNum) {
			
			System.out.printf("%d", intNum << 1);
		} else {
			System.out.println("범위내 값을 입력해주세요: ");
		}
		
		scan.close();
	}

}
