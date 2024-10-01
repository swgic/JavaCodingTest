package programmers.basics26_30;

public class basics28_수조작하기2 {
	public String solution(int[] numLog) {
		String strAnswer = "";
		
		if (numLog.length >= -100000 && numLog.length <= 100000) {
			for(int i = 1; i < numLog.length; i++) {
				if(numLog[i] - numLog[i-1]==1) {
					strAnswer += 'w';
				} else if(numLog[i] - numLog[i - 1] == -1) {
					strAnswer += 's';
				} else if(numLog[i] - numLog[i - 1] == 10) {
					strAnswer += 'd';
				} else if(numLog[i] - numLog[i - 1] == -10) {
					strAnswer += 'a';
				}
			}
		}
		return strAnswer;
	}
	
	public static void main(String[] args) {
		basics28_수조작하기2 solu = new basics28_수조작하기2();
		
		int[] intNumLog = {0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1};
		
		String strRetVal = solu.solution(intNumLog);
		
		System.out.println(strRetVal);
	}
}
