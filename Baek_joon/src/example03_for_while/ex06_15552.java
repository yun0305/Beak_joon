package example03_for_while;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ex06_15552 {

	/*문제
	본격적으로 for문 문제를 풀기 전에 주의해야 할 점이 있다. 입출력 방식이 느리면 여러 줄을 입력받거나 출력할 때 시간초과가 날 수 있다는 점이다.
	
	Java를 사용하고 있다면, Scanner와 System.out.println 대신 BufferedReader와 BufferedWriter를 사용할 수 있다. BufferedWriter.flush는 맨 마지막에 한 번만 하면 된다.
	
	또한 입력과 출력 스트림은 별개이므로, 테스트케이스를 전부 입력받아서 저장한 뒤 전부 출력할 필요는 없다. 테스트케이스를 하나 받은 뒤 하나 출력해도 된다.
	
	입력
	첫 줄에 테스트케이스의 개수 T가 주어진다. T는 최대 1,000,000이다. 다음 T줄에는 각각 두 정수 A와 B가 주어진다. A와 B는 1 이상, 1,000 이하이다.

	출력
	각 테스트케이스마다 A+B를 한 줄에 하나씩 순서대로 출력한다.

	예제 입력 1 
	5
	1 1
	12 34
	5 500
	40 60
	1000 1000
	예제 출력 1 
	2
	46
	505
	100
	2000*/
	
	//https://st-lab.tistory.com/30 참고
	
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		/*
		 * StringBuilder stb = new StringBuilder();로 출력하기
		 * BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 로 출력하기
		 * 잘라 내기는 split 이랑 Tokenizer 그리고 indexOf로 " " 값을 구한뒤 substring 으로 잘라내는 방법이 있다.
		 * 
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//StringBuilder stb = new StringBuilder();  100만개 까지는 근소하게 더 빠르다
		//(물론 데이터 양이 커지면 커질 수록 BufferedWriter 가 더 빠르다.)
		int testCase = Integer.parseInt(br.readLine());
		
		for(int i=0;i<testCase;i++) {
			
			//String[] str = br.readLine().split(" "); //split 사용
			String str = br.readLine();
			int target = str.indexOf(" ");
			int A = Integer.parseInt(str.substring(0,target));// target은 공백임
			int B = Integer.parseInt(str.substring(target+1));// target에 1을 더해주지 않으면 공백부터 끝까지 자른다.
			//stb.append(A+B); //StringBuilder 사용
			//stb.append("\n"); //StringBuilder 사용
			bw.write(A+B+"\n"); // BufferedWriter 사용
		}
		br.close();// BufferedWriter 사용
		bw.flush();// BufferedWriter 사용
		bw.close();// BufferedWriter 사용
		
		//System.out.println(stb); StringBuilder 사용

	}

}
