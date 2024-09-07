import java.util.Scanner;

public class Reverse_Word {
    public static String reverseWords(String str) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder(); // give us final output
        int count = 0;
        // convert to array
        char ch[] = str.trim().toCharArray();
        // reverse the array
        for (int i = 0; i < ch.length / 2; i++) {
            int last = ch.length - 1 - i;
            char temp = ch[i];
            ch[i] = ch[last];
            ch[last] = temp;
        }
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] != ' ') {
                sb1.append(ch[i]);
                count = 0; // reset count 0 for next word
            } else {
                count++; // count the space
                if (count == 1) { // work only space count 1
                    sb1.reverse();
                    sb2.append(sb1);
                    sb2.append(' ');
                    sb1.setLength(0);
                }
            }
            if (i == ch.length - 1) {
                sb1.reverse();
                sb2.append(sb1);
            }
        }
        return sb2.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A String  : ");
        String str = sc.nextLine();
        System.out.print("Before Reverse : " + str);
        System.out.print("\nAfter Reverse : " + reverseWords(str));
        sc.close();
    }
}
