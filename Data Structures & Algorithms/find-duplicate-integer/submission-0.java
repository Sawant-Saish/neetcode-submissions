class Solution {
    public int findDuplicate(int[] nums) {
        ArrayList<Integer> map = new ArrayList<>();
        for(int i=0 ;i<nums.length;i++){
            if(map.contains(nums[i])){
                return nums[i];
            }
            map.add(nums[i]);
        }

        return -1;
    }
}
