package example04_array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class ex09_10811_바구니_뒤집기_복습__배열역순 {

	/*문제
	도현이는 바구니를 총 N개 가지고 있고, 각각의 바구니에는 1번부터 N번까지 번호가 순서대로 적혀져 있다. 바구니는 일렬로 놓여져 있고, 가장 왼쪽 바구니를 1번째 바구니, 그 다음 바구니를 2번째 바구니, ..., 가장 오른쪽 바구니를 N번째 바구니라고 부른다. 

	도현이는 앞으로 M번 바구니의 순서를 역순으로 만들려고 한다. 도현이는 한 번 순서를 역순으로 바꿀 때, 순서를 역순으로 만들 범위를 정하고, 그 범위에 들어있는 바구니의 순서를 역순으로 만든다.

	바구니의 순서를 어떻게 바꿀지 주어졌을 때, M번 바구니의 순서를 역순으로 만든 다음, 바구니에 적혀있는 번호를 가장 왼쪽 바구니부터 출력하는 프로그램을 작성하시오.

	입력
	첫째 줄에 N (1 ≤ N ≤ 100)과 M (1 ≤ M ≤ 100)이 주어진다.

	둘째 줄부터 M개의 줄에는 바구니의 순서를 역순으로 만드는 방법이 주어진다. 방법은 i j로 나타내고, 왼쪽으로부터 i번째 바구니부터 j번째 바구니의 순서를 역순으로 만든다는 뜻이다. (1 ≤ i ≤ j ≤ N)

	도현이는 입력으로 주어진 순서대로 바구니의 순서를 바꾼다.

	출력
	모든 순서를 바꾼 다음에, 가장 왼쪽에 있는 바구니부터 바구니에 적혀있는 순서를 공백으로 구분해 출력한다.

	예제 입력 1 
	5 4
	1 2
	3 4
	1 4
	2 2
	예제 출력 1 
	3 4 1 2 5
	*/
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//역순 문제
		/*{1, 2, 3, 4, 5, 6, 7, 8}인 바구니의 순서를 변경할 때
		입력 값이 (1 8)이라고 예시를 들면
		
		[a]          [b]

		1번째 배열 - 8번째 배열 
		2번째 배열 - 7번째 배열
		3번째 배열 - 6번째 배열
		4번째 배열 - 5번째 배열
		
		a와 b는 서로의 값을 교환하며, a는 1 증가하고 b는 1 감소한다. 
		b가 a보다 값이 큰 경우만 값을 교환하므로 while문의 조건을 a<b로 설정하였다.*/
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int[] bagoony = new int[Integer.parseInt(st.nextToken())];
		int stock = 0;
		
		for(int i=0;i<bagoony.length;i++) {
			bagoony[i] = i+1;
		}
		int m = Integer.parseInt(st.nextToken());
		
		for(int i=0;i<m;i++) {
		StringTokenizer st2 = new StringTokenizer(br.readLine()," "); 	
		int one = Integer.parseInt(st2.nextToken())-1;
		int two = Integer.parseInt(st2.nextToken())-1;
		
		while(one<two) {
			
			stock = bagoony[one];
			bagoony[one] = bagoony[two];
			bagoony[two] = stock;
			one++;
			two--;
		
		}
	}
		br.close();
		
		for(int all : bagoony) {
			bw.write(Integer.toString(all)+" ");
			}
			
			bw.flush();
			bw.close();
	}
}
