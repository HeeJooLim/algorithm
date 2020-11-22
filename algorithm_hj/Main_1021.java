package algorithm_hj;


import java.util.LinkedList;
import java.util.Scanner;

public class Main_1021 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> queue = new LinkedList<>();
		int n = sc.nextInt();
		int m =sc.nextInt();
		
		for(int i =1; i <= n; i++) {
			queue.offer(i);
		}
		
		int num;
		int count = 0;
		for(int i = 0; i < m; i++) {
			num = sc.nextInt();
			
			while(num != queue.peekFirst()) {
				if(queue.indexOf(num) <= queue.size() / 2) {
					queue.addLast(queue.pollFirst());
				} else {
					queue.addFirst(queue.pollLast());
				}
				count++;
			}
			queue.removeFirst();
		}
		sc.close();
		System.out.println(count);
		
	}
	
	
}