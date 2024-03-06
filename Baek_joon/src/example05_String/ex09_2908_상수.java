package example05_String;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class ex09_2908_상수 {
	
	/*
	문제
	상근이의 동생 상수는 수학을 정말 못한다. 상수는 숫자를 읽는데 문제가 있다. 이렇게 수학을 못하는 상수를 위해서 상근이는 수의 크기를 비교하는 문제를 내주었다. 상근이는 세 자리 수 두 개를 칠판에 써주었다. 그 다음에 크기가 큰 수를 말해보라고 했다.

	상수는 수를 다른 사람과 다르게 거꾸로 읽는다. 예를 들어, 734와 893을 칠판에 적었다면, 상수는 이 수를 437과 398로 읽는다. 따라서, 상수는 두 수중 큰 수인 437을 큰 수라고 말할 것이다.

	두 수가 주어졌을 때, 상수의 대답을 출력하는 프로그램을 작성하시오.

	입력
	첫째 줄에 상근이가 칠판에 적은 두 수 A와 B가 주어진다. 두 수는 같지 않은 세 자리 수이며, 0이 포함되어 있지 않다.

	출력
	첫째 줄에 상수의 대답을 출력한다.

	예제 입력 1 
	734 893
	예제 출력 1 
	437
	예제 입력 2 
	221 231
	예제 출력 2 
	132
	예제 입력 3 
	839 237
	예제 출력 3 
	938
	*/
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		char[] one = new char[3];//세자리 정수를 받을 캐릭터 배열
		char[] two = new char[3];
				
		int a = 0;
		int b = 0;
		int[] ast = new int[] {100,10,1};//a b 를 100 10 1 이걸로 곱해서 각각 분리되있는 캐릭터들을 100의 자리로 만들어줄거다
		
		
		char stock;// 분리되어 있는 캐릭터 3개를 거꾸로 읽어 줄건데 그때 필요한 교환변수
		String stOne = st.nextToken();// 토큰을 변수에 담아줘야 반목문을 돌렸을때 오류가 나지 않는다
		String stTwo = st.nextToken();// 만약 토큰을 변수에 돌리면 포문은 3번 돌릴건데 그럼 자바는 6개의 토큰을 찾으려고 해서 오류가 남
		
		for(int i=0;i<3;i++) {
			one[i] = stOne.charAt(i);//String 타입의 변수를 하나씩 캐락터로 분리해서 캐릭터 배열에 넣는다
			two[i] = stTwo.charAt(i);
		}
		
		// 캐릭터 배열 거꾸로 바꿈 3자리 수의 100의 자리와 1의 자리만 바꿔주면됨
		stock = one[0];
		one[0] = one[2];
		one[2] = stock;
		
		stock = two[0];
		two[0] = two[2];
		two[2] = stock;
		
		for(int i=0;i<3;i++) {// 거꾸로 바꾼 캐릭터 배열을 이제 하나의 숫자로 합쳐 줄거다	
			a += (one[i]-'0')*ast[i];
			b += (two[i]-'0')*ast[i];
		}
		
		
		if(a>b) {
			bw.write(Integer.toString(a));
		}
		else {
			bw.write(Integer.toString(b));
		}
		
		bw.flush();
			
	}
	
	public static void rightAnswer() throws IOException {
		
		/*가장 기본적인 방법이라 할 수 있겠다.
		아마 가장 궁금할 부분은 StringBuilder 이지 않을까 싶다.

		먼저 StringBuilder 는 문자열을 다루는 클래스로 많이 쓰이고 있는데, 여기서 reverse() 라는 아주 좋은 메소드를 포함하고 있다.

		즉, 위를 사용하기 위해 먼저 StringBuilder 생성과 동시에 append() 라는 메소드에 값을 넣어준다.
		이때 append() 로 넣어진 값은 타입이 StringBuilder 라는 타입으로 변환된다.

		그리고 그렇게 저장된 수를 reverse() 라는 메소드를 통해 저장되어있던 문자열을 뒤집는다. 그리고 StringBuilder 타입을 문자열로 반환시키기 위해 toString() 을 써주면 끝이다.
		그리고 문자열로 반환시켰으니 Integer.parseInt() 로 String 을 int 로 타입을 변경시키면 끝이다.
		
		그렇게 뒤집힌 값은 출력에서 A 와 B 중 큰 값이 출력되도록 하면 끝난다.
		*/
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
        
		int A = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
		int B = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
		
		System.out.print(A > B ? A:B);
		
	}
	
}
