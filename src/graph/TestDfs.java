package graph;

import java.util.ArrayList;
import java.util.Iterator;

public class TestDfs {
	
	private int V;
	private static ArrayList<Integer> adj[];

	
	public static void main(String[] args) {

		
	}
	
	public static void Graph(int v) {
		
		
	}
	
	// DFS 
	public static void DFS(int node, boolean visited[]) {
		// 방문 표시
		visited[node] = true;
		
		for (int i = 0; i < visited.length; i++) {
			if(!visited[node]) {
				DFS(node, visited);
			}
		}
		
		// 방문 노드와 인접 노드 가져오고
		
	}

}
