package example03_for_while;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex01_2739 {
/*
	문제
	N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오. 출력 형식에 맞춰서 출력하면 된다.

	입력
	첫째 줄에 N이 주어진다. N은 1보다 크거나 같고, 9보다 작거나 같다.

	출력
	출력형식과 같게 N*1부터 N*9까지 출력한다.

	예제 입력 1 
	2
	예제 출력 1 
	2 * 1 = 2
	2 * 2 = 4
	2 * 3 = 6
	2 * 4 = 8
	2 * 5 = 10
	2 * 6 = 12
	2 * 7 = 14
	2 * 8 = 16
	2 * 9 = 18
	*/
	
	/*
	 * while문으로 햇을 경우
	 * 
	 * int i=1;
	 * while(i<=9){
	 * System.out.println(i*n);
	 * i++;
	 * }
	 * 
	 * 
	 * 
	 */
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder st = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		
		
		for(int i=1;i<=9;i++) {
			st.append(n);
			st.append(" * ");
			st.append(i);
			st.append(" = ");
			st.append(n*i);
			st.append("\n");
		}
		System.out.println(st);
		
		
	}

}
