package algorithm_hj;

import java.util.Scanner;

public class Main_10819 {
	
	public static int[] arr;
	public static int[] newArr;
	public static boolean[] visit;
	public static int max = Integer.MIN_VALUE;
	public static int n;

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		arr = new int[n];
		newArr = new int[n];
		visit = new boolean[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		
		solution(0);
		System.out.println(max);
		
	}
	
	
	public static void solution(int depth) {
	
		if(depth == n) {
			int temp = 0;
			for(int i = 0; i < n -1; i++) {
				temp += Math.abs(newArr[i] - newArr[i+1]);
			}
			
			max = Math.max(max, temp);
			return;
		}
		
		for(int i = 0; i < n; i++) {
			if(!visit[i]) {
				visit[i] = true;
				newArr[depth] = arr[i];
				solution(depth + 1);
				visit[i] = false;
			}
		}
		
	}
	
}