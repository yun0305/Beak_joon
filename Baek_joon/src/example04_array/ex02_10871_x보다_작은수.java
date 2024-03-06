package example04_array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class ex02_10871_x보다_작은수 {
	
	/*문제
	정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.

	입력
	첫째 줄에 N과 X가 주어진다. (1 ≤ N, X ≤ 10,000)

	둘째 줄에 수열 A를 이루는 정수 N개가 주어진다. 주어지는 정수는 모두 1보다 크거나 같고, 10,000보다 작거나 같은 정수이다.

	출력
	X보다 작은 수를 입력받은 순서대로 공백으로 구분해 출력한다. X보다 작은 수는 적어도 하나 존재한다.

	예제 입력 1 
	10 5
	1 10 4 9 2 3 8 5 7 6
	예제 출력 1 
	1 4 2 3
	*/
	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st1 = new StringTokenizer(br.readLine()," ");
		StringTokenizer st2 = new StringTokenizer(br.readLine()," ");
		
		
		int n =Integer.parseInt(st1.nextToken());
		int x = Integer.parseInt(st1.nextToken());
		
		int[] a = new int[n];
		br.close();
		
		for(int i=0;i<a.length;i++) {
			a[i] = Integer.parseInt(st2.nextToken());
			
			if(x>a[i]) {		
				bw.write(Integer.toString(a[i])+" ");
			}
		}
		bw.flush();
		bw.close();
		
	}
	
	public static void rightAnswer() throws IOException {
		/*
		배열을 이용하지 않는 방법이다.

		즉 입력받음과 동시에 if 문으로 검사해서 주어진 수 보다 작은 경우 StringBuilder 에 저장해주는 방법이다.
		*/
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
 
		int N = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());
 
		StringBuilder sb = new StringBuilder();
 
		st = new StringTokenizer(br.readLine(), " ");
		
		for (int i = 0; i < N; i++) {
			int value = Integer.parseInt(st.nextToken());
 
			if (value < X)
				sb.append(value).append(' ');
		}
		System.out.println(sb);
	}
	
	
}
