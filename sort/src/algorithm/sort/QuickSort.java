package algorithm.sort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] nums = {1, 4, 6, 4, 11, 2, 4};
        quickSort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }

    public static void quickSort(int[] nums, int L, int R) {
        if (L >= R) {
            return;
        }
        int partition = partition(nums, L, R);
        quickSort(nums, L, partition - 1);
        quickSort(nums, partition + 1, R);
    }

    public static int partition(int[] nums, int L, int R) {
        int radix = nums[R];
        int p1 = L - 1;
        for (int i = L; i < R; i++) {
            if (nums[i] < radix) {
                p1++;
                swap(nums, i, p1);
            } else {

            }
        }
        swap(nums, R, p1 + 1);
        return p1 + 1;
    }

    public static void swap(int[] nums, int a, int b) {
        int tmp = nums[a];
        nums[a] = nums[b];
        nums[b] = tmp;
    }
}
