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

        // 2. stack이 비어있지 않으면 계속 반복
        while (!stack.isEmpty()) {
            // 3. stack에서 하나 꺼냄
            int nodeIndex = stack.pop();
            // 3-1. 해당 노드가 이미 방문한 노드라면 continue(처리X)
            if(visited[nodeIndex]) {
                continue;
            }

            // 3-2. 방문하지 않은 노드라면 방문처리 및 출력
            visited[nodeIndex] = true;
            System.out.print(nodeIndex + " -> ");

            // 4. 꺼낸 노드와 인접 노드 찾기
            /**
             * 인접 노드를 stack에 넣을 때는 역순으로 넣어야 함.
             * -> 방문순서에 영향이 있기때문임.
             * -> 역순으로 넣는다면 -> 8, 3, 2 순으로 넣어야 함. -> 해당 index 의 node 를 역순으로 넣는다는 의미임
             */
            for (int i = graph[nodeIndex].length - 1; i >= 0; i--) {
                int adjacentNode = graph[nodeIndex][i];
                if (!visited[adjacentNode]) { // 방문하지 않은 노드 라면
                    stack.push(adjacentNode);
                }
            }
        }
    }

    public static void main(String[] args) {
        dfs(1);
    }


}
