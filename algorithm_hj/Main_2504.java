package algorithm_hj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main_2504 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		Stack<String> stack = new Stack<>();
		
		int result = 0;
		int temp = 1;
		
		String arr[] = str.split("");
		
		if(arr.length % 2 == 1) {
			System.out.println(0);
			return;
		}
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i].equals("(")) {
				temp *= 2;
				stack.push(arr[i]);
			} else if(arr[i].equals("[")) {
				temp *= 3;
				stack.push(arr[i]);
			} else if(arr[i].equals(")")) {	
				if(stack.isEmpty() || !(stack.peek().equals("("))) {
					result = 0;
					break;
				}
				if(arr[i-1].equals("(")) {
					result += temp;
				}
				stack.pop();
				temp /= 2;
			} else if(arr[i].equals("]")) {
				if(stack.isEmpty() || !(stack.peek().equals("["))) {
					result = 0;
					break;
				}
				if(arr[i-1].equals("[")) {
					result += temp;
				}
				stack.pop();
				temp /= 3;
			}
		}
		System.out.println(result);
	}
	
}

