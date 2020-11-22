package algorithm_hj;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Arrays;

/**
 * 프린터(스택/큐)
 * https://programmers.co.kr/learn/courses/30/lessons/42587
 *
 */
public class Programmers_42587 {

	public int solution(int[] priorities, int location) {
		
		int answer = 0;
		int loc = location;
		
		Queue<Integer> queue = new LinkedList<>();
		
		for(int p : priorities) queue.add(p);
		
		Arrays.sort(priorities);
		int i = priorities.length - 1;
		
		while(!queue.isEmpty()) {
			
			int now = queue.poll();
			
			if(now != priorities[i]) {
				queue.add(now);
				loc--;
				if(loc < 0) loc = queue.size() - 1;
			} else {
				i--;
				answer++;
				if(loc == 0) {
					break;
				} else {
					loc--;
					if(loc < 0) loc = queue.size() - 1;
				}
			}
		}
		return answer;
	}
	
}
