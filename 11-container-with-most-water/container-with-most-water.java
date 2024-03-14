class Solution {
    public int maxArea(int[] height) {
        
        int n = height.length;

        int left = 0;
        int right = n - 1;
        int maxarea = 0;

        while(left < right)
        {
            int currentArea = Math.min(height[left], height[right]) * (right - left);
            maxarea = Math.max(maxarea, currentArea);

            if(height[left] < height[right])
            {
                left++;
            }
            else
            {
                right--;
            }
        }
        return maxarea;
    }
}