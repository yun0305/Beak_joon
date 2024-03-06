package example05_String;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class ex07_2675_문자열_반복 {

	/*문제
	문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 P를 만든 후 출력하는 프로그램을 작성하시오. 즉, 첫 번째 문자를 R번 반복하고, 두 번째 문자를 R번 반복하는 식으로 P를 만들면 된다. S에는 QR Code "alphanumeric" 문자만 들어있다.

	QR Code "alphanumeric" 문자는 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ\$%*+-./: 이다.

	입력
	첫째 줄에 테스트 케이스의 개수 T(1 ≤ T ≤ 1,000)가 주어진다. 각 테스트 케이스는 반복 횟수 R(1 ≤ R ≤ 8), 문자열 S가 공백으로 구분되어 주어진다. S의 길이는 적어도 1이며, 20글자를 넘지 않는다. 

	출력
	각 테스트 케이스에 대해 P를 출력한다.

	예제 입력 1 
	2
	3 ABC
	5 /HTP
	예제 출력 1 
	AAABBBCCC
	/////HHHHHTTTTTPPPPP
	*/
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i=0;i<t;i++) {// 2번의 테스트 케이스 생성
			String p = "";	// 각 테스트 케이스가 끝나면 초기화
			st = new StringTokenizer(br.readLine()," ");// 각 테스트 케이스를 공백 기준으로 분리
			int r = Integer.parseInt(st.nextToken());
			String s = st.nextToken();
			
			for(int j=0;j<s.length();j++) {//입력 받은 s의 길이만큼 반복
				for(int k=0;k<r;k++) {// s를 r만큼 반복해서 p에 넣어준다.
					p += s.charAt(j);
						
				}
				
			}
			bw.write(p+"\n");
			
			
		}
		bw.flush();	
}
	
	public static void rightAnswer() throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
	
			String[] str = br.readLine().split(" ");	// 공백 분리
			
			int R = Integer.parseInt(str[0]);	// String -> int
			String S = str[1];
			
			for(int j = 0; j < S.length(); j++) {
				for(int k = 0; k < R; k++) {
					System.out.print(S.charAt(j));
				}
			}
			System.out.println();
		
	}
	
}
}