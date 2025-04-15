package TwoPointers;

import java.util.Arrays;

public class Two_Sum_II {
    private static int[] Two_Sum(int arr[], int target) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                return new int[] { left + 1, right + 1 };
            } else if (sum > target) {
                right--;
            } else {
                left++;
            }
        }
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(Two_Sum(new int[] { 2, 7, 11, 15 }, 9)));
    }
}
