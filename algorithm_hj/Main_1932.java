package algorithm_hj;

import java.util.Scanner;

public class Main_1932 {

	static int[][] arr;
	static Integer[][] result;
	static int N;
	
	public static void main(String[] args)  {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		arr = new int[N][N];
		result = new Integer[N][N];
		
		for(int j = 0; j < N; j++) {
			for(int i = 0; i < N; i++) {
				arr[j][i] = -1;
			}
		}
		
		for(int j = 0; j < N; j++) {
			for(int i = 0; i < j + 1; i++) {
				arr[j][i] = sc.nextInt();
			}
		}
		sc.close();
		
		result[0][0] = arr[0][0];
		result[0][1] = arr[0][1];
	
		int result = Integer.MIN_VALUE;
		for(int i = 0; i < N; i++) {
			result = Math.max(result, solution(N-1, i));
		}
		System.out.println(result);
		
		
	}
	
	public static int solution(int n, int index) {
		
		if(result[n][index] == null) {
			if(index == 0) {
				result[n][index] = arr[n][index] + solution(n-1, index);
			} else if ( n < index){
				result[n][index] = arr[n][index] + solution(n-1, index-1);
			} else {
				result[n][index] = arr[n][index] + Math.max(solution(n-1, index-1), solution(n-1, index));
			}
		}
		
		return result[n][index];
	}
	
	
}
	
	 	

