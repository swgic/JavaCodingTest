package programmers.basics21_25;

public class basics21_코드처리하기 {
	public String solution(String strCode) {
		String strAnswer = "";
		int intMode = 0;
		
		if (strCode.length() >= 1 && strCode.length() <= 100000) {
			for (int i = 0; i <strCode.length(); i++) {
				if (strCode.charAt(i) == '1') {
					intMode = 1 - intMode;
				} else if (i % 2 == intMode) strAnswer += strCode.charAt(i);
			}
		
		}
		return "".equals(strAnswer) ? "EMPTY" : strAnswer;
	}



	public static void main(String[] args) {
		basics21_코드처리하기 solu = new basics21_코드처리하기();
		
		String strRetVar = solu.solution("abc1abc1abc");
		
		System.out.println(strRetVar);
	}
}