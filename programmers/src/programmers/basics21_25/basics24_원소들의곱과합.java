package programmers.basics21_25;

public class basics24_원소들의곱과합 {
	public int solution(int[] intNum_list) {
		int intAnswer = 0;
		int intSum = 0;
		int intMul = 1;
		
		if(intNum_list.length >= 2 && intNum_list.length <= 10) {
			for (int i=0 ; i < intNum_list.length; i++) {
				if (intNum_list[i] >= 1 && intNum_list[i] <= 9) {
					intSum += intNum_list[i];
					intMul *= intNum_list[i];	
					
					if ((intSum * intSum) > intMul) {
						intAnswer = 1;
					} else {
						intAnswer = 0;
					}
					
				}
			}
		}
		return intAnswer;
	}

	public static void main(String[] args) {
		basics24_원소들의곱과합 solu = new basics24_원소들의곱과합();
		
		int[] intNum_list1 = {3,4,5,2,1};
		int[] intNum_list2 = {5,7,8,3};
		
		int intRetVal1 = solu.solution(intNum_list1);
		int intRetVal2 = solu.solution(intNum_list2);
		
		System.out.println(intRetVal1);
		System.out.println(intRetVal2);
	}
}
