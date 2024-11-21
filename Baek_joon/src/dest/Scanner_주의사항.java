package dest;

import java.io.IOException;
import java.util.Scanner;

public class Scanner_주의사항 {
	
	
	public static void main(String[] args) throws IOException {
		//https://deftkang.tistory.com/55 참조
		//next 공백 기준으로 문자를 받음
		//nextLine 엔터키를 기준으로 문자를 받은
		
		Scanner scanner = new Scanner(System.in);
	        
		System.out.println("첫번째 정수입력: ");
		int i = scanner.nextInt();
		System.out.println(i);

		System.out.println("첫번째 문자열입력: ");

		// System.in.read()와 Scanner는 서로 다른 입력 버퍼를 사용한다.
		// System.in.read()는 System.in에서 한 글자를 읽어 아스키 코드 값으로 반환하지만,
		// Scanner의 버퍼와 동기화되지 않으므로 Scanner로 입력을 처리할 때 문제가 발생할 수 있다.
		System.in.read(); 

		// scanner.nextLine(); // next() 또는 nextInt()에서 남은 엔터값은 nextLine()을 호출하여 버퍼를 비워준다.

		// BufferedReader는 엔터 키를 포함한 줄바꿈 문자를 처리하고 버퍼에 남기지 않는다.
		// 따라서 엔터 키 처리 문제가 발생하지 않는다.
		String str1 = scanner.nextLine(); // 문자열을 읽음
		System.out.println(str1);

		System.out.println("두번째 정수입력: ");
		int j = scanner.nextInt(); // 정수 입력
		System.out.println(j);

		System.out.println("두번째 문자열입력: ");
		String str2 = scanner.next(); // 단어 입력
		System.out.println(str2);

		System.out.println();

		System.out.println(i);
		System.out.println(str1);
		System.out.println(j);
		System.out.println(str2);

	}
	/*
	 	
    
    
	 */
	
}
