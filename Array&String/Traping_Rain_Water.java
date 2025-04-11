public class Traping_Rain_Water {
    public int trap(int[] height) {
        int sum = 0; // Initialize total water trapped
        int n = height.length; // Length of the height array
        if (n == 0)
            return 0; // If no heights, return 0
        int leftMax[] = new int[n]; // Array to store left max heights
        int rightMax[] = new int[n]; // Array to store right max heights
        leftMax[0] = height[0]; // First element is the left max for itself
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]); // Fill left max array
        }
        rightMax[n - 1] = height[n - 1]; // Last element is the right max for itself
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]); // Fill right max array
        }
        for (int i = 0; i < n; i++) {
            sum += Math.min(leftMax[i], rightMax[i]) - height[i]; // Calculate water trapped at each index
        }
        return sum; // Return total water trapped
    }
}
