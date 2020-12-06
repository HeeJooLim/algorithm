package algorithm_hj;

import java.util.Scanner;

public class Main_14888 {
	
	public static int[] arr;
	public static int n;
	public static int[] operator = new int[4];
	public static int result = 0;
	public static String result2 = "";
	
	
	public static int max = Integer.MIN_VALUE;
	public static int min = Integer.MAX_VALUE;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0 ; i < 4; i++) {
			operator[i] = sc.nextInt();
		}
		sc.close();
		
		solution(arr[0], 1);
		
		System.out.println(max);
		System.out.println(min);
		
		
	}
	
	
	public static void solution(int num, int index) {
		
		if(index == n) {
			max = Math.max(max, num);
			min = Math.min(min, num);
			return;
		}
		
		for(int i = 0; i < 4; i++) {
			int temp = num;
			if(operator[i] > 0) {
				if(i == 0) {
					temp = temp + arr[index];
				} else if(i == 1) {
					temp = temp - arr[index];
				} else if(i == 2) {
					temp = temp * arr[index];
				} else if(i == 3) {
					temp = temp / arr[index];
				}
				operator[i]--;
				solution(temp, index + 1);
				temp = num;
				operator[i]++;
			}
		}
		
	}
	
}