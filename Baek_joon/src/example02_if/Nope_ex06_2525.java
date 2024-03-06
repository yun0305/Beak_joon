package example02_if;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Nope_ex06_2525 {

public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String[] st = bf.readLine().split(" ");
		
		int h = Integer.parseInt(st[0]);
		int m = Integer.parseInt(st[1]);
		int getM = Integer.parseInt(bf.readLine());
		
		if(h>=0&&h<=23&&m>=0&&m<60&&getM>=0&&getM<=1000) {
			
		if(m+getM>=60) {
			h+=(m+getM)/60;
			m = (m+getM)%60;
			if(h>=24) {//필요 없는 코드이다 0으로 만들어 주는게 아니라 h가 23을 초과하면 h에서 24를 빼주면 된다
				h=0;
			}
			if(h>=23) {//
				h=h-23;
			}
		}
		else if((m+getM)<60) {
			m+=getM;
		}
		
		System.out.println(h+" "+m);
		}
		
		
			
	}

}
