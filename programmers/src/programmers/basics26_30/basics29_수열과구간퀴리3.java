package programmers.basics26_30;

public class basics29_수열과구간퀴리3 {
	public int[] solution(int[] intArr, int[][] intQueries) {
		int[] intAnswer = {};
		int intX;
		
		if (intArr.length >= 1 && intArr.length <= 1000 && intQueries.length >= 1 && intQueries.length <= 1000) {
			for(int i = 0; i < intQueries.length ; i++) {
				if(intArr[i] >= 0 && intArr[i] <= 1000000) {
				
					intX                     = intArr[intQueries[i][0]];
					intArr[intQueries[i][0]] = intArr[intQueries[i][1]];
					intArr[intQueries[i][1]] = intX;
					
					intAnswer = intArr;
				}
				
			}
		}
		return intAnswer;
	}
	
	public static void main(String[] args) {
		basics29_수열과구간퀴리3 solu = new basics29_수열과구간퀴리3();
		
		int[]   intArr     = {0, 1, 2, 3, 4};
		int[][] intQueries = {{0,3},{1,2},{1,4}};
		
		int[] intRetVal = solu.solution(intArr, intQueries);
		
		for (int intNum : intRetVal ) {
			System.out.print(intNum + ",");
			
		}
	
		
		
	}
}
