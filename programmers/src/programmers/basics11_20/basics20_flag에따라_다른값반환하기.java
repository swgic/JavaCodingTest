package programmers.basics11_20;

public class basics20_flag에따라_다른값반환하기 {
	public int solution(int intA, int intB, boolean blFlag) {
		int intAnswer = 0;
		
		if(intA >= -1000 && intA <= 1000 && intB >= -1000 && intB <= 1000) {
			if (blFlag == true) {
				intAnswer = intA + intB;
			} else {
				intAnswer = intA - intB;
			}
		}
		return intAnswer;
	}

	public static void main(String[] args) {
		basics20_flag에따라_다른값반환하기 solu = new basics20_flag에따라_다른값반환하기();
		
		int intRetVal1 = solu.solution(-4, 7, true);
		int intRetVal2 = solu.solution(-4, 7, false);
		
		System.out.println(intRetVal1);
		System.out.println(intRetVal2);
	}
}
