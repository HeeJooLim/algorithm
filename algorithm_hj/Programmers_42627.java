package algorithm_hj;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * ��ũ ��Ʈ�ѷ�
 */
public class Programmers_42627 {
	
	static int solution(int[][] jobs) {
		int answer = 0;
		
		int end = 0; // ����ǰ��� ������ �ð�
		int jobsIndex = 0; // jobs �迭�� �ε���
		int count = 0; // ����� ��û ����
		
		
		// ���� �迭 �������� ���� (��û�ð� ��������)
		Arrays.sort(jobs, (a,b) -> a[0] - b[0]);
		
		// ó�� �ð� ������������ ���ĵǴ� �켱���� ť
		PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[1] - b[1]);
		
		while(count < jobs.length) {
			
			// �ϳ��� �۾��� �Ϸ�Ǵ� �������� ���� ��� ��û�� ť�� ����
			while(jobsIndex < jobs.length && jobs[jobsIndex][0] <= end) {
				pq.add(jobs[jobsIndex++]);
			}
			
			// ť�� ����ִٸ� �۾� �Ϸ�(end) ���Ŀ� �ٽ� ��û�� ���´ٴ� �ǹ�
			// end�� ��û�� ���� ó������ �����ش�
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