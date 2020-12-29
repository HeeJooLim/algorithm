package algorithm_hj;

import java.util.Scanner;

public class Main_2579 {

	static int[] arr;
	static Integer[] result;
	
	public static void main(String[] args)  {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		arr = new int[n+1];
		result = new Integer[n+1];
		for(int i = 1 ; i <= n ; i++) {
			arr[i] = sc.nextInt();
		}
		
		result[0] = arr[0];
		result[1] = arr[1];
		
		if(n >= 2) {
			result[2] = arr[1] + arr[2];
		}
		
		System.out.println(solution(n));
		
	}
	
	public static int solution(int n) {
		
		if(result[n] == null) {
			result[n] = Math.max(solution(n-2), solution(n-3) + arr[n-1]) + arr[n];
		}
		
		
		return result[n];
	}
	
	
	
}
	
	 	