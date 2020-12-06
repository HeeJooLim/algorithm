package algorithm_hj;

import java.util.Scanner;

public class Main_15650 {
	
	public static int n, m;
	public static boolean[] visit;
	public static int[] arr;

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		
		arr = new int[m];
		visit = new boolean[n];
		
		solution(0, 0);
		
		sc.close();
	}
	
	
	public static void solution(int depth, int at) {
		
		if(depth == m) {
			for(int i : arr) {
				System.out.print(i + " ");
			}
			System.out.println("");
			return;
		}
		for(int i = at; i < n; i++) {
			if(!visit[i]) {
				visit[i] = true;
				arr[depth] = i + 1;
				solution(depth + 1, i + 1);
				visit[i] = false;
			}
		}
		
//		for(int i = 0; i < n; i++) {
//			if(depth == 0 || arr[depth -1] < i+1) {
//				if(!visit[i]) {
//					visit[i] = true;
//					arr[depth] = i + 1;
//					solution(depth + 1);
//					visit[i] = false;
//				}
//			}
//		}
//		
		
	}
	
}
