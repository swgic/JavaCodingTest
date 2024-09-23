package programmers.basics11_20;

public class basics17_공배수 {
	int solution(int intNum, int intN, int intM) {
		int intAnswer = 0;
		String strAnswer = "";
		
			if(intNum >= 10 && intNum <= 100 && intN >= 2 && intN < 10 && intM >= 2 && intM < 10) {
				if (intNum % intN == 0 && intNum % intM == 0) {
					intAnswer = 1;
				} else if (intNum % intN == 0 && intNum % intM != 0) {
					intAnswer = 0;
				}
			} else {
				intAnswer = 2;
			}

		return intAnswer;
	}
	
	
	
	public static void main(String[] args) {
		basics17_공배수 solu = new basics17_공배수();
		int intRetVal1 = solu.solution(60, 2, 3);
		int intRetVal2 = solu.solution(55, 9, 5);		
		int intRetVal3 = solu.solution(55, 15, 5);
		
		System.out.println(intRetVal1);
		System.out.println(intRetVal2);
		System.out.println(intRetVal3);
		
	}
}
