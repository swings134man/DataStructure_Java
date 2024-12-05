package dfsBfs;

import java.util.ArrayList;

/**
 * 그래프를 구현하는 방법은 인접행렬(2차원배열), 인접리스트  2가지가 존재함(DFS)
 * -> 인접리스트는 효율적으로 메모리를 사용할떄 사용한다.
 * -> 단점은 a, b 노드가 연결되어있는지 확인하려면 O(N)의 시간이 걸린다. (a 인덱스 를 전부 순회해서 찾아야하기 때문임.)
 * ArrayList, List 를 이용하여 구현한다.
 *
 * 인접리스트는 각각의 노드에 연결된 노드들을 저장하는 방식이다.
 * list[1] -> 2,3,7 ->>> 이건 1번 node가 2,3,7번 node와 연결되어 있다는 뜻이다.
 *
 * 간선 샘플은 백준_11725 문제 참고
 */
public class 인접리스트 {

    static ArrayList<Integer>[] graph; // 노드와 간선 연결 배열(인접리스트)
    static boolean[] visited; // 방문여부
    static int n; // 노드 갯수
    static int m; // 간선 갯수

    public static void main(String[] args) {
        n = 7;
        m = 6;
        visited = new boolean[n + 1]; // 노드 갯수만큼 방문처리할 배열 할당

        // 노드 갯수만큼 list[] 할당
        // 빈 배열 리스트 생성하는것.
        graph = new ArrayList[n + 1];
        for (int i = 0; i < n + 1; i++) {
            graph[i] = new ArrayList<>();
        }

        // 간선연결 - 양방향 연결
//        addEdge(1, 6);
//        addEdge(6, 3);
//        addEdge(3, 5);
//        addEdge(4, 1);
//        addEdge(2, 4);
//        addEdge(4, 7);
        // 또다른 예제.
        addEdge(1, 2);
        addEdge(1, 3);
        addEdge(1, 4);
        addEdge(2, 3);
        addEdge(2, 5);
        addEdge(3, 4);
        addEdge(4, 5);

        dfs(1);
    }//main

    static void dfs(int node) {
        // 해당 노드 방문 처리 부터 시작
        visited[node] = true;
        System.out.print(node + " -> ");

        // list[node] 차례대로 순회 하면서 방문하지 않은 노드를 찾아서 재귀호출
        for (int i : graph[node]) {
            if(!visited[i]) {
                dfs(i);
            }
        }
    }

    // 양방향 간선 추가 메서드: 나중에 풀떄는 for 문으로 입력받은 값대로 추가하는게 편함.
    static void addEdge(int a, int b){
        graph[a].add(b);
        graph[b].add(a);
    }
}
