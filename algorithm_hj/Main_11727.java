package algorithm_hj;

import java.util.Scanner;

public class Main_11727 {
	
	static int[] dp;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n =sc.nextInt();
		sc.close();
		
		dp = new int[n+1];
		
		dp[0] = 0;
		dp[1] = 1;
		dp[2] = 3;
		
		if(n == 1 || n == 2) {
			System.out.println(dp[n]);
		} else {
			for(int i = 3; i <= n; i++) {
				int num = dp[i-1] + (dp[i-2]*2);
				dp[i] = num % 10007;
			}
			
			System.out.println(dp[n]);
		}
		
	}
	
}
