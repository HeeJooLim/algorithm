package algorithm_hj;

import java.util.Scanner;

public class Main_2231 {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		int result = 0;
		
		for(int i = 0; i < N; i++) {
			int num = i, sum = 0;
			
			while(num != 0) {
				sum += num % 10;
				num = num / 10;
			}
			
			if(sum + i == N) {
				result = i;
				break;
			}
		}
		
		System.out.println(result);
		
	}
	
}