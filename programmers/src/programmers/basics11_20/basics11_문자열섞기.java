package programmers.basics11_20;

public class basics11_문자열섞기 {
	 public String solution(String str1, String str2) {
		 String answer="";
		 
		 if (str1.length()== str2.length()) {
			 for (int i=0; i < str1.length(); i++ ) {
				 answer += str1.substring(i, i+1);
				 answer += str2.substring(i, i+1);
			 }
		 }
		 return answer;
		 
	 }

	 public static void main(String[] args) {
		 basics11_문자열섞기 solu = new basics11_문자열섞기();
		 
		 String strMix = solu.solution("aaaaa","bbbbb");
		 System.out.println(strMix);
	 }
}

