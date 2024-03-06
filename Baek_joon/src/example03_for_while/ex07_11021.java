package example03_for_while;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;




public class ex07_11021 {

	/*문제
	두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

	입력
	첫째 줄에 테스트 케이스의 개수 T가 주어진다.

	각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)

	출력
	각 테스트 케이스마다 "Case #x: A + B = C" 형식으로 출력한다. x는 테스트 케이스 번호이고 1부터 시작하며, C는 A+B이다.

	예제 입력 1 
	5
	1 1
	2 3
	3 4
	9 8
	5 2
	예제 출력 1 
	Case #1:  2
	Case #2:  5
	Case #3:  7
	Case #4:  17
	Case #5:  7
	*/
	
	//https://st-lab.tistory.com/33 참고
	public static void main(String[] args) throws NumberFormatException, IOException,InterruptedException  {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer stk;
		
		int t = Integer.parseInt(br.readLine());
			
		for(int i=1;i<=t;i++) {
			
			stk = new StringTokenizer(br.readLine()," ");
			int A = Integer.parseInt(stk.nextToken());
			int B = Integer.parseInt(stk.nextToken());
			
			bw.write("Case #"+i+": ");
			bw.write(A+B+"\n");
			
		}
		br.close();
		bw.flush();
		bw.close();
		
	
	}

}
