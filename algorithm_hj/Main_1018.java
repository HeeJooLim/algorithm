package algorithm_hj;

import java.util.Scanner;

public class Main_1018 {
	
	public static char[][] arr;
	public static char[][] check = new char[2][8];
	public static int result = Integer.MAX_VALUE;
	
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		arr =  new char[row][col];
		
		for(int i = 0; i < row; i++) {
			arr[i] = sc.next().toCharArray();
		}
		sc.close();
		
		String check1 = "BWBWBWBW";
		String check2 = "WBWBWBWB";
		check[0] = check1.toCharArray();
		check[1] = check2.toCharArray();
		

		for(int i = 0 ; i < row - 7; i++) {
			for(int j = 0; j < col - 7; j++) {
				solution(i, j);
			}
		}
		System.out.println(result);
		
	}
	
	
	public static void solution(int startRow, int startCol) {
		int count = 0;
	
		for(int i = 0; i < 8; i++) {
			for(int j = 0; j < 8; j++) {
				if(i % 2 ==0 ) {
					if(check[0][j] != arr[i+startRow][j+startCol]) {
						count++;
					}
				} else {
					if(check[1][j] != arr[i+startRow][j+startCol]) {
						count++;
					}
				}
			}
		}
		result = Math.min(count, result);
		count = 0;
		
		for(int i = 0; i < 8; i++) {
			for(int j = 0; j < 8; j++) {
				if(i % 2 ==0) {
					if(check[1][j] != arr[i+startRow][j+startCol]) {
						count++;
					}
				} else {
					if(check[0][j] != arr[i+startRow][j+startCol]) {
						count++;
					}
				}
			}
		}
		result = Math.min(count, result);
		count = 0;
		
	}
	
}