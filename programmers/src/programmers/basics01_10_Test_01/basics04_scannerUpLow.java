package programmers.basics01_10_Test_01;

import java.util.Scanner;

public class basics04_scannerUpLow {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String strChange = "";
		
		System.out.print("문자열을 입력하세요: ");
		String strA = scan.nextLine();
		
		if (strA.length() >= 1 && strA.length() <= 20) {
			for(int i = 0; i < strA.length(); i++) {
				char chB = strA.charAt(i);
				
				// Character.isUpperCase() : 대문자 인지 확인
				if(Character.isUpperCase(chB)) {
					strChange += Character.toLowerCase(chB);
					 // Character.toUpperCase() : 소문자 변환
					
				} else {
					strChange += Character.toUpperCase(chB);
					// Character.toLowerCase() : 대문자 변환
				}
			}
			
			System.out.println(strChange);
		}
		
		scan.close();
	}

}
