package algorithm_hj;

import java.util.Scanner;

public class Main_9095 {

	public static void main(String[] args)  {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr =  new int[11];
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 4;
		
		for(int i = 4; i <= 10; i++) {
			arr[i] = arr[i-1] + arr[i-2] + arr[i-3];
		}
		
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.println(arr[sc.nextInt()]);
		}
		
	}
	
}
	
	 	