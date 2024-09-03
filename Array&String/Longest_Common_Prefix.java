import java.util.Scanner;

public class Longest_Common_Prefix {
    public static String LongestPrefix(String[] str) {
        if (str == null || str.length == 0) {
            return "";
        }
        String prefix = str[0];
        for (String st : str) {
            while (st.indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Array Size : ");
        String str[] = new String[sc.nextInt()];
        sc.nextLine();
        for (int i = 0; i < str.length; i++) {
            System.out.print("Enter " + i + " String : ");
            str[i] = sc.nextLine();
        }
        sc.close();
        System.out.println("\nThe Longest Common Prefix is : " + LongestPrefix(str));
    }
}
