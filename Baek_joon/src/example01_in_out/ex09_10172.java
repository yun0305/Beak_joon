package example01_in_out;

public class ex09_10172 {
/*
	문제
	아래 예제와 같이 개를 출력하시오.

	입력
	없음.

	출력
	개를 출력한다.

	예제 입력 1 
	예제 출력 1 
	|\_/|
	|q p|   /}
	( 0 )"""\
	|"^"`    |
	||_/=\\__|
	*/
	public static void main(String[] args) {
		
	StringBuilder sb = new StringBuilder();
	
	sb.append("|\\_/|");
	sb.append("\n");
	sb.append("|q p|   /}");
	sb.append("\n");
	sb.append("( 0 )\"\"\"\\");
	sb.append("\n");
	sb.append("|\"^\"`    |");
	sb.append("\n");
	sb.append("||_/=\\\\__|");
	
	System.out.println(sb);
	
	}

}
