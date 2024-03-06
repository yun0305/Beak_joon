package example01_in_out;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex07_11382 {
	/*
	문제
	꼬마 정민이는 이제 A + B 정도는 쉽게 계산할 수 있다. 이제 A + B + C를 계산할 차례이다!

	입력
	첫 번째 줄에 A, B, C (1 ≤ A, B, C ≤ 1012)이 공백을 사이에 두고 주어진다.

	출력
	A+B+C의 값을 출력한다.

	예제 입력 1 
	77 77 7777
	예제 출력 1 
	7931
	*/
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String[] stringNumber = br.readLine().split(" ");
	
		br.close();
		long[] integerNumber = new long[3];
		
		integerNumber[0] = Long.parseLong(stringNumber[0]);
		integerNumber[1] = Long.parseLong(stringNumber[1]);
		integerNumber[2] = Long.parseLong(stringNumber[2]);
		sb.append(integerNumber[0]+integerNumber[1]+integerNumber[2]);
		
		System.out.println(sb);

	}
	


}
