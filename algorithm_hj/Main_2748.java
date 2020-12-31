package algorithm_hj;

import java.util.Scanner;

public class Main_2748 {

	static long a = 0, b= 1;
	
	public static void main(String[] args)  {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		long temp;
		for(int i = 2 ; i <= n; i++) {
			temp = b;
			b = a+b;
			a = temp;
		}
        System.out.println(b);
	
        sc.close();
	}
	
}
