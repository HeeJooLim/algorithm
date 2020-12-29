package algorithm_hj;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Main_5430 {

	public static void main(String[] args)  {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		while(num > 0 ) {
			
			num--;
		
			StringBuilder sb = new StringBuilder();
			String[] func = sc.next().split("");
			
			int n = sc.nextInt();
			String[] x = sc.next().replaceAll("[\\[\\]]", "").split(",");
			
			Deque<String> queue = new LinkedList<>();
			
			if(n > 0) {
				for(String str : x) queue.offer(str);
			}
			boolean reverse = false;
			boolean isError = false;
	
			for(int i = 0; i < func.length; i++) {
				if(func[i].equals("R")) {
					reverse = !reverse;
				} else if(func[i].equals("D")){
					if(!queue.isEmpty()) {
						if(reverse) queue.pollLast();
						else queue.pollFirst();
					} else {
						isError = true;
						break;
					}
				}
			}
			
			if(isError) {
				System.out.println("error");
			} else {
				sb.append("[");
				while(!queue.isEmpty()) {
					if(reverse) {
						sb.append(queue.pollLast());
						if(queue.size()> 0) {
							sb.append(",");
						}
					} else {
						sb.append(queue.pollFirst());
						if(queue.size()> 0) {
							sb.append(",");
						}
					}
				}
				sb.append("]");
				System.out.println(sb);
			}
		}
		sc.close();
	}
	
}

 	