package example04_array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ex10_1546_평균 {

	/*문제
	세준이는 기말고사를 망쳤다. 세준이는 점수를 조작해서 집에 가져가기로 했다. 일단 세준이는 자기 점수 중에 최댓값을 골랐다.
	 이 값을 M이라고 한다. 그리고 나서 모든 점수를 점수/M*100으로 고쳤다.

	예를 들어, 세준이의 최고점이 70이고, 수학점수가 50이었으면 수학점수는 50/70*100이 되어 71.43점이 된다.

	세준이의 성적을 위의 방법대로 새로 계산했을 때, 새로운 평균을 구하는 프로그램을 작성하시오.

	입력
	첫째 줄에 시험 본 과목의 개수 N이 주어진다. 이 값은 1000보다 작거나 같다. 둘째 줄에 세준이의 현재 성적이 주어진다. 이 값은 100보다 작거나 같은 음이 아닌 정수이고, 적어도 하나의 값은 0보다 크다.

	출력
	첫째 줄에 새로운 평균을 출력한다. 실제 정답과 출력값의 절대오차 또는 상대오차가 10-2 이하이면 정답이다.

	예제 입력 1 
	3
	40 80 60
	예제 출력 1 
	75.0
	예제 입력 2 
	3
	10 20 30
	예제 출력 2 
	66.666667
	10-2 이하의 오차를 허용한다는 말은 정확히 소수 2번째 자리까지 출력하라는 뜻이 아니다.
	*/
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		// avg와 total 타입이 float면 값이 다르게 나오는 이유
		/*부동 소수점 숫자를 표현할 때 float은 32비트를 사용하고, double은 64비트를 사용합니다.
		따라서 double은 더 높은 정밀도를 가집니다. 여기서 중요한 점은 float은 높은 정밀도 숫자를 표현하지 못하고,
		정밀도 손실이 발생할 수 있다는 것입니다. 이로 인해 계산 결과가 다를 수 있습니다.*/
		
		double avg = 0f;
		double total = 0f;
		
		double[] subject = new double[Integer.parseInt(br.readLine())];//과목 갯수 할당
		st = new StringTokenizer(br.readLine()," ");// 과목 점수 입력
		
		for(int i=0;i<subject.length;i++) {
			subject[i] = Integer.parseInt(st.nextToken());//점수 할당
		}
		br.close();//버퍼 입력 닫아줌
		double max = subject[0]; //내가 입력한 과목 점수의 최대값 구하기
		
		for(int i=1;i<subject.length;i++) {//최댓값 로직
			if(max<subject[i]) {
				max = subject[i];
			}
		}
		
		for(int i=0;i<subject.length;i++){// 과목당 성적 올려치기 
			subject[i]=(double)(subject[i]/max)*100;
			total+=subject[i];//올려치기한 과목 총합
		}
		
		avg = total/subject.length;
		bw.write(Double.toString(avg));
		bw.flush();
		bw.close();
		
	}


	public static void rightAnser() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		double arr[] = new double[Integer.parseInt(br.readLine())];
        
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = Double.parseDouble(st.nextToken());
		}
		
		double sum = 0;
		Arrays.sort(arr);
		
		for(int i = 0; i < arr.length; i++) {
			sum += ((arr[i] / arr[arr.length - 1]) * 100);
		}
		System.out.print(sum / arr.length);
	}
}
	

