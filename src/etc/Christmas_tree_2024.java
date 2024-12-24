package etc;

import java.util.Scanner;

/**
 * @package : etc
 * @name : Christmas_tree_2024.java
 * @date : 2024. 12. 25. 오전 12:18
 * @author : lucaskang(swings134man)
 * @Description: 2024 year Christmas Tree
 * - 왼쪽 공백출력만 주의 하면된다. -> 왼쪽공백을 내려갈수록 줄여 나감.
 * - 별은 내려갈수록 2개씩 증가.
**/
public class Christmas_tree_2024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("크리스마스 트리의 높이를 입력하세요. : ");
        int x = sc.nextInt();
        sc.close();

        // Tree 본체
        for (int i = 1; i <= x ; i++) {
            // Tree 왼쪽 공백: 별이 내려갈수록 1개씩 감소
            for (int j = 0; j < x - i; j++) {
                System.out.print(" ");
            }

            // tree 본체: 별 내려갈수록 2개씩 증가
            for (int k = 0; k < (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // tree의 줄기
        for (int i = 0; i < 2; i++) { // 줄기의 높이를 2로 설정
            for (int j = 0; j < x - 1; j++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
        System.out.println("Merry Christmas! 🎄 2024!");
    }
}
