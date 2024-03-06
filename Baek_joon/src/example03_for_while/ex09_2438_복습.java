package example03_for_while;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class ex09_2438_복습 {

	/*문제
	첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제

	입력
	첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.

	출력
	첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.

	예제 입력 1 
	5
	예제 출력 1 
	*
	**
	***
	****
	******/
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		br.close();
		for(int i=1;i<=n;i++) {
			for(int j=0;j<i;j++) {
				bw.write("*");
			}
			bw.write("\n");
		}
		bw.flush();
		bw.close();
		
	}

	public static void rightAnswer() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int star = Integer.parseInt(br.readLine());
		
		
		br.close();
		
		for(int i=1;i<=star;i++) {
			
			for(int j=0;j<i;j++) {
			bw.write('*');
			}
			
			bw.newLine();
		}
		
		bw.flush();
		bw.close();
	}
}
