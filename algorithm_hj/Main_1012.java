package algorithm_hj;
import java.util.Scanner;

public class Main_1012 {
	
	public static int[][] arr;
	public static boolean[][] visited;
	public static int count = 0;
	public static Scanner sc = new Scanner(System.in);
	public static int n;
	public static int m;
			
	public static void main(String[] args) {
		
		int num = sc.nextInt();
		for(int i = 0 ; i < num; i++) {
			abc();
			System.out.println(count);
			count = 0;
		}
		
	}
	
	public static void abc() {
		
		n = sc.nextInt();
		m = sc.nextInt();
		int ji = sc.nextInt();
		arr =  new int[n][m];
		visited = new boolean[n][m];
		
		for(int i = 0 ; i < ji ; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			arr[x][y] = 1;
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j <m; j++) {
				if(visited[i][j] == false && arr[i][j] == 1) {
					bfs(i,j);
					count++;
				}
			}
		}
	}
	
	public static void bfs(int x, int y) {
		
		visited[x][y] = true;
		int[] dx = {-1,1,0,0};
		int[] dy = {0,0,1,-1};
		for(int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if(nx>=0 && ny>=0 && nx< n && ny <m && visited[nx][ny] == false && arr[nx][ny]== 1) {
				bfs(nx,ny);
			}
		}
	}
	

}