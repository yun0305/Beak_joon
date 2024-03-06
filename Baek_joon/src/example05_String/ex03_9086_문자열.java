package example05_String;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class ex03_9086_문자열 {

	/*문제
	문자열을 입력으로 주면 문자열의 첫 글자와 마지막 글자를 출력하는 프로그램을 작성하시오.

	입력
	입력의 첫 줄에는 테스트 케이스의 개수 T(1 ≤ T ≤ 10)가 주어진다.
	각 테스트 케이스는 한 줄에 하나의 문자열이 주어진다.
    문자열은 알파벳 A~Z 대문자로 이루어지며 알파벳 사이에 공백은 없으며 문자열의 길이는 1000보다 작다.

	출력
	각 테스트 케이스에 대해서 주어진 문자열의 첫 글자와 마지막 글자를 연속하여 출력한다.

	예제 입력 1 
	3
	ACDKJFOWIEGHE
	O
	AB
	예제 출력 1 
	AE
	OO
	AB*/
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] testCase = new String[Integer.parseInt(br.readLine())];
		String result = null;
		
		for(int i=0;i<testCase.length;i++) {
			testCase[i] = br.readLine();
		}
		br.close();
		for(int i=0;i<testCase.length;i++) {
			result = testCase[i].charAt(0)+""+testCase[i].charAt(testCase[i].length()-1)+"\n";
			bw.write(result);
		}
		
		bw.flush();
		bw.close();
	}
	
	public static void rightAnser1() {
		//substring() 메소드 사용
			Scanner sc = new Scanner(System.in);

			// 테스트 케이스의 개수 선언
			int T = sc.nextInt();

			String[] arr = new String[T];

			// 문자열 입력받기
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.next();
			}
			sc.close();

			// 입력받은 문자열을substring으로 0번째 끝번째를 출력한다.
			for (int i = 0; i < arr.length; i++) {

				// 만약 입력받은 문자열의 길이가 1자리면 앞 뒤 둘 다 출력
				if (arr[i].length() < 1) {
					System.out.println(arr[i] + "" + arr[i]);
				} else {
					System.out.print(arr[i].substring(0, 1)); // 0번째 1번째 출력
					System.out.println((arr[i].substring(arr[i].length() - 1, arr[i].length())));// 끝에서 -1번째부터 끝번째까지
				}

			}
		}

	}