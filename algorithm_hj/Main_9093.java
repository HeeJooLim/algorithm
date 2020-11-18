package algorithm_hj;

import java.util.Scanner;
import java.util.Stack;

public class Main_9093 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Stack<Character> stack = new Stack<>();
		
		int size = sc.nextInt();
		sc.nextLine();
		
		String str;
		StringBuffer sb;
		for(int i=0; i< size; i++) {
			 sb = new StringBuffer();
			str = sc.nextLine();
			
			for(int j = 0; j < str.length(); j++) {
				if(str.charAt(j) == ' ') {
					while(!stack.isEmpty()) {
						sb.append(stack.pop());
					}
					sb.append(" ");
				} else {
					stack.add(str.charAt(j));
				}
			}
			while(!stack.empty()) {
				sb.append(stack.pop());
			}
			System.out.println(sb);
		}

		sc.close();
	}
	
}