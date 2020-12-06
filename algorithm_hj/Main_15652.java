package algorithm_hj;
import java.util.Scanner;

public class Main_15652 {
	
	public static int n, m;
	public static boolean[] visit;
	public static int[] arr;
	public static StringBuffer sb = new StringBuffer();

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		
		arr = new int[m];
		visit = new boolean[n];
		
		solution(0, 0);
		System.out.print(sb);
		sc.close();
	}
	
	
	public static void solution(int depth, int at) {
		
		if(depth == m) {
			for (int i = 0; i < m; i++) {
				sb.append(arr[i] + " ");
			}
			sb.append("\n");
			return;
		}
		
		for(int i = at; i < n; i++) {
			arr[depth] = i + 1;
			solution(depth + 1, i);
		}
	}
	
}