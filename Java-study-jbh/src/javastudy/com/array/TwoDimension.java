package javastudy.com.array;

public class TwoDimension {
	
	public static void main(String[] args) {
//		int[][] arr = {1,2,3,4,5,6};
		int[][] arr = { {1,2,3}, {4,5,6} };
		
//		int[][] arr = { {1,2}, {4,5,6} };
		
		// 2*3
		for(int i=0; i<2; i++) {
			for(int j=0; j<3;j++) {
				System.out.println(arr[i][j]);
			}
		}
		// 13*2
	}
}
