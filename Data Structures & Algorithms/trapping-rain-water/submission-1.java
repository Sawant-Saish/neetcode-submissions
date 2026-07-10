class Solution {
    public int trap(int[] height) {
        int n= height.length;
        int area = 0;

        int i = 0, j = n - 1;
        int leftMax = 0, rightMax = 0;

        while (i < j) {
            if (height[i] < height[j]) {
                if (height[i] >= leftMax) leftMax = height[i];
                else area += leftMax - height[i];
                i++;
            } else {
                if (height[j] >= rightMax) rightMax = height[j];
                else area += rightMax - height[j];
                j--;
            }
        }

        return area;

    }
}