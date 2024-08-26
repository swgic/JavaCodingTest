package programmers.basics01_10_Test_01;

import java.util.Scanner;

// 홀짝 구분하기
public class basics09_scannerInt {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// System.out.print("정수를 입력하세요: ");
		int intNum = scan.nextInt();
		
		if (intNum >= 1 && intNum <= 1000) {
			if (intNum % 2 == 0) {
				System.out.println(intNum + " is even");
			} else {
				System.out.println(intNum + " is odd");
			}
		} else {
			System.out.println("정수의 범위가 맞지 않습니다: ");
		}
		scan.close();
	}

}
