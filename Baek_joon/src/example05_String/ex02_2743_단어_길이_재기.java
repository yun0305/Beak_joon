package example05_String;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ex02_2743_단어_길이_재기 {

	/*알파벳으로만 이루어진 단어를 입력받아, 그 길이를 출력하는 프로그램을 작성하시오.

	입력
	첫째 줄에 영어 소문자와 대문자로만 이루어진 단어가 주어진다. 단어의 길이는 최대 100이다.

	출력
	첫째 줄에 입력으로 주어진 단어의 길이를 출력한다.

	예제 입력 1 
	pulljima
	예제 출력 1 
	8*/
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String eng = br.readLine();
		br.close();
		bw.write(Integer.toString(eng.length()));
		bw.flush();
		bw.close();
	}

}
