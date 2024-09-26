package programmers.basics21_25;

public class basics25_이어붙인수 {
	public int solution(int[] intNum_list) {
		int intAnswer = 0;
		String strOdd = "";
		String strEven = "";
		
		if (intNum_list.length >= 2 && intNum_list.length <= 10) {
			
			for (int i=0; i < intNum_list.length; i++) {
				if(intNum_list[i] >= 1 && intNum_list[i] <= 9) {
					
					if(intNum_list[i] % 2 == 0) {
						strEven += Integer.toString(intNum_list[i]);
					} else {
						strOdd += Integer.toString(intNum_list[i]);
					}
				}
			}
		}
		intAnswer = Integer.parseInt(strEven) + Integer.parseInt(strOdd);
		return intAnswer;
	}
	
	public static void main(String[] args) {
		basics25_이어붙인수 solu = new basics25_이어붙인수();
		
		int[] intNum_list1 = {3, 4, 5, 2, 1};
		int[] intNum_list2 = {5, 7, 8, 3};
		
		int intRetVal1 = solu.solution(intNum_list1);
		int intRetVal2 = solu.solution(intNum_list2);
		
		System.out.println(intRetVal1);
		System.out.println(intRetVal2);
		
		// 확인
	}
}
