import java.util.*;
public class Remove_Duplicate_Part_II {
    public static int Remove_Duplicate_II(int []nums){
        int n=nums.length;
        if (n<=2) {
            return n;
        }
        int j=2;
        for (int i = 2; i < n; i++) {
            if (nums[i] != nums[j-2]) {
                nums[j]=nums[i];
                j++;
            }
        }
        return j;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Make Sure You Enter a Sorted Array.");
        System.out.print("Enter Array Size : ");
        int nums[]=new int[sc.nextInt()];
        for (int i = 0; i < nums.length; i++) {
            System.out.print("Enter "+i+" value : ");
            nums[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(nums));
        System.out.println("Answer is : "+Remove_Duplicate_II(nums));
        sc.close();
    }
}
