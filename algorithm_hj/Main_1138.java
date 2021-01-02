package algorithm_hj;

import java.util.ArrayList;
import java.util.Scanner;

public class Main_1138 {

	
	public static void main(String[] args)  {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		for(int i =0 ; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i = n-1 ; i >= 0; i--) {
			list.add(arr[i], i+1);
		}
		
		for(int a : list) {
			System.out.print(a + " ");
		}
		sc.close();
	}
	
}
