class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        int sum=0;

        for(int i=0;i<n;i++){
            sum^=nums[i];
        }

        return sum;
    }
}
