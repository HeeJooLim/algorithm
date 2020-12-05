package algorithm_hj;

import java.util.Scanner;

public class Main_5585 {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		System.out.println(solution(1000-num));
		
	}
	
	public static int solution(int num) {
		int result = 0;
		
		if(num >= 500){
			result += num / 500;
			num %= 500;
		}
		
		if(num >= 100) {
			result += num / 100;
			num %= 100;
		}
		
		if(num >= 50) {
			result += num / 50;
			num %= 50;
		}
		
		if(num >= 10) {
			result += num / 10;
			num %= 10;
		}
		
		if(num >= 5) {
			result += num / 5;
			num %= 5;
		}
		
		if(num >= 1) {
			result += num / 1;
			num %= 1;
		}
		
		return result;
	}
	
	
}
