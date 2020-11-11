package algorithm_hj;

import java.util.Scanner;

public class Main_2798 {

	public static int[] temp;
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] arr = new int[N];
		for(int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		
		
		int max = 0;
		for(int i = 0; i < N; i++) {
			for(int j = 0 ; j < N; j++) {
				for(int z = 0 ; z < N; z++) {
					if( i != j && j != z && z != i) {
						int sum = (arr[i] + arr[j] + arr[z]);
						if(M >= sum && sum > max ) {
							max = sum;
						}
					}
				}
			}
		}
		System.out.println(max);
		
	}
	
}
