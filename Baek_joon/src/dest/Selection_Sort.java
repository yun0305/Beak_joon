package dest;


public class Selection_Sort {

	public static void main(String[] args) {
		//7 3 2 8 9 4 6 1 5
		
		int[] arr = new int[] {7,3,2,8,9,4,6,1,5};
		int stock = 0;
		
		for(int i=0;i<arr.length-1;i++) {//마지막 인덱스는 바꿔줄필요가 없기 때문에 배열길이에 -1
			//최솟값을 갖고 있는 인덱스 찾기
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]){
					stock = arr[j];
					arr[j] = arr[i];
					arr[i] = stock;
					
				}
			}
		}
		
		for(int all : arr) {
			System.out.println(all);
		}
		
		
	}

}
