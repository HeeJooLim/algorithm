package algorithm_hj;

import java.util.Scanner;

public class Main_4963 {
	
	
	static int[] dx = {-1, 1, 0, 0, -1, 1, -1, 1};
	static int[] dy = {0, 0, -1, 1, -1, 1, 1, -1};
	static int[][] arr;
	static boolean[][] visited;
	static int n,m;
	static int count = 0;
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		while(true) {

			m = sc.nextInt();
			n = sc.nextInt();
			
			if(!( m == 0 && n == 0 )) {
				
				arr = new int[n][m];
				visited = new boolean[n][m];
				
				for(int i = 0; i < n; i++) {
					for(int j = 0; j < m; j++) {
						arr[i][j] = sc.nextInt(); 
					}
				}
				solution();
				System.out.println(count);
				count = 0;
			} else {
				break;
			}
		}
		sc.close();
		
	}
	
	public static void solution() {
		for(int i = 0; i < n; i++) {
			for(int j = 0;  j<m; j++) {
				if(visited[i][j] == false && arr[i][j] == 1) {
					dfs(i,j);
					count++; 
				}
			}
		}
	}
	
	public static void dfs(int x, int y) {
		
		visited[x][y] = true;
		
		for(int i = 0; i < 8; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			if(nx < n && ny < m && nx >=0 && ny >= 0 && arr[nx][ny] == 1 && visited[nx][ny] == false) {
				dfs(nx,ny);
			}
		}
	}

	
}

