package dest;

import java.util.Scanner;

public class Bubble_Sort {

	public static void main(String[] args) {
		//8 2 3 9 6
		/*[장점]
				1. 추가적인 메모리 소비가 작다.

				2. 구현이 매우 쉽다.

				3. 안정정렬이 가능하다.*/
			
			// 버블 정렬
			int[] arr = new int[] {8,2,3,9,6};
			int stock = 0; 
			
			//라운드는 배열 크기의 1만큼 줄어듬
			for(int i=1; i<arr.length;i++) {
				// 각 라운드별 비교횟수는 배열 크기의 현재 라운드를 뺀 만큼 비교함
				for(int j=0;j<arr.length-i;j++) {//arr.length-i로 점점 라운드 횟수가 줄어듬
					
					if(arr[j]>arr[j+1]) {// 중요 서로 인접한 원소가 하나씩 옆으로 이동하면서 정렬
						
						stock = arr[j];
						arr[j] = arr[j+1];
						arr[j+1] = stock;
						
						
					}
					
				}
				
			}
			
			for(int all : arr) {
				System.out.println(all);
			}
	}
}