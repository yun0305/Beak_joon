package example02_if;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex07_2480_복습 {

	/*문제
	1에서부터 6까지의 눈을 가진 3개의 주사위를 던져서 다음과 같은 규칙에 따라 상금을 받는 게임이 있다. 

	같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다. 
	같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다. 
	모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.  
	예를 들어, 3개의 눈 3, 3, 6이 주어지면 상금은 1,000+3×100으로 계산되어 1,300원을 받게 된다. 또 3개의 눈이 2, 2, 2로 주어지면 10,000+2×1,000 으로 계산되어 12,000원을 받게 된다. 3개의 눈이 6, 2, 5로 주어지면 그중 가장 큰 값이 6이므로 6×100으로 계산되어 600원을 상금으로 받게 된다.

	3개 주사위의 나온 눈이 주어질 때, 상금을 계산하는 프로그램을 작성 하시오.

	입력
	첫째 줄에 3개의 눈이 빈칸을 사이에 두고 각각 주어진다. 

	출력
	첫째 줄에 게임의 상금을 출력 한다.

	예제 입력 1 
	3 3 6
	예제 출력 1 
	1300
	예제 입력 2 
	2 2 2
	예제 출력 2 
	12000
	예제 입력 3 
	6 2 5
	예제 출력 3 
	600
	*/
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
		String[] st = br.readLine().split(" "); 
		
		int a = Integer.parseInt(st[0]);
		int b = Integer.parseInt(st[1]);
		int c = Integer.parseInt(st[2]);
		
		// 만약 모든 변수가 다른 경우
			if (a != b && b != c && a != c) {
				int max;
				// 만약 a > b 라면
				if (a > b) {
					// c > a > b 라면
					if (c > a) {
						max = c;
					} 
					// a > (b, c)
					else {
						max = a;
					}
				}
				// b > a 라면	
				else {
					// c > b > a 라면
					if (c > b) {
						max = c;
					}
					// b > (a, c)
					else {
						max = b;
					}
				}
				System.out.println(max * 100);
			}
			// 적어도 한 쌍 이상의 서로 같은 변수가 존재할 경우
			else {
				// 3개의 변수가 모두 같은 경우
				if (a == b && a == c) {
					System.out.println(10000 + a * 1000);
				}
				else {
					 // a가 b혹은 c랑만 같은 경우
					if(a == b || a == c) {
						System.out.println(1000 + a * 100);
					}
					// b가 c랑 같은 경우
					else {
						System.out.println(1000 + b * 100);
					}
				}
			}
		}
	
	
		
		
		
		
		/*int sang = 0;
		
		if(a==b&&b==c) {
			sang=10000+a*1000;
		}
		else if(a!=b&&b!=c&&a!=c) {
			int max = 0;
			if(a>b&&a>c) {
				max = a;
			}
			else if(b>c&&b>a) {
				max=b;
			}
			else {
				max = c;
			}
			sang=max*100;
		}
		else {
			int equals = 0;
			if(a==b) {
				equals = a;
			}
			else if(a==c) {
				equals = a;
			}
			else if(b==c) {
				equals = b;
			}
			
			sang = 1000+equals*100;
		}

		System.out.println(sang);*/
		
	}


