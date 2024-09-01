package programmers.basics11_15;

public class basics14_더크게합치기 {
	public int solution(int intA, int intB) {
		int answer=0;
		String strIntA = String.valueOf(intA);
		String strIntAB = strIntA + intB;
		String strIntBA = intB + strIntA;
		
		if (intA >= 1 && intA <= 10000 && intB >= 1 && intB <= 10000) {
			int valueAB = Integer.parseInt(strIntAB);
			int valueBA = Integer.parseInt(strIntBA);
			if(valueAB >= valueBA) {
				answer = valueAB;
			} else {
				answer = valueBA;
			}
		
		}
		return answer;
	}
	
	public static void main(String[] args) {
		basics14_더크게합치기 solu = new basics14_더크게합치기();
		int intNum = solu.solution(9,91);
		System.out.println(intNum);
		
	}

}
