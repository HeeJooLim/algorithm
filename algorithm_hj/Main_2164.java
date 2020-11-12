package algorithm_hj;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main_2164 {
	
	public static void main(String[] args) {
		
		Queue<Integer> que = new LinkedList<Integer>();
		
		Scanner sc= new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		for(int i = 0; i < N; i++) {
			que.add(i+1);
		}
		
		int result = 0;
		while(!que.isEmpty()){
			int rs = que.poll();
			if(que.size() > 0) {
				que.add(que.poll());
			}
			result = rs;
		}
		
		System.out.println(result);
	}
	
}