class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = firstOccurence(nums, target);
        if(first == -1) return new int []{-1, -1};
        int last = lastOccurence(nums, target);
        return new int []{first, last};
    }
    public int firstOccurence(int [] nums, int target)
    {
        int first = -1;
        int n = nums.length;
        int low = 0, high = n - 1;

        while(low <= high)
        {
            int mid = low + (high - low) /2;
            if(nums[mid] == target)
            {
                first = mid;
                high = mid - 1;
            }
            else if(nums[mid] < target)
            {
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
        }
        return first;
    }
    public int lastOccurence(int nums[], int target)
    {
        int last = -1;
        int n = nums.length;
        int low = 0, high = n - 1;

        while(low <= high)
        {
            int mid = low + (high - low)/2;
            if(nums[mid] == target)
            {
                last = mid;
                low = mid + 1;
            }
            else if(nums[mid] < target)
            {
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
        }
        return last;
    }
}
//timecomplexity: O(log n)