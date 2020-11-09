package algorithm_hj;

import java.util.Arrays;
import java.util.Scanner;

public class Main_1026 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] A = new int[size];
		int[] B = new int[size];
		
		
		for(int i=0; i < size; i++) {	
			A[i] = sc.nextInt();
		}
		for(int i=0; i < size; i++) {
			B[i] = sc.nextInt();
		}
		
		sc.close();
		
		Arrays.sort(A);
		Arrays.sort(B);
		int sum = 0;
		for(int i=0; i < size; i++) {
			sum += A[i] * B[size-i-1];
		}
		System.out.println(sum);
		
	}
	
}
