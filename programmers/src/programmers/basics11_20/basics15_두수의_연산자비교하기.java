package programmers.basics11_20;

public class basics15_두수의_연산자비교하기 {
	public int solution(int intA, int intB) {
		int answer=0;
		
		String strIntA = String.valueOf(intA);
		String strIntAB = strIntA + intB;
		
		if (intA >= 1 && intA <= 10000 && intB >= 1 && intB <= 10000) {
			int intAB = Integer.parseInt(strIntAB);
			if(intAB >= 2*intA*intB) {
				answer = intAB;
			} else {
				answer = 2*intA*intB;
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		basics15_두수의_연산자비교하기 solu = new basics15_두수의_연산자비교하기();
		int intNum = solu.solution(91, 2);
		System.out.println(intNum);
	}

}
