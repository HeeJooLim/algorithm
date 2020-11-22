package algorithm_hj;


import java.util.PriorityQueue;
import java.util.Scanner;

public class Main_1927 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		for(int i=0; i< size; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		solution(arr);
	}
	
	static void solution(int[] arr) {
		
		PriorityQueue<Integer> queue = new PriorityQueue<>();
	
		for(int i = 0; i < arr.length; i++) {
			
			if(arr[i] == 0) {
				if(queue.isEmpty()) {
					System.out.println(0);
				} else {
					System.out.println(queue.poll());
				}
			} else {
				queue.add(arr[i]);
			}
		}
	
	}
	
	
	
}
