package algorithm_hj;

import java.util.Scanner;

public class Main_2580 {
	
	public static int[][] arr = new int[9][9];

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		sc.close();
		solution(0, 0);
	}
	
	
	public static void solution(int row, int col) {
	
		if(row == 9) {
			for(int i = 0; i < 9; i++) {
				for(int j = 0; j < 9; j++) {
					System.out.print(arr[i][j] + " ");
				}
				System.out.println("");
			}
			System.exit(0);
		}
		
		if(col == 9) {
			solution(row + 1, 0);
			return;
		}
		
		if(arr[row][col] == 0) {
			for(int i = 0; i < 9; i++) {
				if(test(row, col, i + 1)) {
					arr[row][col] = i + 1;
					solution(row, col + 1);
				} else {
					arr[row][col] = 0;
				}
			}
			arr[row][col] = 0;
			return;
		}else {
			solution(row, col + 1);
		}
		
	}
	
	public static boolean test(int row, int col, int value) {
		// 열 검사
		for(int i = 0; i < 9; i ++) {
			if(arr[row][i] == value) {
				return false;
			}
		}
		// 행 검사
		for(int i = 0; i < 9; i ++) {
			if(arr[i][col] == value) {
				return false;
			}
		}
		// 위치 검사
		int _row = (row/3) * 3;
		int _col = (col/3) * 3;
		for (int i = _row; i < _row + 3; i++) {
			for (int j = _col; j < _col + 3; j++) {
				if (arr[i][j] == value) {
					return false;
				}
			}
		}
		return true;
	}
	
}