import java.util.Arrays;
import java.util.Scanner;

class MergeArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Copy elements from nums2 into nums1 starting from index m
        for (int j = 0, i = m; j < n; j++) {
            nums1[i] = nums2[j];
            i++;
        }
        // Sort the merged array
        Arrays.sort(nums1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of m and n
        System.out.print("Enter the number of elements in nums1 (m): ");
        int m = scanner.nextInt();
        System.out.print("Enter the number of elements in nums2 (n): ");
        int n = scanner.nextInt();

        // Create the arrays nums1 and nums2
        int[] nums1 = new int[m + n]; // nums1 has enough space for m + n elements
        int[] nums2 = new int[n];

        // Input elements of nums1
        System.out.println("Enter " + m + " elements for nums1:");
        for (int i = 0; i < m; i++) {
            nums1[i] = scanner.nextInt();
        }

        // Input elements of nums2
        System.out.println("Enter " + n + " elements for nums2:");
        for (int i = 0; i < n; i++) {
            nums2[i] = scanner.nextInt();
        }

        // Print original arrays
        System.out.println("Before merging:");
        System.out.println("nums1: " + Arrays.toString(nums1));
        System.out.println("nums2: " + Arrays.toString(nums2));

        // Create a MergeArray object and call the merge method
        MergeArray solution = new MergeArray();
        solution.merge(nums1, m, nums2, n);

        // Print merged and sorted array
        System.out.println("After merging:");
        System.out.println("nums1: " + Arrays.toString(nums1));

        scanner.close();
    }
}
