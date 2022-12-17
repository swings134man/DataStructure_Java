package test;

import java.util.Stack;

public class TestCode2 {



    // 그림예시 그래프의 연결상태를 2차원 배열로 표현
    // 인덱스가 각각의 노드번호가 될 수 있게 0번인덱스는 아무것도 없는 상태라고 생각.
    static int[][] graph = {{}, {2,3,8}, {1,6,8}, {1,5}, {5,7}, {3,4,7}, {2}, {4,5}, {1,2}};

    // 방문 처리에 사용할 배열
    static boolean[] visited = new boolean[9];
    // DFS에 사용할 stack
    static Stack<Integer> stack = new Stack<>();


    public static void main(String[] args) {
        stack.push(1);
        visited[1] = true;

        // stack 비어있지 않다면?
        while(!stack.isEmpty()) {
            int stackNum = stack.pop();
            System.out.println("스택 pop : " + stackNum);

            // POP (최상단 node 부터) 하나씩 꺼내옴.
            for(int i : graph[stackNum]) {
                if(!visited[i]) {
                    stack.push(i);
                    visited[i] = true;

                }
            }
        }//while

    }

}
