package algorithm_hj;

import java.util.LinkedList;
import java.util.Scanner;

public class Main_11866 {
	
	public static void main(String[] args) {
		
		LinkedList<Integer> queue = new LinkedList<>();
		StringBuilder sb = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt() - 1;
		int idx = K;
		
		sb.append("<");
		
		for (int i = 1; i <= N; i++)
			queue.add(i); 
		
		
		while (queue.size() != 1) {
			sb.append(queue.get(idx).toString() + ", ");
			queue.remove(idx);
			idx = (idx + K) % queue.size();
		}
		
		
		sb.append(queue.pop().toString() + ">");
		System.out.print(sb);

		sc.close();
	}
}
