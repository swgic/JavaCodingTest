package programmers.basics11_20;

public class basics19_조건문자열 {
	public int solution(String strIneq, String strEq, int intN, int intM) {
		int intAnswer = 0;
		
		if(intN >= 1 && intN <= 100 && intM >= 1 && intM <= 100) {
			if (strIneq.equals(">") && strEq.equals("=")) {
				if (intN >= intM) {
					intAnswer = 1;
				} else {
					intAnswer = 0;
				}
			} else if (strIneq.equals("<") && strEq.equals("=")) {
				if (intN <= intM) {
					intAnswer = 1;
				} else {
					intAnswer = 0;
				}
			} else if (strIneq.equals(">") && strEq.equals("!")) {
				if (intN > intM) {
					intAnswer = 1;
				} else {
					intAnswer = 0;
				}
			} else if (strIneq.equals("<") && strEq.equals("!")) {
				if (intN < intM) {
					intAnswer = 1;
				} else {
					intAnswer = 0;
				}
			}
		}
		return intAnswer;
	}
	
	public static void main(String[] args) {
		basics19_조건문자열 solu = new basics19_조건문자열();
		
		int intRetVal1 = solu.solution("<", "=", 20, 50);
		int intRetVal2 = solu.solution(">", "=", 41, 78);
		
		System.out.println(intRetVal1);
		System.out.println(intRetVal2);
	}

}
