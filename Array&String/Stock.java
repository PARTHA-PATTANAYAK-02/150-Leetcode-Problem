import java.util.*;

public class Stock {
    public static int Buy_Stock(int[] prices) {
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice) {
                minprice = prices[i];
            } else if (prices[i] - minprice > maxprofit) {
                maxprofit = prices[i] - minprice;
            }
        }
        return maxprofit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Array Size : ");
        int arr[] = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter " + i + " value : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Max Profit is : " + Buy_Stock(arr));
        sc.close();
    }
}
