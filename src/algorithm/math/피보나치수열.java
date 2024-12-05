package algorithm.math;

import java.util.Arrays;

// 피보나치수열이란: fib(n) = fib(n-1) + fib(n-2) 이다.
public class 피보나치수열 {
    public static void main(String[] args) {
        int target = 8; // 8번째 피보나치 수열을 구하라
        int n = 9; // 9개의 index가 존재한다

        int[] arr = new int[n];
        arr[0] = 0;
        arr[1] = 1;

        for(int i = 2; i < n; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }

        System.out.println("arr = " + Arrays.toString(arr)); // 0~부터 피보나치 수열 출력
        System.out.println("target = " + arr[target - 1]); // target 번째 피보나치 수열 출력
    }
}
