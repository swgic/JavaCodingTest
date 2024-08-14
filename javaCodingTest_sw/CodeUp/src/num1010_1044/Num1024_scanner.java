package num1010_1044;

import java.util.Scanner;

public class Num1024_scanner {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//System.out.print("단어 입력: ");
		String str = scan.nextLine();
		
		for(int i=0; str.length() > i; i ++ ) {
			char chIndex = str.charAt(i);
			System.out.println("'" + chIndex +"'");
			
		}
		
	scan.close();
	
	}
}