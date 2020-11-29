package algorithm_hj;


import java.util.Queue;
import java.util.LinkedList;

/**
 * 다리를 지나는 트럭
 * https://programmers.co.kr/learn/courses/30/lessons/42583
 */
public class Programmers_42583 {



	public static void main(String[] arr) {
		int[] a = {7,4,5,6};
		System.out.println(solution(2, 10, a));
	}
	
	public static int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();
        int w = 0;
        for(int i = 0; i < truck_weights.length; i++) {
        	int truck = truck_weights[i];
        	while(true) {
	        	if(queue.isEmpty()) {
	        		w += truck;
	        		queue.add(truck);
	        		answer++;
	        		break;
	        	} else if(queue.size() == bridge_length){
	        		w -= queue.poll();
	        	} else {
	        		if(w + truck <= weight) {
	        			w += truck;
	        			queue.add(truck);
	        			answer++;
	        			break;
	        		} else {
	        			queue.add(0);
	        			answer++;
	        		}
	        	}
        	}
        }
        return answer + bridge_length;
    }

		
}
