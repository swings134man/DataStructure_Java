package dfsBfs;

import java.util.LinkedList;
import java.util.Stack;

/**
 * 
 * <pre>
 * </pre>
 * @Class   : DFS Stack 예제. 
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

		//시작 노드 stack 삽입
		stack.push(1);
		
		// 시작 노드 방문 처리
		visited[1] = true;
		
		// stack이 비어있지 않으면 계속 반복
		while (!stack.isEmpty()) {
			
			// stack 에서 하나 꺼냄
			int nodeIndex = stack.pop();
			
			// 방문 노드 출력
			System.out.print(nodeIndex + " -> " );
			
			// 꺼낸 노드와 인접 노드 찾기
			for(int LinkedNode : graph[nodeIndex]) {
				
				// 인접 노드를 방문하지 않았을 경우 stack에 넣고 방문처리 함.
				if(!visited[LinkedNode]) {
					stack.push(LinkedNode);
					visited[LinkedNode] = true;
				}
				
			}
		}
		
		
	} //main

}
