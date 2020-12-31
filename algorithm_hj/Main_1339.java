package algorithm_hj;

import java.util.Arrays;
import java.util.Scanner;

public class Main_1339 {

	
	public static void main(String[] args)  {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr = new int[26];
		
		for(int i =0;  i< n; i++) {
			char[] str = sc.next().toCharArray();
			double t = Math.pow(10,str.length-1);
			for(char c : str) {
				int a = c - 'A';
				arr[a] += t;
				t /= 10;
			}
		}
		
		
		Arrays.sort(arr);
		
		int num = 9;
		int result = 0;
		
		for(int i = 25; i >=0; i--) {
			if(arr[i] == 0) break;
			result += num * arr[i];
			num--;
		}
		System.out.println(result);
		
		sc.close();
	}
	
}
