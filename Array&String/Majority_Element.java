import java.util.*;
public class Majority_Element {
    public static int Majority(int []arr){
        int candidate=0,count=0; 
        for (int val : arr) {
            if (count == 0) {
                candidate=val;
            }
            if (val == candidate) {
                count++;
            }else{
                count--;
            }
        }    
        count=0;
        for (int i : arr) {
            if (candidate == i) {
                count++;
            }
        }   
        if (count > arr.length/2) {
            return candidate;
        }else{
            return -1;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Array size : ");
        int arr[]=new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter "+i+" value : ");
            arr[i]=sc.nextInt();
        }
        int result=Majority(arr);
        System.out.println(result == -1 ? "No Majority Element is there" : "Majority Element is : "+result);
        sc.close();
    }
}
