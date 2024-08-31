import java.util.Scanner;

public class Find_first_Occurrence {
    public static int First_Occurrence_Index(String haystack, String needle) {
        if (haystack.length() < needle.length()) {
            return -1;
        }
        for (int i = 0; i < haystack.length() - needle.length(); i++) {
            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First String : ");
        String str1 = sc.nextLine();
        System.out.print("Enter Second String : ");
        String str2 = sc.nextLine();
        int result = First_Occurrence_Index(str1, str2);
        if (result >= 0) {
            System.out.println("'" + str2 + "' is Occur in '" + str1 + "' at index : " + result);
        }else{
            System.out.println("'" + str2 + "' is not Occur in '" + str1);
        }
        sc.close();
    }
}
