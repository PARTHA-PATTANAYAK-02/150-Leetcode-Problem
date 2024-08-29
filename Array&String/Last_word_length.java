import java.util.Scanner;

public class Last_word_length {
    public static int Length_of_last_word(String str) {
        boolean find = false;
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) != ' ') {
                find = true;
                sb.append(str.charAt(i));
            } else if (find) {
                break;
            }
        }
        return sb.length();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = sc.nextLine();
        System.out.println("Last word length is : " + Length_of_last_word(str));
        sc.close();
    }
}

/* IF you want to know last word & its length */

// public class Last_word_length {
// public static String Length_of_last_word(String str) {
// boolean find = false;
// StringBuilder sb = new StringBuilder();
// for (int i = str.length() - 1; i >= 0; i--) {
// if (str.charAt(i) != ' ') {
// find = true;
// sb.append(str.charAt(i));
// } else if (find) {
// break;
// }
// }
// return sb.reverse().toString();
// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.print("Enter a String : ");
// String str = sc.nextLine();
// str=Length_of_last_word(str);
// System.out.println("Last word is : " + str);
// System.out.println("Length is : "+str.length());
// sc.close();
// }
// }
