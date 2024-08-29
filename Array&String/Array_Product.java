import java.util.Arrays;
import java.util.Scanner;
public class Array_Product {
    public static int[] Product_Array_Except_itSelf(int arr[]){
        int n=arr.length;
        int result[]=new int[n];
        result[0]=1;
        for (int i = 1; i < n; i++) {
            result[i]=result[i-1]*arr[i-1];
        }
        int right=1;
        for(int i=n-1; i>=0; i--){
            result[i]*=right;
            right*=arr[i];
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        int arr[] = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter " + i + " value : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Before : "+Arrays.toString(arr));
        arr=Product_Array_Except_itSelf(arr);
        System.out.println("After : "+Arrays.toString(arr));
        sc.close();
    }
}
