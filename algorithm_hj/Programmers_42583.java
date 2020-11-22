package algorithm_hj;


import java.util.Queue;
import java.util.LinkedList;

public class Programmers_42583 {



	public static void main(String[] arr) {
		int[] a = {7,4,5,6};
		System.out.println(solution(2, 10, a));
	}
	
	static int solution(int bridge_length, int weight, int[] truck_weights) {
		int answer = 0;
			
		Queue<Integer> queue = new LinkedList<>();
		
		int sum = 0;
		for(int t : truck_weights) {
			
			while(true) {
				if(queue.isEmpty()) {
					queue.add(t);
					sum += t;
					answer++;
					break;
				} else if(queue.size() == bridge_length){
					sum -= queue.poll();
				} else {
					if(sum + t > weight) {
						queue.add(0);
						answer++;
					} else {
						queue.add(t);
						sum += t;
						answer++;
						break;
					}
				}
			}
			
		}
	
		
		return answer + bridge_length;
	}
		

}
