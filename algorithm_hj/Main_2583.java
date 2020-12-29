package algorithm_hj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_2583 {
	
	
	static int[][] arr;
	static boolean[][] visited;
	static int n, m, k;
	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,-1,1};
	static int count = 0;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		m = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		
		arr = new int[n][m];
		visited = new boolean[n][m];
		
		for(int i = 0; i < k; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			
			for(int x = x1; x < x2; x++) {
				for(int y = y1; y < y2; y++) {
					arr[x][y] = 1;
				}
			}
			
		}
		
		
		ArrayList<Integer> result = new ArrayList<>();
		for(int i = 0;  i< n; i++) {
			for(int j = 0 ;  j< m; j++) {
				if(visited[i][j] == false && arr[i][j] == 0) {
					// bfs
					int cnt = bfs(i, j);
					result.add(cnt);
					
					//dfs
//					dfs(i, j);
//					result.add(count);
					//count = 0;
				}
			}
		}
		
		Collections.sort(result);
		
		System.out.println(result.size());
		
		for(int i : result) {
			System.out.print(i + " ");
		}
		
		
		
	}
	
	
	
	
	public static int bfs(int x, int y) {
		visited[x][y] = true;
		Queue<int[]> queue = new LinkedList<>();
		queue.offer(new int[]{x,y});
		
		int count = 1;
		
		
		while(!queue.isEmpty()) {
			int[] data = queue.poll();
			int curX = data[0];
			int curY = data[1];
			
			for(int i = 0; i < 4; i++) {
				int nx = curX + dx[i];
				int ny = curY + dy[i];
				
				if(nx >=0 && ny >=0 && nx < n && ny < m) {
					if(visited[nx][ny] == false && arr[nx][ny] == 0) {
						visited[nx][ny] = true;
						queue.offer(new int[] {nx,ny});
						count++;
					}
				}
			}
		}
		
		return count;
		
	}
	
	
	public static void dfs(int x, int y) {
		visited[x][y] = true;
		count++;
		for(int i = 0 ; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if(nx < n && ny < m && nx >=0 && ny >= 0 && visited[nx][ny] == false && arr[nx][ny] == 0) {
				dfs(nx,ny);
			}
		}
	}


	
}

 	
 	