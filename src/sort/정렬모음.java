package sort;

import java.util.Arrays;

/************
 * @info : Java - 정렬 모음 (선택정렬, 버블정렬, 삽입정렬, Comparable)
 * @name : 정렬모음
 * @date : 2023/05/07 1:55 PM
 * @author : SeokJun Kang(swings134@gmail.com)
 * @version : 1.0.0
 * @Description :
 ************/
public class 정렬모음 {
    public static void main(String[] args) {
        정렬모음 a = new 정렬모음();
        int[] arr = {30,20,10,70,60,40,50,80,90};
        System.out.println("arr = " + Arrays.toString(arr));

        int[] insertionsArr = a.insertions(arr);
        System.out.println("insertionsArr = " + Arrays.toString(insertionsArr));
    }


    /*
        선택 정렬 - O(n^2)
     */
    public int[] insertions(int[] arr) {
        int[] result = arr.clone();

        for (int i = 0; i < result.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < result.length; j++) {
                if (result[j] < result[minIndex]) {
                    minIndex = j;
                }
            }
            // 현재 위치와 최소값 위치의 요소를 교환
            int temp = result[minIndex];
            result[minIndex] = result[i];
            result[i] = temp;
        }

        return result;
    }//insertions
}
