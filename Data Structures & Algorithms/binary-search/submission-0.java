class Solution {
    public int search(int[] nums, int target) {
        
        int n = nums.length;
        int l = 0;
        int r = n-1;
        int mid=0;
        while(l<=r){
            mid = (r+l)/2;

            if(target==nums[mid]) return mid;
            else if(target>nums[mid]) l=mid+1;
            else r = mid-1;
        }

        if(target != nums[mid]){
            return -1;
        }

        return mid;
        

    }
}
