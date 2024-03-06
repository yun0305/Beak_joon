package example01_in_out;

public class ex08_10171 {
/*
	문제
	아래 예제와 같이 고양이를 출력하시오.

	입력
	없음.

	출력
	고양이를 출력한다.

	예제 입력 1 
	예제 출력 1 
	\    /\
	 )  ( ')
	(  /  )
	 \(__)|
	*/
	//이스케이프 시퀀스로 역슬래시는 단독으로 사용할수 없다 두개를 붙여줘야한다.
	//단독으로 사용할수 없고 문자열 조합으로 사용해야 하는걸 이스케이프 시퀀스라고 한다
	
	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("\\    /\\");
		sb.append("\n");
		sb.append(" )  ( ')");
		sb.append("\n");
		sb.append("(  /  )");
		sb.append("\n");
		sb.append(" \\(__)|");
		
		System.out.println(sb);
		
		

	}

}
