import java.util.*;

public class Rotate {
    public static void Rotate_Array(int[] arr, int k) {
        k = k % arr.length;
        Reverse(arr, 0, arr.length - 1);
        Reverse(arr, 0, k - 1);
        Reverse(arr, k, arr.length - 1);
    }

    public static void Reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        System.out.println(Arrays.toString(arr));
        Rotate_Array(arr, 3);
        System.out.println(Arrays.toString(arr));
    }
}
