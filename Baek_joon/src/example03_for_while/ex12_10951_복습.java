package example03_for_while;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*문제
두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

입력
입력은 여러 개의 테스트 케이스로 이루어져 있다.

각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)

출력
각 테스트 케이스마다 A+B를 출력한다.

예제 입력 1 
1 1
2 3
3 4
9 8
5 2
예제 출력 1 사이투 아이디만들어서 풀어

2
5
7
17
7

주의 할점 
1. 두정수는 공백으로 나뉘어 구분된다
2. 입력의 종료는 더이상 읽을 수 있는 데이터가 (EOF)가 없을 때 종료된다.

*/

/*주의 
 
while ((str = br.readLine()) != null)와 String str = br.readLine()를 while 문 안에서 사용하는 것 사이에 중요한 차이가 있습니다.

while ((str = br.readLine()) != null):

이 코드는 루프의 조건을 나타냅니다.
br.readLine()을 호출하고 반환된 문자열을 str 변수에 할당한 후, str 변수가 null인지 확인합니다.
br.readLine()은 입력 스트림에서 한 줄을 읽어오고, 입력이 종료되면 null을 반환합니다.
따라서 이 코드는 입력이 종료될 때까지 반복됩니다.
String str = br.readLine():

이 코드는 한 번만 실행되며, 처음에 입력 스트림에서 한 줄을 읽어 str 변수에 저장합니다.
이렇게 하면 한 번만 입력을 받고, 그 후에는 계속 같은 값을 사용하게 됩니다. 입력이 끝나면 더 이상 새로운 입력을 받지 않습니다.
따라서, while ((str = br.readLine()) != null)을 사용하면 입력이 종료될 때까지 계속해서 새로운 입력을 받고 처리할 수 있습니다. String str = br.readLine()을
 사용하면 한 번만 입력을 받고 루프의 내용이 그 입력에 대해 반복 실행됩니다.
  일반적으로 입력 처리를 위해서는 while ((str = br.readLine()) != null)과 같이 사용하는 것이 더 적절합니다.
 */
public class ex12_10951_복습 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str;
		
		while((str = br.readLine()) != null) {
			  
			StringTokenizer st = new StringTokenizer(str," ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			sb.append(a+b);
			sb.append("\n");
			
		}
		
		System.out.println(sb);
		
		//br.close(); 입력이 무한반복하여 입력을 닫을수도 없고
		//bw.flush(); 출력을 할수도 없다
     }
}