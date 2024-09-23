import java.util.Scanner;

public class Roman_to_Integer {
    public static int Get_value(char ch){ //find the corresponding value
        switch (ch) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
    public static int romantointeger(String str){
        int size=str.length();
        int sum=0;
        for(int i=0; i<size; i++){
            char ch1=str.charAt(i);
            if (ch1 == 'I' || ch1 == 'V' || ch1 == 'X' || ch1 == 'L' || ch1 == 'C' || ch1 == 'D' || ch1 == 'M') {  // check every char is match roman letter or not
                if ((i + 1) < size && Get_value(ch1) < Get_value(str.charAt(i + 1))) {
                    sum -= Get_value(ch1);
                } else {
                    sum += Get_value(ch1);
                }
            } else {
                return 0;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number in Roman : ");
        String str=sc.nextLine().toUpperCase();
        sc.close();
        if (romantointeger(str) != 0) {
            System.out.println(str + " = " + romantointeger(str));
        }else{
            System.out.println("Wrong input : "+ str);
        }
    }
}
