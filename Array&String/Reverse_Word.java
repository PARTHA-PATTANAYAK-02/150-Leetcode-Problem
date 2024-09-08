import java.util.Scanner;

public class Reverse_Word {
    public static String reverseWords(String str) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder(); // give us final output
        boolean flag = true;
        str = str.trim();
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) != ' ') {
                sb1.append(str.charAt(i));
                flag = true; 
            } else {
                if (flag) {
                    flag = false;
                    sb1.reverse();
                    sb2.append(sb1);
                    sb2.append(' ');
                    sb1.setLength(0);
                }
            }
            if (i == 0) {
                sb1.reverse();
                sb2.append(sb1);
            }
        }
        return sb2.toString();
    }
    // Another Method
    
    
    // public static String reverseWords(String str) {
    //     // Trim leading/trailing spaces and split the string by spaces
    //     String[] words = str.trim().split("\\s+"); // \\s+ ensures handling multiple spaces
    //     StringBuilder sb = new StringBuilder();

    //     // Append words in reverse order
    //     for (int i = words.length - 1; i >= 0; i--) {
    //         sb.append(words[i]);
    //         if (i > 0) {
    //             sb.append(" "); // Add space between words, but not after the last word
    //         }
    //     }
    //     return sb.toString();
    // }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A String  : ");
        String str = sc.nextLine();
        System.out.print("Before Reverse : " + str);
        System.out.print("\nAfter Reverse : " + reverseWords(str));
        sc.close();
    }
}
