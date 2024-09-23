package programmers.basics21_25;

public class basics22_등차수열의특정한_항만더하기 {
	public int solution(int intA, int intB, boolean[] blIncluded) {
		int intAnswer = 0;
		
		if(intA >= 1 && intA <= 100 && intB >= 1 && intB <= 100 && blIncluded.length >= 1 && blIncluded.length <= 100) {
			for(int i=0; i<blIncluded.length; i++) {
				if(blIncluded[i]) {
					intAnswer += intA+(intB*i);
				}
			}
		}
		return intAnswer;
		
	}


	public static void main(String[] arg) {
		basics22_등차수열의특정한_항만더하기 solu = new basics22_등차수열의특정한_항만더하기();
		boolean[] blIncluded1 = new boolean[] {true, false, false, true, true};
		boolean[] blIncluded2 = new boolean[] {false, false, false, true, false, false, false};
		
		int intRetVar1 = solu.solution(3, 4, blIncluded1);
		int intRetVar2 = solu.solution(7, 1, blIncluded2);
		
		System.out.println(intRetVar1);
		System.out.println(intRetVar2);
	
	}
}