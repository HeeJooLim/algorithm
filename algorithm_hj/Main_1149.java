package algorithm_hj;

import java.util.Scanner;

public class Main_1149 {
	
	static int[][] arr, rs;
	
	public static void main(String[] args)  {
		
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		
		arr = new int[n][3];
		rs = new int[n][3];
		
		for(int i = 0; i < n; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
			arr[i][2] = sc.nextInt();
		}
		
		sc.close();

		rs[0][0] = arr[0][0];
		rs[0][1] = arr[0][1];
		rs[0][2] = arr[0][2];
	
		
		int result = Math.min(solution(n-1, 0), solution(n-1, 1));
		result = Math.min(result, solution(n-1, 2));
		
		System.out.println(result);
		
	}
	
	public static int solution(int n, int color) {
		
		if(rs[n][color] == 0) {
			if(color == 0) {
				rs[n][0] = Math.min(solution(n-1, 1), solution(n-1, 2)) + arr[n][0];
			} else if (color == 1 ) {
				rs[n][1] = Math.min(solution(n-1, 0), solution(n-1, 2)) + arr[n][1];
			} else {
				rs[n][2] = Math.min(solution(n-1, 0), solution(n-1, 1)) + arr[n][2];
			}
		}
		
		return rs[n][color];
		
	}
	
}
	
	 	