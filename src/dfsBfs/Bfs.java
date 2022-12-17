package dfsBfs;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 
 * <pre>
 * </pre>
 * @Class   : BFS 예 
 * @File    : Bfs.java
 * @Package : dfsBfs
 * @author  : seokjunkang
 * @Date    : 2022. 7. 19. 오후 6:35:43
 * 
 * 1. Queue에 이웃하는 정점을 담아 차례대로 pop() 하여 구현
 * 2. node 방문시 반드시 방문여부 검사
 * 3. 재귀 방식인 DFS에 비해 정점을 저장할 저장공간 많이 필요
 * 4. 탐색해야 할 node가 많다면 좋지 않음. 
 */
public class Bfs {

	static int[] numbers = {1,2,3,4,5};
	static boolean[] visit = {false,false,false,false,false};
	
	public static void main(String[] args) {
	
		BFS(numbers, visit, 0);
	}

	
	static void BFS (int[] numbers, boolean[] visit, int start) {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(start);
		visit[start] = true;
		
		while(!queue.isEmpty()) {
			int next = queue.poll();
			
			for(int i : numbers) {
				if(!visit[i]) {
					queue.add(i);
					visit[i] = true;
				}
			}
		}
		
	}
}
