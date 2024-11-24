package stack_queue;

import java.util.Stack;

public class StackQueue_Methods {
    static Stack<Integer> in = new Stack<>();
    static Stack<Integer> out = new Stack<>();

    public static void inQueue(int number) {
        in.add(number);
    }

    public static int outQueue() {
        if(out.isEmpty()){
            while(!in.isEmpty()){
                out.add(in.pop());
            }
        }
        return out.pop();
    }


    public static void main(String[] args) {
        inQueue(1);
        inQueue(2);
        inQueue(3);

        System.out.println(outQueue());
        System.out.println(outQueue());
        System.out.println(outQueue());
    }
}
