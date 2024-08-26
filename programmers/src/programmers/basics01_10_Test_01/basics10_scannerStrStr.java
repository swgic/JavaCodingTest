package programmers.basics01_10_Test_01;


// 문자열 겹쳐쓰기
public class basics10_scannerStrStr {
//	public String solution(String my_string, String overwrite_string, int s) {
//        String answer = "";
//        
//        //변경할 문자열을 제외한 앞부분 문자열 추출
//        String first = my_string.substring(0,s);
//        //변경할 문자열을 제외한 뒷부분 문자열 추출
//        String last = my_string.substring(s+overwrite_string.length(),my_string.length());
//        
//        //앞부분 문자열 + 변경할 문자열 + 뒷부분 문자열로 return
//        answer = first + overwrite_string + last;
//        
//        return answer;
//    }
//	
	public String solution(String my_string, String overwrite_string, int s) {
		String answer = "";
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(my_string);
		sb.replace(s, s+overwrite_string.length(), overwrite_string);
		
		answer = sb.toString();
		
		return answer;
		
	}
}
