public class H_Index {
    public static int Max_H_Index(int citation[]) {
        int N = citation.length;
        int arr[] = new int[N + 1];
        for (int c : citation) {
            if (c > N) {
                arr[N]++;
            } else {
                arr[c]++;
            }
        }
        int count = 0;
        for (int i = N; i >= 0; i--) {
            count += arr[i];
            if (count >= i) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 0, 6, 7, 8, 5 };
        System.out.println(Max_H_Index(arr));
    }
}
