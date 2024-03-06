package example01_in_out;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex05_10430 {
	/*
	문제
	(A+B)%C는 ((A%C) + (B%C))%C 와 같을까?

	(A×B)%C는 ((A%C) × (B%C))%C 와 같을까?

	세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성하시오.

	입력
	첫째 줄에 A, B, C가 순서대로 주어진다. (2 ≤ A, B, C ≤ 10000)

	출력
	첫째 줄에 (A+B)%C, 둘째 줄에 ((A%C) + (B%C))%C,
	셋째 줄에 (A×B)%C, 넷째 줄에 ((A%C) × (B%C))%C를 출력한다.

	예제 입력 1 
	5 8 4
	예제 출력 1 
	1
	1
	0
	0
	*/
	public static void main(String[] args) throws IOException {
			
		/*Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		
		scan.close();*/
		/////////////////////////////////////////////////////////////////////////////////	
		
		//BufferedReader+StringTokenizer사용
	  /*
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();//문자열로 한줄로 받아준다
		StringTokenizer st = new StringTokenizer(str," ");// 공백을 기준으로 잘라준다
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		*/
		////////////////////////////////////////////////////////////////////////////////
		//BufferedReader+split
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = br.readLine().split(" ");
		
		int A = Integer.parseInt(str[0]);
		int B = Integer.parseInt(str[1]);
		int C = Integer.parseInt(str[2]);
		
		System.out.println((A+B)%C);
		System.out.println(((A%C)+(B%C))%C);
		System.out.println((A*B)%C);
		System.out.println(((A%C)*(B%C))%C);
		*/
		////////////////////////////////////////////////////////////////////////////////
		//BufferedReader+StringBuilder
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		StringBuilder sb = new StringBuilder();
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
				
		sb.append((A+B)%C);
		sb.append("\n");
		sb.append(((A%C)+(B%C))%C);
		sb.append("\n");
		sb.append((A*B)%C);
		sb.append("\n");
		sb.append(((A%C)*(B%C))%C);
		
		System.out.println(sb);
	}

}
