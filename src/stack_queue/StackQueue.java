package stack_queue;

import java.util.Stack;

/************
 * @info : 2개의 stack으로 queue 표현하기
 * @name : StackQueue
 * @date : 2023/01/13 7:48 PM
 * @author : SeokJun Kang(swings134@gmail.com)
 * @version : 1.0.0
 * @Description :
 ************/
public class StackQueue {

    // Stack OF Queue - queue 처럼 작동하는 Stack
    private static class StackOfQueue {
        Stack inStack;
        Stack outStack;

        // Constructor
        StackOfQueue() {
            this.inStack = new Stack();
            this.outStack= new Stack();
        }

        //stack add()
        private void addStack(int num) {
            inStack.add(num);
        }

        // stack pop()
        private int outQueue() {
            // 2번째 stack이 empty 상태라면?
            if(outStack.isEmpty()) {
                // 1번 stack이 empty 가 아닐때 까지 반복.
                while(!inStack.isEmpty()){
                    outStack.add(inStack.pop());
                }
            }
            return (int)outStack.pop();
        }
    }

    public static void main(String[] args) {
        StackOfQueue queue = new StackOfQueue();

        queue.addStack(1);
        System.out.println("first: "+ queue.outQueue());

        queue.addStack(2);
        queue.addStack(3);
        System.out.println("second: "+ queue.outQueue());
        System.out.println("third: "+ queue.outQueue());
    }
}

