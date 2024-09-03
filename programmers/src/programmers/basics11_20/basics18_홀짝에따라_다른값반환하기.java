package programmers.basics11_20;

public class basics18_홀짝에따라_다른값반환하기 {
	int solution(int intN) {
		int sum = 0;
		
		if (intN >= 1 && intN <= 100) {
			if( intN % 2 == 1) {
				for (int i=1 ; i <= intN; i+=2) {
					sum += i;
				}
			} else {
				for (int i=2; i <= intN ; i+=2) {
					sum += Math.pow(i, 2);
					//sum += i * i;
					
				}
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		basics18_홀짝에따라_다른값반환하기 solu = new basics18_홀짝에따라_다른값반환하기();
		
		int intRetVal1 = solu.solution(7);
		int intRetVal2 = solu.solution(10);
		
		System.out.println(intRetVal1);
		System.out.println(intRetVal2);
	}
}
