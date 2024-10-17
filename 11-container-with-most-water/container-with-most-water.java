class Solution {
    public int maxArea(int[] height) {
        
        int n  = height.length;

        int left = 0, right = n - 1;
        int maxArea = 0;

        while(left < right)
        {
            int heightWall = Math.min(height[left], height[right]);
            int width = right - left;
            int area = heightWall * width;

            maxArea = Math.max(maxArea, area);

            if(height[left] < height[right])
            {
                left++;
            }
            else
            {
                right--;
            }
        }
        return maxArea;
    }
}

//timecomplexity: O(n)
//spacecomplexity: O(1)