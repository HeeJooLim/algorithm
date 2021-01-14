package algorithm_hj;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DFS_BFS {
	
	public static int[][] arr;
	public static boolean[] checked; 
	
	public static int n;
	public static int m;
	public static int start;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt(); 
		m = sc.nextInt(); 
		start = sc.nextInt();
		
		
		arr = new int[1001][1001]; 
		checked = new boolean[1001];
		
		
		for(int i = 0; i < m; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			arr[x][y] = arr[y][x] = 1;
		}
		sc.close();
		
		//dfs(start);
		
		//checked = new boolean[1001];
		//System.out.println();
		//dfs(1);
		bfs();
	}

	
	public static void dfs(int start) {
		
		checked[start] = true;
		System.out.print(start + " ");
		
		for(int i = 1; i <=n; i++) {
			if(arr[start][i] == 1 && checked[i] == false) {
				dfs(i);
			}
		}
	}
	
	
	
	public static void bfs() {
		Queue<Integer> queue =  new LinkedList<>();
		
		queue.offer(start);
		checked[start] = true;
		System.out.print(start + " ");
		
		while(!queue.isEmpty()) {
			int temp = queue.poll();
			for(int i = 1; i<= n; i++) {
				if(checked[i] == false && arr[temp][i] == 1) {
					queue.offer(i);
					checked[i] = true;
					System.out.print(i + " ");
				}
			}
		}
	}
	
	
}