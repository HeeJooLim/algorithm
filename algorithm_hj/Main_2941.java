package algorithm_hj;

import java.util.Scanner;

public class Main_2941 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String[] arr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

		for(int i = 0; i < arr.length; i++) {
			if(str.contains(arr[i])) {
				str = str.replaceAll(arr[i], "*");
			}
		}
		
		System.out.println(str.length());
		
	}
	
}
