package algorithm_hj;

import java.util.Scanner;

public class Programmers_68645 {

	
	public static void main(String[] args)  {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] answer = new int[(n*(n+1))/2];
		int[][] arr = new int[n][n];
		
		int x = -1, y =0;
		int num = 1;
		
		for(int i = 0; i < n; i++) {
			for(int j = i; j <n; j++) {
				if(i % 3 == 0) x++;
				else if(i % 3 == 1) y++;
				else if (i % 3 == 2) {
					x--;
					y--;
				}
				arr[x][y] = num++; 
			}
		}
		
		int index = 0;
		for(int i = 0 ; i < n; i++) {
			for(int j = 0; j < i+1; j++) {
				answer[index++] = arr[i][j];
			}
		}
		
		for(int i : answer) {
			System.out.println(i);
		}
		
		
	}
	
}
