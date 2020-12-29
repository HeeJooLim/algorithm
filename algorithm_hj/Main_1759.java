package algorithm_hj;
import java.util.Arrays;
import java.util.Scanner;

public class Main_1759 {
	
	public static String[] arr;
	public static boolean[] visit;
	public static int l;
	public static int c;
	public static String result;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		l = sc.nextInt();
		c= sc.nextInt();
		arr = new String[c];
		for(int i = 0; i < c; i++) {
			arr[i] = sc.next();
		}
		sc.close();
		visit = new boolean[c];
		
		Arrays.sort(arr);
		
		dfs(0, "", 0);
		
	}
	
	
	public static void dfs(int depth, String rs, int index) {
		
		if(depth == l) {
			System.out.println(rs);
			return;
		}
		
		for(int i = 0; i < c; i++) {
			if(index <= i) {
				if(!visit[i] && check(i, rs + arr[i])) {
					visit[i] = true;
					dfs(depth + 1, rs + arr[i], i);
					visit[i] = false;
				}
			}
		}
		
	}
	
	public static boolean check(int index, String rs) {
		
		int m = 0; // 모음
		int j = rs.length(); // 자음
		if(rs.contains("a")) {m++; j--;}
		if(rs.contains("e")) {m++; j--;}
		if(rs.contains("i")) {m++; j--;}
		if(rs.contains("o")) {m++; j--;}
		if(rs.contains("u")) {m++; j--;}
		int size = rs.length();
		
		if( size == l && (m < 1 || j < 2 )) {
			return false;
		}
		return true;
	}
	
	
	
}