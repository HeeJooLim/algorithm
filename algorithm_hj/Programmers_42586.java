package algorithm_hj;

import java.util.Queue;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 * 기능개발 (스택/큐)
 * https://programmers.co.kr/learn/courses/30/lessons/42586
 *
 */
public class Programmers_42586 {
	 public int[] solution(int[] progresses, int[] speeds) {
			int size = progresses.length;
			
			int[] day = new int[progresses.length];
			
			for(int i = 0 ; i < size; i++) {
				int count = 1;
				while(progresses[i] + speeds[i] * count < 100) count++;
				day[i] = count;
			}
			
			Queue<Integer> que = new LinkedList<>();
			
			for(int i : day) {
				que.add(i);
			}
			
			ArrayList<Integer> arr = new ArrayList<>();
			
			int now;
			int cnt = 0;
			int max= que.peek();
			while(!que.isEmpty()) {
				now = que.poll();
				if(max >= now) {
					cnt++;
				} else {
					max = now;
					arr.add(cnt);
					cnt = 1;
				}
			}
			arr.add(cnt);
			
			int[] answer = new int[arr.size()];
			
			for(int i = 0; i< arr.size(); i++) {
				answer[i] = arr.get(i);
			}
			
			return answer;
		
	    }
}
