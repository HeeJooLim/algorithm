package algorithm_hj;

import java.util.Scanner;

public class Main_2193 {

	static long a = 0, b= 1;
	
	public static void main(String[] args)  {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		long temp;
		if(n == 1) {
			System.out.println(1);
		} else {
			for(int i = 2 ; i <= n; i++) {
				temp = b;
				b = a+b;
				a = temp;
			}
	        System.out.println(b);
		}
	}
	
}
