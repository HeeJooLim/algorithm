package algorithm_hj;
import java.util.Scanner;

public class Main_2606 {

	public static int[][] computers;
	public static boolean[] checked;
	public static int n;
	public static int m;
	public static int result = 0;
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		m = sc.nextInt();
		
		computers = new int[n+1][n+1];
		checked = new boolean[n+1];
		
		for(int i = 0; i < m; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			computers[x][y] = computers[y][x] = 1;
		}
		dfs(1);
		System.out.println(result-1);
	}
	
	public static void dfs(int start) {
		
		checked[start] = true;
		result++;
		
		for(int i = 1; i <= n; i++) {
			if(computers[start][i] == 1 && checked[i] == false) {
				dfs(i);
			}
		}
	}
	
}