package algorithm_hj;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main_2667 {
	
	
	static int n;
	static int[][] arr;
	static boolean[][] visited;
	static ArrayList<Integer> result = new ArrayList<>();
	static int count = 0;
	
	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,-1,1};
	
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		arr = new int[n][n];
		visited = new boolean[n][n];
		
		for(int i = 0; i < n; i++) {
			char[] a = sc.next().toCharArray();
			for(int j = 0; j < n; j++) {
				arr[i][j] = a[j] - '0';
			}
		}
		
		sc.close();
		
		solution();
		
		Collections.sort(result);
		System.out.println(result.size());
		for(int i : result) {
			System.out.println(i);
		}
		
		
		
	}
	
	public static void solution() {
		for(int i = 0; i<n ; i++) {
			for(int j = 0; j<n ; j++) {
				if(visited[i][j] == false && arr[i][j] == 1) {
					bfs(i, j);
					result.add(count);
					count = 0;
				}
			}
		}
	}
	
	
	public static void bfs(int x, int y) {
		visited[x][y] = true;
		count++;
		
		for(int i = 0; i < 4 ;i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if(nx < n && ny < n && nx >=0 && ny >= 0 && arr[nx][ny] == 1 && visited[nx][ny] == false) {
				bfs(nx,ny);
			}
		}
	}
	
}

