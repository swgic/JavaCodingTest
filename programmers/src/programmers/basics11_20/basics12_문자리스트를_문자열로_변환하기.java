package programmers.basics11_20;

public class basics12_문자리스트를_문자열로_변환하기 {
	public String solution(String[] arr) {
		String answer = "";
		
		if(arr.length >= 1 && arr.length <= 200) {
			for(int i = 0; i < arr.length; i++) {
				answer += arr[i];
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		basics12_문자리스트를_문자열로_변환하기 solu = new basics12_문자리스트를_문자열로_변환하기();
		String[] chNum = {"a", "b", "c"};
		System.out.println(solu.solution(chNum));
	}

}
