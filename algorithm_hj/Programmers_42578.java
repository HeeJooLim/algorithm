package algorithm_hj;
import java.util.HashMap;

/**
 * 위장 (해시)
 * https://programmers.co.kr/learn/courses/30/lessons/42578
 */
public class Programmers_42578 {
	
    static HashMap<String, Integer> map;
    public int solution(String[][] clothes) {
       int answer = 1;
		map = new HashMap<>();
		
		for(int i  = 0; i < clothes.length; i++) {
			map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 1) + 1);
		}
		
		for(int i : map.values()) {
			answer *= i;
		}
		
		return answer - 1 ;
    }
}
