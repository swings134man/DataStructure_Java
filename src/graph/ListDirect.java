package graph;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * 
 * <pre>
 * </pre>
 * @Class   : 인접 리스트 - 방향성 그래프 
 * @File    : ListDirect.java
 * @Package : graph
 * @author  : seokjunkang
 * @Date    : 2022. 7. 21. 오후 6:54:22
 */
public class ListDirect {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		// vertex(node)의 개수 
		int node = sc.nextInt();
		// edge(선)의 개수 -> 즉 연결선
		int edge = sc.nextInt();

		ArrayList<ArrayList<Integer>> adList = new ArrayList<>();
		// 리스트의 인덱스 '1'로 하기 때문에 dummy data로 0을 채워줌
		adList.add(new<Integer> ArrayList());
		
		// node의 개수만큼 리스트 add
		for (int i = 0; i < node; i++) {
			adList.add(new<Integer> ArrayList());
		}
		
		// target node -> 다음 node를 지정
		for (int i = 0; i < edge; i++) {
			int v1 = sc.nextInt(); // target node
			int v2 = sc.nextInt(); // next node
			
			adList.get(v1).add(v2);
		}
		
		// 인접 리스트 출력
		for (int i = 1; i <= node; i++) {
			Iterator<Integer> iter = adList.get(i).iterator();
			
			System.out.print("[" + i + "]: ");
			
			while(iter.hasNext()) {
				System.out.print(iter.next() + " ");
			}
			System.out.println();
		}
		
	}//main
}
/*
 * 입력값
5 4
1 2
1 3
2 4
3 5
출력 값 
[1]: 2 3 
[2]: 4 
[3]: 5 
[4]: 
[5]: 
 * */
 