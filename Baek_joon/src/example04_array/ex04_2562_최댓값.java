package example04_array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class ex04_2562_최댓값 {

	/*문제
	9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.

	예를 들어, 서로 다른 9개의 자연수

	3, 29, 38, 12, 57, 74, 40, 85, 61

	이 주어지면, 이들 중 최댓값은 85이고, 이 값은 8번째 수이다.

	입력
	첫째 줄부터 아홉 번째 줄까지 한 줄에 하나의 자연수가 주어진다. 주어지는 자연수는 100 보다 작다.

	출력
	첫째 줄에 최댓값을 출력하고, 둘째 줄에 최댓값이 몇 번째 수인지를 출력한다.

	예제 입력 1 
	3
	29
	38
	12
	57
	74
	40
	85
	61
	예제 출력 1 
	85
	8*/
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] n = new int[9];
		
		for(int i=0;i<n.length;i++) {
			n[i] = Integer.parseInt(br.readLine());
		}
		br.close();
		int max = 0;
		/*
		 * //나는 여기서 max에 n[0]을 넣어줬다 그런데 틀렸다 아마도 이유는 테스트 케이스가 1부터 100
		 * 돌아가는데 n[0]을 하면 주어진 상수에서만 돌아서 틀렸다고 하는거 같은데 이유는 모르겠다.
		 * max 변수를 n[0]으로 초기화하면 코드가 잘못 동작할 수 있습니다. 이유는 입력값 중에서 0이나 음수가 있을 경우 max가 초기값인 n[0]보다 작아서 최댓값을 올바르게 찾지 못할 수 있기 때문입니다.
		 *
		 *반면에 max 변수를 0으로 초기화하면 초기값이 최소값인 0으로 설정되므로, 입력값 중에서 가장 큰 양수를 찾아서 max 변수에 저장할 수 있습니다. 이렇게 하면 최댓값을 올바르게 찾을 수 있게 됩니다.
		 *
		 *따라서 max 변수를 0으로 초기화한 것이 올바릅니다. 그러나 입력값에 음수가 포함되지 않는다고 확신한다면, max를 n[0]으로 초기화하는 방식도 사용할 수 있을 것입니다.  
		 *
		 *
		 */
		
		
		
		int len = 0;
		
		for(int i=0;i<n.length;i++) {
			
			if(max<n[i]) {
				max = n[i];
				len = i+1;
			}
			
		}
		
		  bw.write(Integer.toString(max) + "\n" + Integer.toString(len));
			bw.flush();
			bw.close();
	}
	
	public static void rightAnswer() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		int[] arr = new int[9];
		
		for(int i = 0 ; i < 9 ; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
 
		int max = 0;
		int index = 0;
		
		int count = 0;
		
		for(int value : arr) {
			count++;
			if(value > max) {
				max = value;
				index = count;
			}
		}
 
		System.out.println(max);
		System.out.println(index);
 
	
	}

}
