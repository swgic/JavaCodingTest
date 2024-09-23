package programmers.basics21_25;

public class basics23_주사위게임 {
	public int solution(int intA, int intB, int intC) {
		int intAnswer = 0;
		
		if (intA >= 1 && intA <= 6 && intB >=1 && intB <= 6 && intC >= 1 && intC <= 6 ) {
			if (intA != intB && intA != intC && intB != intC) {
				intAnswer = intA + intB + intC;
			} else if (intA == intB && intA == intC && intB == intC) {
				intAnswer = (intA + intB + intC) * ((intA*intA) + (intB*intB) + (intC*intC)) * ((intA * intA * intA) + (intB * intB * intB) + (intC * intC * intC));
				
			} else {
				intAnswer = (intA + intB + intC) * ((intA*intA) + (intB*intB) + (intC*intC));
			}
		}
		return intAnswer;
	}
	
	public static void main(String[] args) {
		basics23_주사위게임 solu = new basics23_주사위게임();
		
		int intRetVal1 = solu.solution(2, 6, 1);
		int intRetVal2 = solu.solution(5, 3, 3);
		int intRetVal3 = solu.solution(4, 4, 4);
		
		System.out.println(intRetVal1);
		System.out.println(intRetVal2);
		System.out.println(intRetVal3);
		
		
	}
}
