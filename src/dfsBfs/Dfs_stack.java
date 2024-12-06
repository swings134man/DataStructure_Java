package dfsBfs;

import java.util.Stack;

// DFS 스택으로 구현하기
public class Dfs_stack {

    static int[][] graph = {{}, {2,3,8}, {1,6,8}, {1,5}, {5,7}, {3,4,7}, {2}, {4,5}, {1,2}}; // 9개 노드 및 간선
    static boolean[] visited = new boolean[9];
    static int node = 9;
    static int line = 8;

    static Stack<Integer> stack = new Stack<>();

    static void dfs(int start) {
        // 1. 시작 노드를 stack에 넣고 방문처리
        stack.push(start);
        visited[start] = true;

        // 2. stack이 비어있지 않으면 계속 반복
        while (!stack.isEmpty()) {
            // 3. stack에서 하나 꺼냄
            int nodeIndex = stack.pop();
            System.out.print(nodeIndex + " -> ");

            // 4. 꺼낸 노드와 인접 노드 찾기
            for (int i : graph[nodeIndex]) {
                // 5. 인접 노드를 방문하지 않았을 경우 stack에 넣고 방문처리
                if (!visited[i]) {
                    stack.push(i);
                    visited[i] = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        dfs(1);
    }


}
