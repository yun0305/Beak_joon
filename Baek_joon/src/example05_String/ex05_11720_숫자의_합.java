package example05_String;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class ex05_11720_숫자의_합 {

	/*
	문제
	N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.

	입력
	첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.

	출력
	입력으로 주어진 숫자 N개의 합을 출력한다.

	예제 입력 1 
	1
	1
	예제 출력 1 
	1
	예제 입력 2 
	5
	54321
	예제 출력 2 
	15
	예제 입력 3 
	25
	7000000000000000000000000
	예제 출력 3 
	7
	예제 입력 4 
	11
	10987654321
	예제 출력 4 
	46
	*/	
		
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		String str = br.readLine();
		int result = 0;
		br.close();

		if(str.length()<=n) {
		for(int i = 0; i<str.length();i++) {
			result += (int)str.charAt(i)-'0';
		}
		
		bw.write(Integer.toString(result));
		bw.flush();
		bw.close();
		}
		}

	public static void rightAnswer1() {
		
			Scanner in = new Scanner(System.in);
	 
			int N = in.nextInt();
			String a = in.next();
			in.close();
			
			int sum = 0;
	        
			for(int i = 0; i < N; i++) {
				sum += a.charAt(i)-'0';
			}
			System.out.print(sum);
		
	}
	
	public static void rightAnswer2() throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();	// N 은 쓸모가 없으므로 입력만 받는다.
		
		int sum = 0;
		
		for(byte value : br.readLine().getBytes()) {
			sum += (value - '0');	// 또는 (a-48)
		}
		
		System.out.print(sum);
	}
		
	}
