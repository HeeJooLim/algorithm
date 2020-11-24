package algorithm_hj;


import java.util.Scanner;
import java.util.Stack;

public class Main_4949 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
				
			String str = sc.nextLine();
			if(str.equals(".")) break;
			Stack<String> stack = new Stack<>();
			
			for(int i = 0; i < str.length(); i++) {
				
				char s = str.charAt(i);
				
				if(s == '(' || s == '[') {
					stack.push(String.valueOf(s));
				} else if(!stack.isEmpty() && stack.peek().equals("(") && s == ')') {
					stack.pop();
				} else if(!stack.isEmpty() && stack.peek().equals("[") && s == ']') {
					stack.pop();
				} else if (s==')' || s ==']') {
					stack.push(String.valueOf(s));
				}
			}
			
			System.out.println(stack.isEmpty() ? "yes" : "no");
			for(int i = 0; i < str.length(); i++) {
				
				char s = str.charAt(i);
				
				if(s == '(' || s == '[') {
					stack.push(String.valueOf(s));
				} else if(!stack.isEmpty() && stack.peek().equals("(") && s == ')') {
					stack.pop();
				} else if(!stack.isEmpty() && stack.peek().equals("[") && s == ']') {
					stack.pop();
				} else if (s==')' || s ==']') {
					stack.push(String.valueOf(s));
				}
			}
			
			System.out.println(stack.isEmpty() ? "yes" : "no");
		}
	}
}

