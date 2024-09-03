package programmers.basics11_20;

public class basics16_n의배수 {
	int solution(int intNum, int intN) {
		int answer = 0;
		
		if(intNum >= 2 && intNum <= 100 && intN >= 2 && intN <= 9) {
			if(intNum % intN == 0) {
				answer = 1;
			} else {
				answer = 0;
			}
		} 
		return answer;
	}
	
	public static void main(String[] args) {
		basics16_n의배수 solu = new basics16_n의배수();
		int intRetVal1 = solu.solution(98, 2);
		int intRetVal2 = solu.solution(34, 3);
		
		System.out.println(intRetVal1);
		System.out.println(intRetVal2);
	}
}
