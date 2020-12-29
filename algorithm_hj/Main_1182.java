package algorithm_hj;

import java.util.Scanner;

public class Main_1182 {
	
	public static int result = 0;
	public static int n;
	public static int s;
	public static int[] arr;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		n = sc.nextInt();
		s = sc.nextInt();
		
		arr = new int[n];
		sc.nextLine();
        String input = sc.nextLine();
		
		for(int i = 0; i<n;i++) {
			 arr[i] = Integer.parseInt(input.split(" ")[i]);
		}
		
		for(int i = 0; i<n;i++) {
			solution(arr[i], i);
		}
		sc.close();
		
		System.out.println(result);

	}
	
	public static void solution(int total, int depth) {
		if(total == s && depth == n - 1) {
			result++;
		}
		
		depth++;
		if(depth < n) {
			solution(total + arr[depth], depth);
			solution(total, depth);
		}
		
	}
	
}

