package algorithm.sort;

import java.util.Arrays;

/**
 * QuickSort(퀵 정렬)
 * - 가장 보편적 사용
 * - 기준값(pivot) 을 설정하여 정렬
 * - Pivot 기준으로 작으면 왼쪽, 크면 오른쪽으로 정렬 하면서 동작함.
 *
 * - Pivot 선택은 총 3가지 방법 존재
 *      - 첫번째 원소를 Pivot으로 선택
 *      - 중간 원소를 Pivot으로 선택
 *      - 마지막 원소를 Pivot으로 선택
 */
public class QuickSort {
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /**
     * QuickSort - 가운데 원소를 Pivot 으로 선택
     * @param arr
     * @param left
     * @param right
     */
    static void mid_quick(int[] arr, int left, int right) {
        int pl = left;
        int pr = right;
        int x = arr[(pl + pr) / 2]; // 중간값을 Pivot 으로 선택

        do {
            while (arr[pl] < x) pl++;
            while (arr[pr] > x) pr--;
            if (pl <= pr) {
                swap(arr, pl++, pr--);
            }
        } while (pl <= pr);

        if (left < pr) mid_quick(arr, left, pr);
        if (pl < right) mid_quick(arr, pl, right);
    }


    public static void main(String[] args) {
        int[] arr = {5, 8, 4, 2, 6, 1, 3, 7};
        mid_quick(arr, 0, arr.length - 1);
        System.out.println("arr = " + Arrays.toString(arr));
    }
}
