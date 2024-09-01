package programmers.basics11_15;

public class basics13_문자열곱하기 {
	public String solution(String my_string, int intk) {
		String answer="";
		
		if(my_string.length() >= 1 && my_string.length() <= 100) {
			for (int i =0; i < intk; i ++ ) {
				answer += my_string; 
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		basics13_문자열곱하기 solu = new basics13_문자열곱하기();
		String strNum = solu.solution("string", 3);
		System.out.println(strNum);
	}

}
