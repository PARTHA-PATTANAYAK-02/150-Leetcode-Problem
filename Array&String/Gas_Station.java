public class Gas_Station {
    private static int Calculate_Index(int[] gas, int[] cost) {
        int total_diff = 0, fuel = 0, index = 0;
        for (int i = 0; i < cost.length; i++) {
            int diff = gas[i] - cost[i];
            total_diff += diff;
            fuel += diff;
            if (fuel < 0) {
                index = i + 1;
                fuel = 0;
            }
        }
        return (total_diff < 0) ? -1 : index;
    }

    public static void main(String[] args) {
        int gas[] = { 1, 2, 3, 4, 5 };
        int cost[] = { 3, 4, 5, 1, 2 };
        System.out.println(Calculate_Index(gas, cost));
        int[] array1 = { 2, 3, 4 };
        int[] array2 = { 3, 4, 3 };
        System.out.println(Calculate_Index(array1, array2));
    }
}
