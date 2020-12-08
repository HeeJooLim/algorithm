package algorithm_hj;
import java.util.Scanner;

public class Main_4796 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		
		int count = 0;
		while(true) {
			StringBuffer sb = new StringBuffer();
			count++;
			int l = sc.nextInt();
			int p = sc.nextInt();
			int v = sc.nextInt();
			
			if(l==0) {
				break;
			}
			
			int result = (v/p)*l + Math.min(l,(v%p));
			
			sb.append("Case ").append(count).append(": ").append(result);
			System.out.println(sb.toString());
		}
		sc.close();
		
	}
	
	
}