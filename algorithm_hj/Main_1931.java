package algorithm_hj;


import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main_1931 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][2];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < 2; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		sc.close();
		
		Arrays.sort(arr, new Comparator<int[]>() {
			public int compare(int[] o1, int[] o2) {
				if(o1[1] == o2[1]) {
					return Integer.compare(o1[0], o2[0]);
				} 
				return Integer.compare(o1[1], o2[1]);
			}
		});
		
		int end = 0; // 회의가 끝나는 시간
		int count = 0;
		for(int j = 0; j < arr.length; j++) {
			if(end <= arr[j][0]) {
				end = arr[j][1];
				count++;
			}
		}
		System.out.println(count);
		
	}
	
}

