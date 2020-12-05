package algorithm_hj;

import java.util.Scanner;

public class Main_9663 {
	
	public static int[] arr;
	public static int result;
	public static int n;
	
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		sc.close();
		arr = new int[n];
		solution(0);
		System.out.println(result);
		
	}
	
	public static void solution(int num) {
		
		if(num ==n ) {
			result++;
			return;
		}
		
		for(int i =0; i< n; i++) {
			arr[num] = i;
			if(result(num)) {
				solution(num+1);
			}
		}
		
	}
	
	public static boolean result(int hang) {
		
		for(int i =0; i < hang; i++) {
			if(arr[i] == arr[hang]) {
				return false;
			}
			
			if(Math.abs(hang-i) == Math.abs(arr[hang] - arr[i])) {
				return false;
			}
		}
		
		
		return true;
	}
	
	
}
