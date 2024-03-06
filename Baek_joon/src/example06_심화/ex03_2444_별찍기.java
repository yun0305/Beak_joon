package example06_심화;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex03_2444_별찍기 {

//	문제
//	예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요.
//
//	입력
//	첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
//
//	출력
//	첫째 줄부터 2×N-1번째 줄까지 차례대로 별을 출력한다.
//
//	예제 입력 1 
//	5
//	예제 출력 1 
//	    *
//	   ***
//	  *****
//	 *******
//	*********
//	 *******
//	  *****
//	   ***
//	    *
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i=1;i<=n;i++) {
			
			for(int j=0;j<n-i;j++)
				System.out.print(" ");
			
			for(int j=0;j<i*2-1;j++)
				System.out.print("*");
			System.out.println();
		}
		
		for(int i=n-1;i>=0;i--) {//5에서 1까지 위와는 반대로 돌리는 이유는 
			
			for(int j=0;j<n-i;j++)//i값이 5에서 1로 줄어들면서 공백을 출력해야 하기때문이고
				System.out.print(" ");
			
			for(int j=0;j<i*2-1;j++)//별이 5개에서 1개까지 떨어져야 하기 때문
				System.out.print("*");
			System.out.println();
		}
		

	}

}
