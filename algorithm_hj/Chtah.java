package algorithm_hj;

import java.util.Scanner;

public class Chtah {

	public static int[] temp;
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		StringBuffer sb = new StringBuffer(); 
		
		for(int i = 0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		
		_merge(arr, size);
		
		for(int i : arr) {
			sb.append(i).append('\n');
		}
		System.out.println(sb);
		
	}
	
	
	public static void _merge(int[] arr, int size) {
		temp = new int[size];
		merge(arr, 0, arr.length - 1);
		temp = null;
	}

	
	public static void merge(int[] arr, int start, int end) {
		if(start < end) {
			int mid = (start + end) / 2;
			merge(arr, start, mid);
			merge(arr, mid + 1, end);
			
			int p = start;
			int q = mid + 1;
			int idx = p;
			
			while(p <= mid || q <= end) {
				if(q > end || (p <= mid && arr[p] < arr[q])) {
					temp[idx++] = arr[p++];
				} else {
					temp[idx++] = arr[q++];
				}
			}
			
			for(int i = start; i <= end; i++) {
				arr[i] = temp[i];
			}
		}
	}
	
}
