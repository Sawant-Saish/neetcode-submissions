class Solution {
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length-1;
        int mid,res=-1;

        
        while(low<=high){
            if(nums[low]<=nums[high]) return nums[low];
            
            mid = low+(high-low)/2;
            int next = (mid+1)%nums.length;
            int prev = (mid+nums.length -1)%nums.length;
            if(nums[next]>=nums[mid] && nums[prev]>=nums[mid] ){
                res = mid;
                break;
            }
            if(nums[low]<=nums[mid]){
                low = mid+1;
            }else 
                high = mid-1;
        }
        return nums[res];
    }
    
}

