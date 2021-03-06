package algorithm_hj;


import java.util.Arrays;
import java.util.Scanner;

public class Main_10814 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n =  sc.nextInt();
		String[][] arr = new String[n][2];
		
		for(int i = 0; i < n; i++) {
			arr[i][0] = sc.next();
			arr[i][1] = sc.next();
		}
		sc.close();

		Arrays.sort(arr, (o1, o2) -> Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]));
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i][0] + " " + arr[i][1]);
		}
		
	}
	
}
