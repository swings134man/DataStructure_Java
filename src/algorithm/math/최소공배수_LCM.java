package algorithm.math;

/**
 * LCM(Lowest Common Multiple): 최소공배수 의 인수가 2개 이상인것 구할때 사용하는 방법
 * - 두 수의 곱을 최대공약수로 나누면 최소공배수가 나온다.
 * - LCM은 두 수의 최소공배수를 구한후 그 수와 다음 수의 최소공배수를 구하는 방식으로 진행한다.
 * 결국 -> 1, 2의 최소공배수 -> 최소공배수, 3 과의 최소공배수 를 구하는 방식이다.
 */
public class 최소공배수_LCM {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int c = 6;

        int lcm1 = lcm(a, b);
        int lcm2 = lcm(lcm1, c);
        System.out.println("lcm2 = " + lcm2);
    }

    static int gcd(int a, int b) {
        if(a % b == 0) return b;
        return gcd(b, a % b);
    }

    static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
}
