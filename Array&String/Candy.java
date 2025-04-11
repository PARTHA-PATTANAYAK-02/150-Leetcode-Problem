import java.util.Arrays;

public class Candy {
    public int candy(int[] ratings) {
        int ans[] = new int[ratings.length];
        Arrays.fill(ans, 1); // Initialize all children with 1 candy
        for (int i = 1; i < ratings.length; i++) {
            if (ratings[i] > ratings[i - 1]) {
                ans[i] = ans[i - 1] + 1; // If current rating is greater than previous, give one more candy
            }
        }
        for (int i = ratings.length - 1; i > 0; i--) {
            if (ratings[i] < ratings[i - 1] && ans[i] >= ans[i - 1]) {
                ans[i - 1] = ans[i] + 1; // If current rating is less than previous, ensure previous has more candies
            }
        }
        return Arrays.stream(ans).sum(); // Return the total number of candies
    }
}
