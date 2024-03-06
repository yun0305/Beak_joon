package example06_심화;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ex04_10988_팰린드롬인지_확인하기 {

	/*문제
	알파벳 소문자로만 이루어진 단어가 주어진다. 이때, 이 단어가 팰린드롬인지 아닌지 확인하는 프로그램을 작성하시오.

	팰린드롬이란 앞으로 읽을 때와 거꾸로 읽을 때 똑같은 단어를 말한다. 

	level, noon은 팰린드롬이고, baekjoon, online, judge는 팰린드롬이 아니다.

	입력
	첫째 줄에 단어가 주어진다. 단어의 길이는 1보다 크거나 같고, 100보다 작거나 같으며, 알파벳 소문자로만 이루어져 있다.

	출력
	첫째 줄에 팰린드롬이면 1, 아니면 0을 출력한다.

	예제 입력 1 
	level
	예제 출력 1 
	1
	예제 입력 2 
	baekjoon
	예제 출력 2 
	0
	*/
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		String p = br.readLine();
		int c = 1;
		br.close();
		for(int i=1;i<=p.length();i++) {
				if(p.charAt(i-1)!=p.charAt(p.length()-i)) {
					c=0;
					break;
				}

		}
		
		bw.write(Integer.toString(c));
		bw.flush();
		bw.close();
		
	}
	
	public static void rightAnswer() throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

//	        주요 변경 사항:
//	       팰린드롬 확인 루프를 p.length() 대신 len / 2로 변경했습니다.
//	       팰린드롬은 앞뒤로 비교하기 때문에 문자열의 절반만 확인하면 됩니다.
//	       불일치하는 문자를 발견하면 isPalindrome 값을 0으로 설정하고 반복문을 종료합니다.
//	       이렇게 수정하면 주어진 단어가 팰린드롬인지 아닌지를 올바르게 확인할 수 있습니다.
//	        
	        String word = br.readLine();
	        int isPalindrome = 1;

	        int len = word.length();
	        for (int i = 0; i < len / 2; i++) {
	            if (word.charAt(i) != word.charAt(len - 1 - i)) {
	                isPalindrome = 0;
	                break; // 불일치하는 문자를 찾으면 더 이상 비교할 필요가 없으므로 반복문을 종료합니다.
	            }
	        }

	        bw.write(Integer.toString(isPalindrome));
	        bw.flush();
	        bw.close();
	        
	        
}
}