package algorithm_hj;

import java.util.Scanner;

public class Main_15649 {
	
	public static int n, m;
	public static boolean[] visit;
	public static int[] arr;

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		
		arr = new int[m];
		visit = new boolean[n];
		
		solution(0);
		
		sc.close();
	}
	
	
	public static void solution(int depth) {
		
		if(depth == m) {
			for(int i : arr) {
				System.out.print(i + " ");
			}
			System.out.println("");
			return;
		}
		for(int i = 0; i < n; i++) {
			if(!visit[i]) {
				visit[i] = true;
				arr[depth] = i + 1;
				solution(depth + 1);
				visit[i] = false;
			}
		}
	}
	
}