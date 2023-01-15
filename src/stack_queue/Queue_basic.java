package stack_queue;

import java.util.LinkedList;
import java.util.Queue;

/************
 * @info : Queue
 * @name : Queue_basic
 * @date : 2023/01/15 11:03 PM
 * @author : SeokJun Kang(swings134@gmail.com)
 * @version : 1.0.0
 * @Description :
 *
 *  - queue 에서 data의 삽입, 삭제 할때 사용하는 메서드의 차이는
 *    -> null, false 반환 일것인가 ( offer, poll, peek)
 *    -> Exception 발생이냐의 차이 (add,remove,element)
 ************/
public class Queue_basic {


    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<Integer>();
        // 큐에 맨뒤에 값 삽입
        // 성공시 true 반환
        // 큐가 꽉 차면 IllegalException
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);

        // 큐의 맨뒤에 값 삽입
        // 성공시 true 반환
        // 실패시 false 반환
        queue.add(5);

        System.out.println("queue : " +queue); // [1,2,3,4,5]


        // queue의 첫번째 값을 꺼낸 후 가져온다.
        int pollResult = queue.poll();
        System.out.println("poll : "+ pollResult);


        // 큐의 맨앞의 값 확인.
        // 비어있으면 NoSuchElementException
        int elementResult = queue.element();
        System.out.println("element : " + elementResult);
        // 다음값 확인
        // 비어있으면 null
        int peekResult = queue.peek();// queue의 첫번째 값을 확인만 하고 꺼내지는 않는다.
        System.out.println("peek : " + peekResult);

        // 삭제
        queue.remove();
        System.out.println("queue : " + queue);



    }// main
}
