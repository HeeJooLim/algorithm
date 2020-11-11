package algorithm_hj;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main_2309 {

	public static int[] temp;
	
	public static void main(String args[]) throws NumberFormatException, IOException {
		
		Scanner sc = new Scanner(System.in);
		int size = 9;
		int[] arr = new int[size]; 
		int sum = 0;
		for(int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		sc.close();
		
		Arrays.sort(arr);
		
		
		for(int i = 0; i < size - 1; i++) {
			for(int j = i; j < size; j++) {
				if(sum - (arr[i] + arr[j]) == 100) {
					for(int a = 0; a < size; a++) {
						if(a == i || a == j) {
							continue;
						}
						System.out.println(arr[a]);
					}
					return;
				}
			}
		}
	}
	
}