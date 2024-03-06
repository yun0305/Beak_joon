package example06_심화;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ex05_1157_단어_공부_복습 {

	/*문제
	알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.

	입력
	첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다.

	출력
	첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.

	예제 입력 1 
	Mississipi
	예제 출력 1 
	?
	예제 입력 2 
	zZa
	예제 출력 2 
	Z
	예제 입력 3 
	z
	예제 출력 3 
	Z
	예제 입력 4 
	baaa
	예제 출력 4 
	A
	*/
	
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] countEng = new int[26];
		String str = br.readLine();
		br.close();
		
		for(int i = 0;i<str.length();i++) {
			
			if(str.charAt(i)>='a'&&str.charAt(i)<='z') {
				countEng[str.charAt(i) - 97]++;//소문자면 97를 뺴서 0을 만들어주고(a를 기준)
			}
			else {
				countEng[str.charAt(i) - 65]++;//대문자면 65를 뺴서 0을 만들어 countEng[0] 배열에 넣는다
			}
			
		}
		
		int max = -1; 
		char ch = '?';
		
		for(int i=0;i<26;i++) {//a부터 z까지 순환한다 
			if(countEng[i]>max) {//순환하면서 배열값이 제일 큰것을 찾아서 ch변수에 넣는다
				max = countEng[i];
				ch = (char)(i+65);
			}
			else if(countEng[i]==max) {//만약 제일 큰것과 같은값이 있다면 ?를 대입 시캬준다.
				ch = '?';
			}
		}
		
		bw.write(ch);
		bw.flush();
		bw.close();	
	}
	
	public static void myAnswer() throws IOException {
		//정상적으로 작동은 하지만 시간초과로 문제 틀림
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine(); 
		br.close();
		char[] chStr = new char[str.length()];
		int[] count = new int[str.length()];
		
		for(int i=0;i<chStr.length;i++) {
			chStr[i] = str.charAt(i);
		}
		
		for(int i=0;i<chStr.length;i++) {
			for(int j=0;j<chStr.length;j++) {
				
				if(chStr[i]==chStr[j]) {
					
					count[i]++;
					
				}	
			}
		}
		
		int stock1 = 0;
		char stock2 = 0;
		for(int i=0;i<count.length;i++) {
			
			for(int j = 0;j<count.length;j++) {
				
				if(count[i]>count[j]) {
			
					stock1 = count[i];
					count[i] = count[j];
					count[j] = stock1;
					
					stock2 = chStr[i];
					chStr[i] = chStr[j];
					chStr[j] = stock2;
					
				}
			}
			
		}
		
			for(int i=0;i<count.length;i++) {
				
				if(count[0]==count[i]) {
					if(chStr[0]!=chStr[i]) {
					bw.write("?");
					break;
					}
				}
				else if(chStr[0]>=97) {
					bw.write((char)(chStr[0]-32));
					break;
				}
				else {
					bw.write(chStr[0]);
					break;
				}
			}

			
		bw.flush();
		bw.close();
		
	}
}
