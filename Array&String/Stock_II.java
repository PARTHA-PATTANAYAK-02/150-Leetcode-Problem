import java.util.*;
public class Stock_II {
    public static int Buy_Stock(int []prices){
        int profit=0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i-1]<prices[i]) {
                profit+=prices[i]-prices[i-1];
            }
        }
        return profit;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Array size : ");
        int arr[]=new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter "+i+" value : ");
            arr[i]=sc.nextInt();
        }
        System.out.println("Max Profit is  : "+Buy_Stock(arr));
        sc.close();
    }
}
