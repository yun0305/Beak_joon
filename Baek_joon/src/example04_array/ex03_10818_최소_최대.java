package example04_array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class ex03_10818_최소_최대 {

	/*문제
	N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.

	입력
	첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다. 모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.

	출력
	첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.

	예제 입력 1 
5
20 10 35 30 7
	예제 출력 1 
	7 35
	*/
	
	public static void main(String[] args) throws NumberFormatException, IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		int[] room = new int[n];

		st = new StringTokenizer(br.readLine()," ");
		
		br.close();
		
		for(int i=0;i<room.length;i++) {
			room[i] = Integer.parseInt(st.nextToken());
		}
		
		int max = room[0];
		int min = room[0];
		for(int i=0;i<room.length;i++) {
			
			if(max<room[i]) {
				max = room[i];
			}
			if(min>room[i]) {
				min = room[i];
			}
			
		}
		bw.write(Integer.toString(min)+" "+Integer.toString(max));
		bw.flush();
		bw.close();
	}
}
