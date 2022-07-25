package graph;

import java.util.Scanner;

public class MatrixUndirect {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int node = sc.nextInt();
		int edge = sc.nextInt();
		
		// 리스트 인덱스를 1로 하기때문에 크기를 1개 늘려서 할당
		int[][] adMatrix = new int[node+1][node+1];
		
		for(int i=0; i<edge; i++) {
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();
			
			adMatrix[v1][v2] = 1;
			adMatrix[v2][v1] = 1;
		}
		
		for(int i =1; i<=node; i++) {
			for(int j =1; j<=node; j++) {
				System.out.print(adMatrix[j][i]+ " ");
			}
			System.out.println();
		}
	}//main

}//class
/*
 * 6 8
1 2
1 3
2 3
2 4
3 4
3 5
4 5
4 6
0 1 1 0 0 0 
1 0 1 1 0 0 
1 1 0 1 1 0 
0 1 1 0 1 1 
0 0 1 1 0 0 
0 0 0 1 0 0 */
