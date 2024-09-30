package programmers.basics26_30;

import java.util.ArrayList;
import java.util.List;

public class basics26_마지막두원소 {
	public List solution(int[] intNum_list) {
		List<Integer> intAnswer = new ArrayList<>();
		int intlastNum = intNum_list[intNum_list.length-1];
		int intSeLastNum = intNum_list[intNum_list.length-2];
		
		if(2<= intNum_list.length && intNum_list.length <= 10 ) {
			
			for (int i=0; i < intNum_list.length; i++) {
						
				if(intNum_list[i] >= 1 && intNum_list[i] <=9) {
					intAnswer.add(intNum_list[i]);
				}
			}	
			if (intlastNum > intSeLastNum) {
				intAnswer.add(intlastNum - intSeLastNum);
			} else {
				intAnswer.add(intlastNum*2);
			}
					
				} 
		return intAnswer; 
	}
	
	public static void main(String[] args) {
		basics26_마지막두원소 solu = new basics26_마지막두원소();
		
		int[] intNum_list1 = {2, 1, 6};
		int[] intNum_list2 = {5, 2, 1, 7, 5};
		
		List intRetVal1 = solu.solution(intNum_list1);
		List intRetVal2 = solu.solution(intNum_list2);
		
		System.out.println(intRetVal1);
		System.out.println(intRetVal2);
		
		
	}
}
