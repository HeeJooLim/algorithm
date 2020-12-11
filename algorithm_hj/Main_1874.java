package algorithm_hj;

import java.util.Scanner;
import java.util.Stack;

public class Main_1874 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stack = new Stack<Integer>();
		StringBuilder sb = new StringBuilder();
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		
		int num = 1;
		
		for(int i = 0; i < n; i++) {
			
			while(num <= arr[i]) {
				stack.add(num++);
				sb.append("+").append("\n");
				
			}
			
			if(!stack.isEmpty()) {
				if(arr[i] < stack.peek()) {
					break;
				} else {
					stack.pop();
					sb.append("-").append("\n");
				}
			}
		}
		
		
		if(stack.isEmpty()) {
			System.out.println(sb);
		}else {
			System.out.println("NO");
		}
		
	}
	
}