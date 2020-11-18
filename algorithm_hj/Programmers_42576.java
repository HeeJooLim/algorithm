package algorithm_hj;


import java.util.HashMap;

public class Programmers_42576 {

		static HashMap<String, Integer> map;
		static String answer;
	
	public static void main(String[] args) {
		
		String[] a = {"leo", "kiki", "eden"};
		String[] b = {"marina", "josipa", "nikola", "vinko", "filipa"};
		String[] c = {"mislav", "stanko", "mislav", "ana"};
		
		
		String[] a_ = {"kiki", "eden"};
		String[] b_ = {"marina", "josipa", "nikola", "filipa"};
		String[] c_ = {"stanko", "mislav", "ana"};
		
		System.out.println(func(a,a_));
		System.out.println(func(b,b_));
		System.out.println(func(c,c_));
		
	}
	
	static String func(String[] part, String[] com) {
		map = new HashMap<String, Integer>();
		
		for(String str : part) map.put(str, map.getOrDefault(str, 0) + 1);
		
		for(String str : com) map.put(str, map.get(str) - 1);
		
		for(String key : map.keySet() ) {
			if(map.get(key) == 1) {
				answer = key;
			}
		}
		return answer;
	}
		
	
}
