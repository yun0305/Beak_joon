package example05_String;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ex06_10809_알파벳_찾기 {
	/*
	문제
	알파벳 소문자로만 이루어진 단어 S가 주어진다. 각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.

	입력
	첫째 줄에 단어 S가 주어진다. 단어의 길이는 100을 넘지 않으며, 알파벳 소문자로만 이루어져 있다.

	출력
	각각의 알파벳에 대해서, a가 처음 등장하는 위치, b가 처음 등장하는 위치, ... z가 처음 등장하는 위치를 공백으로 구분해서 출력한다.

	만약, 어떤 알파벳이 단어에 포함되어 있지 않다면 -1을 출력한다. 단어의 첫 번째 글자는 0번째 위치이고, 두 번째 글자는 1번째 위치이다.

	예제 입력 1 
	baekjoon
	예제 출력 1 
	1 0 -1 -1 2 -1 -1 -1 -1 4 3 -1 -1 7 5 -1 -1 -1 -1 -1 -1 -1 -1 -1 -
	
	//알파벳이 필요하다 배열로 a~z까지 만들것이다
	
	*
	*/
	public static void main(String[] args) throws IOException {
		
//		//출력 예시:baekjoon
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		
//		char[] eng = new char[26];
//		int[] changeEng = new int[26];
//		
//		String s = br.readLine();
//		br.close();
//		for(int i=0;i<eng.length;i++) {
//			eng[i] = (char)('a'+i);
//				
//			}
//		
//		for(int i=0;i<eng.length;i++) {
//			for(int j=0;j<s.length();j++) {
//				if(eng[i]==s.charAt(j)) {
//					changeEng[i] = s.indexOf(s.charAt(j));
//					break;
//				}
//				else {
//					changeEng[i] = -1;
//				}
//		}
//	}
//		
//		for(int all : changeEng) {
//			bw.write(Integer.toString(all)+" ");
//		}
//		
//		bw.flush();
//		bw.close();
		
		rightAnswer();
	}

	public static void rightAnswer() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		int[] arr = new int[26];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = -1;
		}
 
		String S = br.readLine();
 
		for(int i = 0; i < S.length(); i++) {
			char ch = S.charAt(i);
    
			if(arr[ch - 'a'] == -1) {	// arr 원소 값이 -1 인 경우에만 초기화
				arr[ch - 'a'] = i;
			}
		}
 
		for(int val : arr) {	// 배열 출력
			System.out.print(val + " ");
		}
	}
}