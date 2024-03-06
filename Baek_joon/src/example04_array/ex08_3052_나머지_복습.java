package example04_array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;

public class ex08_3052_나머지_복습 {

	/*두 자연수 A와 B가 있을 때, A%B는 A를 B로 나눈 나머지 이다. 예를 들어, 7, 14, 27, 38을 3으로 나눈 나머지는 1, 2, 0, 2이다. 

	수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.

	입력
	첫째 줄부터 열번째 줄 까지 숫자가 한 줄에 하나씩 주어진다. 이 숫자는 1,000보다 작거나 같고, 음이 아닌 정수이다.

	출력
	첫째 줄에, 42로 나누었을 때, 서로 다른 나머지가 몇 개 있는지 출력한다.

	예제 입력 1 
	1
	2
	3
	4
	5
	6
	7
	8
	9
	10
	예제 출력 1 
	10
	각 수를 42로 나눈 나머지는 1, 2, 3, 4, 5, 6, 7, 8, 9, 10이다.

	예제 입력 2 
	42
	84
	252
	420
	840
	126
	42
	84
	420
	126
	예제 출력 2 
	1
	모든 수를 42로 나눈 나머지는 0이다.

예제 입력 3 
39
40
41
42
43
44
82
83
84
85
	예제 출력 3 
	6
	각 수를 42로 나눈 나머지는 39, 40, 41, 0, 1, 2, 40, 41, 0, 1이다. 서로 다른 값은 6개가 있다.
	*/
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int rest[] = new int[10];
		int count = 0;
		boolean bl;
		
		for(int i=0;i<rest.length;i++) {
			int a = Integer.parseInt(br.readLine());
			rest[i] = a%42;
		}
		br.close();
		for(int i=0;i<rest.length;i++) {
			bl=false;// 여기서 초기화
			
			for(int j=i+1;j<rest.length;j++) {
				if(rest[i]==rest[j]) {// 나눈 값 n이 n+1 과 같으면 true로 설정해서 90번이 실행 되지 않게함
					bl = true;
					break;
				}	
			}
			if(bl == false) {// 나눈값이 다르면 count로 하나씩 증가시켜 다른게 있는지 확인
				count++;
			}
			
		}
		
		bw.write(Integer.toString(count));
		bw.flush();
		bw.close();

	}
	
	public static void rightAnswr() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashSet<Integer> hs = new HashSet<Integer>();
 
		for (int i = 0; i < 10; i++) {
			hs.add(Integer.parseInt(br.readLine()) % 42);
		//입력받은 값의 나머지 값을 add메소드를 통해 HashSet에 저장
		}
		br.close();
		System.out.print(hs.size()); //HashSet의 값 출력
		
		/*HashSet은 Collection중 Set의 파생클래스로, 몇가지 특징이 있다.

		중복되는 원소를 넣을 경우 하나만 저장한다.(중복원소를 허용하지 않는다.)
		HashSet은 순서 개념이 없어서 정렬하는 기능인 Collection.sort()메소드를 사용할 수 없다.
		(정렬하고 싶다면 리스트로 변환 후 정렬해야 한다.)*/
		
	}
}
