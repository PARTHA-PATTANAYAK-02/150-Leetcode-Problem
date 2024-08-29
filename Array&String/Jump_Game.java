import java.util.Scanner;
public class Jump_Game {
    public static boolean Max_Jump(int[] arr) {
        int Maxreach = 0;
        for (int i = 0; i <= Maxreach; i++) {
            Maxreach = Math.max(Maxreach, i + arr[i]);
            if (Maxreach >= arr.length - 1) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Array Size : ");
        int arr[]=new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter " + i + " value : ");
            arr[i] = sc.nextInt();
        }
        System.out.println(Max_Jump(arr));  
        sc.close();
    }
}
