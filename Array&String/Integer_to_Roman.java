import java.util.Scanner;

public class Integer_to_Roman {
    public static String intToRoman(int num) {
        // Define Roman numeral values and their corresponding symbols
        int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String[] symbols = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

        StringBuilder roman = new StringBuilder();

        // Loop through values and symbols to build the Roman numeral
        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                roman.append(symbols[i]);
                num -= values[i];
            }
        }
        return roman.toString();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num=sc.nextInt();
        sc.close();
        if (num > 0) {
            System.out.println(intToRoman(num));
        }else{
            System.out.println("Number must be positive");
        }
    }
}
