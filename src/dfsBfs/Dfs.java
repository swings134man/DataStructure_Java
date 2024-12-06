package dfsBfs;

import java.util.LinkedList;
import java.util.Stack;

/**
 * 
 * <pre>
 * </pre>
 * @Class   : DFS Stack, Recursion
 * @File    : Dfs.java
 * @Package : dfsBfs
 * @author  : seokjunkang
 * @Date    : 2022. 7. 19. 오후 6:11:38
 */
public class Dfs {

	// 방문 처리에 사용할 배열 
	static boolean[] visited = new boolean[9];
	
	// 그림예시 그래프의 연결상태를 2차원 배열로 표현
	// 인덱스가 각각의 노드번호가 될 수 있게 0번인덱스는 아무것도 없는 상태라고 생각.
	static int[][] graph = {{}, {2,3,8}, {1,6,8}, {1,5}, {5,7}, {3,4,7}, {2}, {4,5}, {1,2}};
	
	// DFS에 사용할 stack
	static Stack<Integer> stack = new Stack<>();
	
	public static void main(String[] args) {
		dfs_stack(1);

		visited = new boolean[9];
		System.out.println();
		dfs_recursion(1);
	} //main

	// dfs stack
	static void dfs_stack(int start) {
		stack.push(start);

		while (!stack.isEmpty()) {
			int node = stack.pop();

			if(visited[node]) continue;

			visited[node] = true;
			System.out.print(node + " -> ");

			for (int i = graph[node].length - 1; i >= 0 ; i--) {
				int reverseNode = graph[node][i];
				if(!visited[reverseNode]){
					stack.push(reverseNode);
				}
			}
		}
	}

	// dfs recursion
	static void dfs_recursion(int start) {
		visited[start] = true;
		System.out.print(start + " -> ");

		for (int x: graph[start]) {
			if(!visited[x]) {
				dfs_recursion(x);
			}
		}
	}
}
