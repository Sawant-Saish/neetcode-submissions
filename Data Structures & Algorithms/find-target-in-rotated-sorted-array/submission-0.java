class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        int min=0;
        while(low<=high){

            if(nums[low]<=nums[high]){
                min = low;
                break;
            }

            int mid = low+(high-low)/2;

            int next = (mid+1)%nums.length;
            int prev = (mid+nums.length-1)%nums.length;

            if(nums[prev]>=nums[mid]&& nums[next]>=nums[mid]){
                min = mid;
                break;
            }
            else if(nums[low]<=nums[mid]){
                low= mid+1;
            }else{
                high = mid-1;
            }
        }

        int res1 = search(nums,target,0,min-1);
        int res2 = search(nums,target,min,nums.length-1);

        if(res1 ==-1){
            return res2;
        }
        return res1;
    }

    public int search(int[] nums,int target,int start, int end){
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target == nums[mid]){
                return mid;
            }  
            else if(target>nums[mid]){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
}