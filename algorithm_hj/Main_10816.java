package algorithm_hj;

import java.util.HashMap;
import java.util.Scanner;

public class Main_10816 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		
		int m = sc.nextInt();
		int[] find = new int[m];
		for(int i = 0; i < m; i++) {
			find[i] = sc.nextInt();
		}
		sc.close();
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i = 0; i < n; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
		}
		
		for(int i = 0; i < m; i++) {
			if(map.containsKey(find[i])) {
				find[i] = map.get(find[i]);
			} else {
				find[i] = 0;
			}
		}
		
		for(int i : find) {
			sb.append(i + " ");
		}
		System.out.println(sb);
	}
	
	
}

