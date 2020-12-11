package algorithm_hj;

import java.util.Arrays;
import java.util.Scanner;

public class Main_5052 {
	
	
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int num = sc.nextInt();
		for(int i = 0; i < num; i++) {
			start();
		}
	}
	
	public static void start() {
		
		int n = sc.nextInt();
		String[] arr = new String[n];
		for(int i = 0 ; i < n ;i++) {
			arr[i] = sc.next();
		}
		
		Arrays.sort(arr);
		
		boolean result = true;
		for(int i = 0; i < n -1; i++) {
			if(arr[i+1].startsWith(arr[i])) {
				result = false;
			}
		}
		System.out.println(result ? "YES" : "NO");
		
	}
	
	
}