package algorithm_hj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main_1406 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String str = br.readLine();
		
		int n = Integer.parseInt(br.readLine());
		
		LinkedList<Character> list = new LinkedList<>();
		for(int i = 0; i < str.length(); i++) {
			list.add(str.charAt(i));
		}
		
		ListIterator<Character> iter = list.listIterator();
		
		// 커서의 위치를 말한다
		while(iter.hasNext()) {
			iter.next();
		}
		
		for(int i = 0; i < n; i++) {
			
			String command = br.readLine();
			char c = command.charAt(0);
			
			switch (c) {
			case 'L':
				if(iter.hasPrevious()) {
					iter.previous();
				}
				break;
			case 'D':
				if(iter.hasNext()) {
					iter.next();
				}
				break;
			case 'B':
				if(iter.hasPrevious()) {
					iter.previous();
					iter.remove();
				}
				break;
			case 'P':
				char t = command.charAt(2);
				iter.add(t);
				break;
			default:
				break;
			}
		}
		for(Character c : list) {
			sb.append(c);
		}
		System.out.println(sb);
	}
	
}


//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.ArrayList;
//
//public class Main {
//	
//	public static void main(String[] args) throws NumberFormatException, IOException {
//		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringBuilder sb = new StringBuilder();
//		
//		ArrayList<String> line = new ArrayList<>();
//		
//		String init = br.readLine();
//		String[] str = init.split("");
//		for(String s : str) {
//			line.add(s);
//		}
//		line.add("cursor");
//		
//		int cursorArea = line.size()-1;
//		
//		int n = Integer.parseInt(br.readLine());
//		for(int i = 0; i < n; i++) {
//			String input = br.readLine();
//			String[] inputs = input.split(" ");
//			String c = inputs[0];
//			switch (c) {
//			case "L":
//				if(cursorArea > 0) {
//					line.remove(cursorArea);
//					cursorArea--;
//					line.add(cursorArea, "cursor");
//				}
//				break;
//			case "D":
//				if(cursorArea < line.size() - 1) {
//					line.remove(cursorArea);
//					cursorArea++;
//					line.add(cursorArea, "cursor");
//				}
//				break;
//			case "B":
//				if(cursorArea > 0) {
//					cursorArea--;
//					line.remove(cursorArea);
//				}
//				break;
//			case "P":
//				String s = inputs[1];
//				line.add(cursorArea++, s);
//				break;
//			default:
//				break;
//			}
//			
//		}
//		
//		for(String result : line) {
//			if(!result.equals("cursor")) {
//				sb.append(result);
//			}
//		}
//		
//		System.out.println(sb);
//		
//	}
//	
//}