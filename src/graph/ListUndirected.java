package graph;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * 
 * <pre>
 * </pre>
 * @Class   : 인접 리스트 - 비방향성 
 * @File    : ListUndirected.java
 * @Package : graph
 * @author  : seokjunkang
 * @Date    : 2022. 7. 21. 오후 7:53:51
 */
public class ListUndirected {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// node 갯수 (vertex)
		int node = sc.nextInt();
		// edge 갯수
		int edge = sc.nextInt();
		
		ArrayList<ArrayList<Integer>> adList = new ArrayList<>();
		// 0번 index를 채우기 위한 dummy data
		adList.add(new<Integer> ArrayList());
		for(int i = 0; i<node; i++) {
			adList.add(new<Integer> ArrayList());
		}
		
		for(int i =0; i<edge; i++) {
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();
			
			// 비방향 그래프이기 떄문에 양쪽에 edge가 있다는것을 구현해야함.
			adList.get(v1).add(v2);
			adList.get(v2).add(v1);
		}
		
		//인접 리스트 출력
		for (int i = 1; i <= node; i++) {
			Iterator<Integer> iter = adList.get(i).iterator();
			 System.out.print("[" + i + "]: ");
			 
			 while(iter.hasNext()) {
				 System.out.print(iter.next());
			 }
			 System.out.println();
		}
		
	}//main
}
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
[1]: 23
[2]: 134
[3]: 1245
[4]: 2356
[5]: 34
[6]: 4
 */
