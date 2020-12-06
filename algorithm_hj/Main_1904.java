package algorithm_hj;

import java.util.Scanner;

public class Main_1904 {
	
	public static int a = 1;
	public static int b = 2;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int result = solution(n);
		sc.close();
		System.out.println(result);
	}
	
	
	public static int solution(int num) {
		if(num < 3) {
			return num;
		} else {
			for(int i = 3; i <= num; i++) {
				int temp = b;
				b = (a + b) % 15746 ;
				a = temp;
			}
			return b;
		}
		
	}
	
}