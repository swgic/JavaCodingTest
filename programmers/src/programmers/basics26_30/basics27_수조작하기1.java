package programmers.basics26_30;

public class basics27_수조작하기1 {
	public int solution(int intN, String strControl) {
		int intAnswer = 0;

		if(-100000 <= intN && 100000 >= intN && 1 <= strControl.length() && 100000 >= strControl.length()) {
			for(int i = 0; i < strControl.length(); i++) {
				switch(strControl.charAt(i)) {
				case 'w':
					intN += 1;
					break;
				case 's':
					intN -= 1;
					break;
				case 'd':
					intN += 10;
					break;
				case 'a':
					intN -= 10;
					break;
				}
			}
		}
		return intN;
		
		
	}
	public static void main(String[] args) {
		basics27_수조작하기1 solu = new basics27_수조작하기1();
		
		 String strCon = "wsdawsdassw";
		 
		 int intRetVal = solu.solution(0, strCon);
		 
		 System.out.println(intRetVal);
	}
}
