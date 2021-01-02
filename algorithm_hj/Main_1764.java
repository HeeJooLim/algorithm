package algorithm_hj;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Main_1764 {

	
	public static void main(String[] args)  {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		LinkedList<String> list = new LinkedList<>();
		HashMap<String, Integer> map = new HashMap<>();
		for(int i = 0; i < n+m; i++) {
			String name = sc.next();
			map.put(name, map.getOrDefault(name, 0) + 1);
			
			if(map.get(name) >= 2) {
				list.add(name);
			}
		}
		
		Collections.sort(list);
		
		System.out.println(list.size());
		for(String a : list) {
			System.out.println(a);
		}
		
		sc.close();
		
	}
	
}
