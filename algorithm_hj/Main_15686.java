package algorithm_hj;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main_15686 {

	static boolean[] visited;
	static int n, m, c, max;
	static Area[] ch;
	static int result = Integer.MAX_VALUE;
	static ArrayList<Area> home = new ArrayList<>(); 
	static ArrayList<Area> chicken = new ArrayList<>(); 
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		
		int temp;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				temp = Integer.parseInt(st.nextToken());
				if (temp == 1) home.add(new Area(i, j));
				else if (temp == 2) chicken.add(new Area(i, j)); }

        }
		
		c = chicken.size();
		visited = new boolean[c];
		
		for(int i = 0; i < m; i++) {
			max = i + 1;
			ch = new Area[max];
			chickens(0,0);
		}
		
		System.out.println(result);
		
		
	}
	
	public static void chickens(int start, int depth) {
		
		if(depth == max) {
			int temp;
			int total = 0;
			for(int i = 0; i < home.size(); i++) {
				temp = Integer.MAX_VALUE;
				for(int j = 0 ; j < ch.length; j++) {
					temp = Math.min(temp, Math.abs(home.get(i).x - ch[j].x) + Math.abs(home.get(i).y - ch[j].y));
				}
				total += temp;
			}
			result = Math.min(total, result);
			return;
		}
		
		for(int i = start; i < c; i++) {
			if(!visited[i]) {
				visited[i] = true;
				ch[depth] = chicken.get(i);
				chickens(i+1, depth + 1);
				visited[i] = false;
			}
		}
		
	}

}


class Area {
	int x,y;
	public Area(int x, int y) {
		this.x = x;
		this.y = y;
	}
}






