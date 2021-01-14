package algorithm_hj;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main_11724 {
	
	
	static int[][] arr;
	static boolean[] visited;
	static int n, m;
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		n= sc.nextInt();
		m = sc.nextInt();
		
		arr = new int[n+1][n+1];
		visited = new boolean[n+1];
		
		for(int i = 0; i < m; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			arr[x][y] = arr[y][x] = 1;
		}
		
		sc.close();
		
		int count = 0;
		for(int i = 1; i<=n; i++) {
			if(visited[i] == false) {
				bfs(i);
				count++;
			}
		}
		System.out.println(count);
		
	}
	
	
	public static void bfs(int start) {
		
		Queue<Integer> queue = new LinkedList<>();
		visited[start] = true;
		
		queue.add(start);
		
		while(!queue.isEmpty()) {
			
			int temp = queue.poll();
			
			for(int i = 1; i <=n ; i++) {
				if(visited[i] == false && arr[temp][i] == 1 ) {
					queue.offer(i);
					visited[i] = true;
				}
			}
			
		}
	}
	
	
}



