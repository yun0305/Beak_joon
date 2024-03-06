package example01_in_out;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ex06_2588_복습 {
	/* 
	 문제
	(세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.

	(1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에
	 들어갈 값을 구하는 프로그램을 작성하시오.

	입력
	첫째 줄에 (1)의 위치에 들어갈 세 자리 자연수가, 둘째 줄에 (2)의 위치에 들어갈 세자리 자연수가 주어진다.

	출력
	첫째 줄부터 넷째 줄까지 차례대로 (3), (4), (5), (6)에 들어갈 값을 출력한다.

	예제 입력 1 
	472
	385
	예제 출력 1 
	2360
	3776
	1416
	181720
	*/
	public static void main(String[] args) throws IOException {
		
		/*
		 * 어떤 방식으로 풀거냐면 첫번째 3자리 수를 숫자로 받는다.
		 * 그리고 472이 수를 385에 곱할건데 우리는 중간에
		 * 2360
		 * 3776
		 * 1416
		 * 이 숫자들도 표현해 줄것이다. 그렇기 때문에 두번째 세자리 수를 문자열로 받고
		 * 문자열을 charAt으로 하나 씩 가져와서 char를 숫자로 바꾼다음 472를 곱해줘서
		 * 한줄에 출력해 줄것이다	
		 * 
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int oneRine = Integer.parseInt(br.readLine());
		String twoRine = br.readLine();
	
		
		br.close();
		
		
		for(int i=2;i>=0;i--) {
			bw.write(oneRine*(twoRine.charAt(i)-'0')+"\n");
			
		}
			bw.write(Integer.toString(oneRine*Integer.parseInt(twoRine)));
		
		bw.flush();
		bw.close();
		
				
		
		
		
		
		/*
		System.out.println('A'+1);
		System.out.println((char)('A'+1));
		
		char와 int 를 연산하면 자바에서는 기본적으로 (int보다 낮은 타입이 연산을 하면) int로 결과 값이 나온다
		그래서 char로 문자를 뽑고 싶으면 캐스팅으로 char를 붙여줘야 한다
		안그러면 아스키 코드 10진수 결과 값이 나온다 'A'+ 1 = (65 - 1)
		
		
		*/
		
		/*char i = 65;
		
		System.out.println(i);
		
		
		int A = scan.nextInt();
		String B = scan.next();
		scan.close();*/
		/*
		 * 두번째 받을 세자리 수를 하나씩 잘라서 A에 곱해줘야 한다 그러기 위해서
		 * 문자열 추출인 charAt(); 함수를 쓸것이다 
		 * char와 int는 연산이 된다 하지만 내가 추출할 문자열은 3이다 
		 * 숫자 그대로인 3이 아니라 문자열 3이다 아스키 코드에서 3은 51번이다.
		 * 그래서 연산을 하면 A*3이 아니라 A*51이 연산이 되어버린다
		 * 그렇기 때문에 51('3')과 48('0')을 빼줄것이다 그럼 3이 나온다
		 * 그리고 char 끼리 연산을 해주었기 때문에 아스키코드 3번이 아니라 int형 3이 나온다.
		 * 
		 */
		/*System.out.println(A*(B.charAt(2)-'0'));
		System.out.println(A*(B.charAt(1)-'0'));
		System.out.println(A*(B.charAt(0)-'0'));
		System.out.println(A*(Integer.parseInt(B)));
		*/
		
		//Scanner 로 입력받는것과 BufferedReader 로 입력받는 것은 성능차이가 확연하게 난다.
		
		/*
		 * 472
		 * 385
		 */
		
		
		
		
		
}
	
	public static void rightAnswr() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		
		sb.append(A*(B%10));
		sb.append("\n");
		sb.append(A*((B%100)/10));
		sb.append("\n");
		sb.append(A*(B/100));
		sb.append("\n");
		sb.append(A*B);
		System.out.println(sb);
	}
	
}