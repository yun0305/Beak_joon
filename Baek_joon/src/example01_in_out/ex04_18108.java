package example01_in_out;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ex04_18108 {

	/*
	ICPC Bangkok Regional에 참가하기 위해 수완나품 국제공항에 막 도착한 팀 레드시프트 일행은 눈을 믿을 수 없었다.
	 공항의 대형 스크린에 올해가 2562년이라고 적혀 있던 것이었다.

	불교 국가인 태국은 불멸기원(佛滅紀元), 즉 석가모니가 열반한 해를 기준으로 연도를 세는 불기를 사용한다. 반면, 우리나라는 
	서기 연도를 사용하고 있다.
	 불기 연도가 주어질 때 이를 서기 연도로 바꿔 주는 프로그램을 작성하시오.

	입력
	서기 연도를 알아보고 싶은 불기 연도 y가 주어진다. (1000 ≤ y ≤ 3000)

	출력
	불기 연도를 서기 연도로 변환한 결과를 출력한다.

	예제 입력 1 
	2541
	예제 출력 1 
	1998	
	*/
	public static void main(String[] args) throws IOException {
		//Scanner 사용방법
		Scanner scan = new Scanner(System.in);
		
		int y = scan.nextInt();
		int koreaYear = y-543;
		
		System.out.println(koreaYear);
		
		//BufferedReader 사용방식
		/*
		 * 입력 방법을 Scanner 대신 BufferedReader 을 사용하여 풀이하는 방법이다.
		 *  단, BufferedReader 는 한 줄 단위로 읽은 뒤 문자열로 반환하기 때문에
		 *   주어지는 입력에 대한 문자열을 정수로 변환해주는 과정이 필요하다.
		 * 이를 위해서는 Integer 클래스의 parseInt()라는 메소드를 사용하면 되는데,
		 * 숫자형식의 문자열에 대해 정수형으로 반환해주는 역할을 한다.
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		int year = Integer.parseInt(s);
		
		System.out.println(year-543);
		
		/*
		 * Scanner 보다 BufferedReader가 과정이 하나 더 거쳐감에도 빠른데
		 * 이는 Scanner가 입력을 읽어들이는 과정에서 정규식 검사가 상당히 오래
		 * 걸리기 때문이다 이러한 이유로 대개 자바 알고리즘을 푸는 경우 BufferedReader를 사용한다
		 */
	}
	
}
