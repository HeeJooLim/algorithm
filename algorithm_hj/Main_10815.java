package algorithm_hj;


import java.util.Arrays;
import java.util.Scanner;

public class Main_10815 {

	public static int[] temp;
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		int m = sc.nextInt();
		int[] b = new int[m];
		
		for(int i = 0; i < m; i++) {
			b[i] = sc.nextInt();
		}
		
		Arrays.sort(a);
		sc.close();
		
		int[] result = new int[m];
		
		for(int i = 0; i < m; i++) {
			if(search(a,b[i])) {
				result[i] = 1;
			} else {
				result[i] = 0;
			}
		}
		
		for(int num : result) {
			System.out.print(num + " ");
		}
		
	}
	
	// ÀÌºÐÅ½»ö
	public static boolean search(int[] arr, int num) {
		
		int left = 0;
		int right = arr.length -1;
		int mid;
		
		while(left <= right) {
			mid = (left+right) / 2;
			if(num == arr[mid]) {
				return true;
			}
			
			if(num < arr[mid]) {
				right = mid -1;
			} else {
				left = mid + 1;
			}
		}
		
		return false;
	}

	
}
