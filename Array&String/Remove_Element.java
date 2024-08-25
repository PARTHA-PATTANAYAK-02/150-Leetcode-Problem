
import java.util.Scanner;

/**
 * Matrix_
 */
public class Remove_Element {

    public static int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Array Size : ");
        int arr[] = new int[sc.nextInt()];
        System.out.println("Enter Array Elements : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter " + i + " value : ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the Value : ");
        int val = sc.nextInt();
        System.out.println("Number of Remaining Elements is : " + removeElement(arr, val));
        sc.close();
    }
}