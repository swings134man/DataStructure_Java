package graph;

import java.util.Scanner;

/**
 * 
 * <pre>
 * </pre>
 * @Class   : 인접행렬 - 방향성 그래프 
 * @File    : MatrixDirect.java
 * @Package : graph
 * @author  : seokjunkang
 * @Date    : 2022. 7. 25. 오후 5:19:49
 */
public class MatrixDirect {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int node = sc.nextInt();
		int edge = sc.nextInt();
		
		// 리스트 인덱스를 1로 하기에 크기를 1개 늘려서 할당함.
		int[][] adMatrix = new int[node+1][node+1];
		
		for(int i=0; i < edge; i++) {
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();
			
			adMatrix[v1][v2]=1;
		}
		
		for(int i=1; i<=node; i++) {
			System.out.print("[" + i + "]: ");
			for(int j = 1; j<=node; j++) {
				System.out.print(adMatrix[i][j]+ " ");
			}
			System.out.println();
		}
	}//main

}//class
/*
 * 5 4
1 2
1 3
2 4
3 5
[1]: 0 1 1 0 0 
[2]: 0 0 0 1 0 
[3]: 0 0 0 0 1 
[4]: 0 0 0 0 0 
[5]: 0 0 0 0 0 
 */
