package example05_String;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ex11_11718_그대로_출력하기 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new  BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String in = null;
		
		for(int i=0;(in = br.readLine())!= null;i++) {
				bw.write(in+"\n");
			}	
		bw.flush();
	}

}
