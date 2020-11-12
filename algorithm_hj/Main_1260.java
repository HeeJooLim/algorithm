package algorithm_hj;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class Main_1260 {

	static int[][] graph; // 간선 연결상태
	static boolean[] checked; // 확인여부
	static int n; // 정점 개수
	static int m; // 간선 개수
	static int start; // 시작정점
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		m = sc.nextInt();
		start = sc.nextInt();
		
		graph = new int[n+1][n+1];
		checked = new boolean[n+1];
		
		for(int i = 0 ; i < m; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			graph[x][y] = graph[y][x] = 1;
		}
		sc.close();
		
		dfs(start);
		checked = new boolean[n+1];
		System.out.println();
		bfs();
	
		
	}
	
	public static void dfs(int i) {
		checked[i] = true;
		System.out.print(i + " ");
		
		for(int j = 1; j <=n; j++) {
			if(graph[i][j] == 1 && checked[j] == false) {
				dfs(j);
			}
		}
		
	}
	 public static void bfs() {
		 Queue<Integer> queue = new LinkedList<Integer>();
		 queue.offer(start);
		 checked[start] = true;
		 System.out.print(start + " ");
		 
		 
		 while(!queue.isEmpty()) {
			 
			 int temp = queue.poll();
			 
			 for(int j =1; j <=n; j++) {
				 if(graph[temp][j] == 1 && checked[j] == false) {
					 queue.offer(j);
					 checked[j] = true;
					 System.out.print(j + " ");
				 }
			 }
			 
		 }
	 }
}