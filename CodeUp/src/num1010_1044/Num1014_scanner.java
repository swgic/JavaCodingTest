package num1010_1044;

import java.util.Scanner;

public class Num1014_scanner {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		//String str3;
		
		// System.out.print("문자형: ");
		String str = scan.nextLine();
		String strSl[] = str.split(" ");
		
		String str1 = strSl[0];
		String str2 = strSl[1];
		
		// 방법 1
		System.out.printf("%s %s",str2 ,str1);
		
//		방법 2
//		str3 = str1;
//		str1 = str2;
//		str2 = str3;
//		
//		System.out.print(str1 + " ");
//		System.out.print(str2);
		
		scan.close();
	}

}

