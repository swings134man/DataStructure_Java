package stack_queue;

import java.util.Stack;

/************
 * @info : Stack 기본
 * @name : Stack_Basic
 * @date : 2023/01/14 4:24 PM
 * @author : SeokJun Kang(swings134@gmail.com)
 * @version : 1.0.0
 * @Description :
 ************/
public class Stack_Basic {

    public static void main(String[] args) {

        Stack stack = new Stack();

        // stack 에 순서대로 push
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack); // 1,2,3

        System.out.println(stack.pop()); //3
        System.out.println(stack);

        // peek : stack의 최상단 객체를 꺼내지 않고 확인만 할 수 있음
        System.out.println(stack.peek());
        System.out.println(stack);

        // stack 내부의 요소 찾는것 아래로 내려갈수록 리턴값은 커짐. (stack은 선입후출 방식이기 떄문)
        System.out.println(stack.search(1));

    }

}
