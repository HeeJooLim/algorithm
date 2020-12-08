package algorithm_hj;

import java.util.ArrayList;
import java.util.Scanner;

public class Main_2667 {
	
	public static int[][] arr;
	public static int n;
	public static boolean[][] checked;
	public static ArrayList<Integer> result = new ArrayList<Integer>();
	public static int count = 0;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		arr = new int[n][n];
		for(int i = 0; i <n; i++) {
			char[] a = sc.next().toCharArray();
			for(int j = 0; j < n; j++) {
				arr[i][j] = a[j] - '0'; 
			}
		}
		sc.close();
		
		checked = new boolean[n][n];
		
		start();
		
		result.sort(null);
		
		System.out.println(result.size());
		for(int i : result) {
			System.out.println(i);
		}
		
		
	}
	
	public static void start() {
		for(int i = 0; i< n; i++) {
			for(int j =0 ; j < n; j++) {
				if(checked[i][j] == false && arr[i][j] == 1) {
					bfs(i,j);
					result.add(count);
					count = 0;
				}
			}
		}
	}
	
	public static void bfs(int x, int y) {
		
		checked[x][y] = true;
		count++;
		int[] dx = { -1, 1, 0 , 0};
		int[] dy = { 0 , 0, 1, -1};
		
		for(int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			if(nx < n && ny < n && nx >=0 && ny >= 0 && arr[nx][ny] == 1 && checked[nx][ny] == false) {
				bfs(nx, ny);
			}
		}
		
	}
	
}