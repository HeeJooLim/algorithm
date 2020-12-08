package algorithm_hj;

import java.util.ArrayList;
import java.util.Collections;

public class Programmers_43164 {
	
	
	public static boolean[] visited;
	public static ArrayList<String> answers;
	
	public static void main(String[] args) {
		
		String[][] tickets = {{"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"}, {"ATL","SFO"}};
		//String[][] tickets = {{"ICN", "JFK"}, {"HND", "IAD"}, {"JFK", "HND"}};
		
		visited = new boolean[tickets.length];
		answers = new ArrayList<String>(); // 여러 경우의 수 담는 배열리스트
		
		dfs(0, tickets, "ICN", "ICN");
		
		Collections.sort(answers);
		String[] answer = answers.get(0).split(" ");
	
		for(String s : answer) {
			System.out.println(s);
		}
	}
	

	
	public static void dfs(int count, String[][] tickets, String line, String next) {
		
		if(count == tickets.length) {
			answers.add(line);
			return;
		}
		
		for(int i = 0; i < tickets.length; i++) {
			if(!visited[i] && tickets[i][0].equals(next)) {
				visited[i] = true;
				dfs(count + 1, tickets, line + " " + tickets[i][1], tickets[i][1]);
				visited[i] = false;
			}
		}
	}
}