package algorithm_hj;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * 디스크 컨트롤러
 */
public class Programmers_42627 {
	
	static int solution(int[][] jobs) {
		int answer = 0;
		
		int end = 0; // 수행되고난 직후의 시간
		int jobsIndex = 0; // jobs 배열의 인덱스
		int count = 0; // 수행된 요청 갯수
		
		
		// 원본 배열 오름차순 정렬 (요청시간 오름차순)
		Arrays.sort(jobs, (a,b) -> a[0] - b[0]);
		
		// 처리 시간 오름차순으로 정렬되는 우선순위 큐
		PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[1] - b[1]);
		
		while(count < jobs.length) {
			
			// 하나의 작업이 완료되는 시점까지 들어온 모든 요청을 큐에 넣음
			while(jobsIndex < jobs.length && jobs[jobsIndex][0] <= end) {
				pq.add(jobs[jobsIndex++]);
			}
			
			// 큐가 비어있다면 작업 완료(end) 이후에 다시 요청이 들어온다는 의미
			// end를 요청의 가장 처음으로 맞춰준다
			if(pq.isEmpty()) {
				end = jobs[jobsIndex][0];
			} else {
				int[] temp = pq.poll();
				answer += temp[1] + end - temp[0];
				end += temp[1];
				count++;
			}
			
			
		}
		
		return (int)Math.floor(answer / jobs.length);
	}
	
}
