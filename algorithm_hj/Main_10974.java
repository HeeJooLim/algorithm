package algorithm_hj;

import java.util.Scanner;

public class Main_10974 {

	static int[] output;
	static boolean[] visited;
	static int n;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		sc.close();
		
		output = new int[n];
		int[] arr = new int[n];
		visited = new boolean[n];
		
		for(int i = 0; i < n; i++) {
			visited[i] = true;
			dfs(arr, i, 0);
			visited[i] = false;
		}
		
		
		
	}
	
	public static void dfs(int[] arr, int start, int depth) {
		output[depth] = start + 1;
		
		if(depth == n - 1) {
			for(int i = 0; i< n; i++) {
				System.out.print(output[i] + " ");
			}
			System.out.println("");
			return;
		}
		
		for(int i = 0; i < n; i++) { // n의 경우의 수
			if(!visited[i]) {
				visited[i] = true;
				dfs(arr, i, depth+1);
				visited[i] = false;
			}
		}
		
	}
	

	
}




