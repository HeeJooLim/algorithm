package algorithm_hj;

import java.util.Scanner;

public class Main_14500 {
	
	public static int[][] arr;
	public static int max = Integer.MIN_VALUE;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		arr = new int[n+6][m+6];
		
		for(int i = 3; i < n + 3; i++) {
			for(int j = 3; j < m +3; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0; i < n+3; i++) {
			for(int j = 0; j < m + 3; j++) {
				dfs(i,j);
			}
		}
		
		System.out.println(max);
		sc.close();
		
	}
	
	public static void dfs(int x, int y) {
		int sum = 0;
		
		// 가로 직선
		sum += arr[x][y];
		sum += arr[x][y+1];
		sum += arr[x][y+2];
		sum += arr[x][y+3];
		
		max = Math.max(max, sum);
		sum = 0;
		
		// 세로 직선
		sum += arr[x][y];
		sum += arr[x+1][y];
		sum += arr[x+2][y];
		sum += arr[x+3][y];

		max = Math.max(max, sum);
		sum = 0;
		
		// 네모
		sum += arr[x][y];
		sum += arr[x+1][y];
		sum += arr[x][y+1];
		sum += arr[x+1][y+1];

		max = Math.max(max, sum);
		sum = 0;
		
		// ㄴ  모양
		sum += arr[x][y];
		sum += arr[x+1][y];
		sum += arr[x+1][y+1];
		sum += arr[x+1][y+2];
		
		max = Math.max(max, sum);
		sum = 0;
		
		// ㄴ 모양 시계방향 (1)
		sum += arr[x][y];
		sum += arr[x][y+1];
		sum += arr[x+1][y];
		sum += arr[x+2][y];
		max = Math.max(max, sum);
		sum = 0;
		
		// ㄴ 모양 시계방향 (2)
		sum += arr[x][y];
		sum += arr[x][y+1];
		sum += arr[x][y+2];
		sum += arr[x+1][y+2];
		max = Math.max(max, sum);
		sum = 0;
		
		// ㄴ 모양 시계방향 (3)
		sum += arr[x][y+1];
		sum += arr[x+1][y+1];
		sum += arr[x+2][y+1];
		sum += arr[x+2][y];
		max = Math.max(max, sum);
		sum = 0;
		
		// ㄴ 대칭
		sum += arr[x][y+2];
		sum += arr[x+1][y+2];
		sum += arr[x+1][y+1];
		sum += arr[x+1][y];

		max = Math.max(max, sum);
		sum = 0;
		
		// ㄴ 대칭(1)
		sum += arr[x][y];
		sum += arr[x+1][y];
		sum += arr[x+2][y];
		sum += arr[x+2][y+1];
		
		max = Math.max(max, sum);
		sum = 0;
		
		//ㄴ 대칭(2)
		sum += arr[x][y];
		sum += arr[x][y+1];
		sum += arr[x][y+2];
		sum += arr[x+1][y];
		

		max = Math.max(max, sum);
		sum = 0;
		
		// ㄴ 대칭(3)
		
		sum += arr[x][y];
		sum += arr[x][y+1];
		sum += arr[x+1][y+1];
		sum += arr[x+2][y+1];
	
		// ㅗ
		max = Math.max(max, sum);
		sum = 0;
		
		sum += arr[x][y+1];
		sum += arr[x+1][y];
		sum += arr[x+1][y+1];
		sum += arr[x+1][y+2];
	
		max = Math.max(max, sum);
		sum = 0;
		
		// ㅏ
		sum += arr[x][y];
		sum += arr[x+1][y];
		sum += arr[x+2][y];
		sum += arr[x+1][y+1];
		
		max = Math.max(max, sum);
		sum = 0;
		
		// ㅜ
		sum += arr[x][y];
		sum += arr[x][y+1];
		sum += arr[x][y+2];
		sum += arr[x+1][y+1];
		
		max = Math.max(max, sum);
		sum = 0;
		
		//ㅓ
		
		sum += arr[x+1][y];
		sum += arr[x][y+1];
		sum += arr[x+1][y+1];
		sum += arr[x+2][y+1];
		
		max = Math.max(max, sum);
		sum = 0;
		
		sum += arr[x][y+1];
		sum += arr[x][y+2];
		sum += arr[x+1][y];
		sum += arr[x+1][y+1];
		
		max = Math.max(max, sum);
		sum = 0;
		
		sum += arr[x][y];
		sum += arr[x+1][y];
		sum += arr[x+1][y+1];
		sum += arr[x+2][y+1];
		

		max = Math.max(max, sum);
		sum = 0;
		
		sum += arr[x][y];
		sum += arr[x][y+1];
		sum += arr[x+1][y+1];
		sum += arr[x+1][y+2];

		
		max = Math.max(max, sum);
		sum = 0;
		
		sum += arr[x][y+1];
		sum += arr[x+1][y+1];
		sum += arr[x+1][y];
		sum += arr[x+2][y];
		
		max = Math.max(max, sum);
	}
	
	
}