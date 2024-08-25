// this is for sorted array
import java.util.*;
public class Remove_Duplicate_Element {
    public static int removeDuplicate(int [] arr){
        int j=1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i-1]) {
                arr[j] = arr[i];
                j++;
            }
        }
        return j;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        int arr[]=new int[sc.nextInt()];
        System.out.println("Enter Sorted value : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter "+i+" value : ");
            arr[i]=sc.nextInt();
        }
        System.out.println("Number of Unique element is : "+removeDuplicate(arr));
        sc.close();
    }
}
