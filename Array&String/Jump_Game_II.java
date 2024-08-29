import java.util.Scanner;

public class Jump_Game_II {
    public static int Min_Jump(int[] arr) {
        int Jump = 0, Cur_end = 0, Max_reach = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            Max_reach = Math.max(Max_reach, i + arr[i]);
            if (i == Cur_end) {
                Jump++;
                Cur_end = Max_reach;
            }
        }
        return Jump;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Array size : ");
        int arr[] = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter " + i + " value : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("The Min Jump is : "+Min_Jump(arr));
        sc.close();
    }
}
