package algorithm_hj;

import java.util.Scanner;

public class Main_14500 {
	
	public static int[][] arr;
	public static int max = Integer.MIN_VALUE;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		arr = new int[n+6][m+6];
		
		for(int i = 3; i < n + 3; i++) {
			for(int j = 3; j < m +3; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0; i < n+3; i++) {
			for(int j = 0; j < m + 3; j++) {
				dfs(i,j);
			}
		}
		
		System.out.println(max);
		sc.close();
		
	}
	
	public static void dfs(int x, int y) {
		int sum = 0;
		
		// ���� ����
		sum += arr[x][y];
		sum += arr[x][y+1];
		sum += arr[x][y+2];
		sum += arr[x][y+3];
		
		max = Math.max(max, sum);
		sum = 0;
		
		// ���� ����
		sum += arr[x][y];
		sum += arr[x+1][y];
		sum += arr[x+2][y];
		sum += arr[x+3][y];

		max = Math.max(max, sum);
		sum = 0;
		
		// �׸�
		sum += arr[x][y];
		sum += arr[x+1][y];
		sum += arr[x][y+1];
		sum += arr[x+1][y+1];

		max = Math.max(max, sum);
		sum = 0;
		
		// ��  ���
		sum += arr[x][y];
		sum += arr[x+1][y];
		sum += arr[x+1][y+1];
		sum += arr[x+1][y+2];
		
		max = Math.max(max, sum);
		sum = 0;
		
		// �� ��� �ð���� (1)
		sum += arr[x][y];
		sum += arr[x][y+1];
		sum += arr[x+1][y];
		sum += arr[x+2][y];
		max = Math.max(max, sum);
		sum = 0;
		
		// �� ��� �ð���� (2)
		sum += arr[x][y];
		sum += arr[x][y+1];
		sum += arr[x][y+2];
		sum += arr[x+1][y+2];
		max = Math.max(max, sum);
		sum = 0;
		
		// �� ��� �ð���� (3)
		sum += arr[x][y+1];
		sum += arr[x+1][y+1];
		sum += arr[x+2][y+1];
		sum += arr[x+2][y];
		max = Math.max(max, sum);
		sum = 0;
		
		// �� ��Ī
		sum += arr[x][y+2];
		sum += arr[x+1][y+2];
		sum += arr[x+1][y+1];
		sum += arr[x+1][y];

		max = Math.max(max, sum);
		sum = 0;
		
		// �� ��Ī(1)
		sum += arr[x][y];
		sum += arr[x+1][y];
		sum += arr[x+2][y];
		sum += arr[x+2][y+1];
		
		max = Math.max(max, sum);
		sum = 0;
		
		//�� ��Ī(2)
		sum += arr[x][y];
		sum += arr[x][y+1];
		sum += arr[x][y+2];
		sum += arr[x+1][y];
		

		max = Math.max(max, sum);
		sum = 0;
		
		// �� ��Ī(3)
		
		sum += arr[x][y];
		sum += arr[x][y+1];
		sum += arr[x+1][y+1];
		sum += arr[x+2][y+1];
	
		// ��
		max = Math.max(max, sum);
		sum = 0;
		
		sum += arr[x][y+1];
		sum += arr[x+1][y];
		sum += arr[x+1][y+1];
		sum += arr[x+1][y+2];
	
		max = Math.max(max, sum);
		sum = 0;
		
		// ��
		sum += arr[x][y];
		sum += arr[x+1][y];
		sum += arr[x+2][y];
		sum += arr[x+1][y+1];
		
		max = Math.max(max, sum);
		sum = 0;
		
		// ��
		sum += arr[x][y];
		sum += arr[x][y+1];
		sum += arr[x][y+2];
		sum += arr[x+1][y+1];
		
		max = Math.max(max, sum);
		sum = 0;
		
		//��
		
		sum += arr[x+1][y];
		sum += arr[x][y+1];
		sum += arr[x+1][y+1];
		sum += arr[x+2][y+1];
		
		max = Math.max(max, sum);
		sum = 0;
		
		sum += arr[x][y+1];
		sum += arr[x][y+2];
		sum += arr[x+1][y];
		sum += arr[x+1][y+1];
		
		max = Math.max(max, sum);
		sum = 0;
		
		sum += arr[x][y];
		sum += arr[x+1][y];
		sum += arr[x+1][y+1];
		sum += arr[x+2][y+1];
		

		max = Math.max(max, sum);
		sum = 0;
		
		sum += arr[x][y];
		sum += arr[x][y+1];
		sum += arr[x+1][y+1];
		sum += arr[x+1][y+2];

		
		max = Math.max(max, sum);
		sum = 0;
		
		sum += arr[x][y+1];
		sum += arr[x+1][y+1];
		sum += arr[x+1][y];
		sum += arr[x+2][y];
		
		max = Math.max(max, sum);
	}
	
	
}