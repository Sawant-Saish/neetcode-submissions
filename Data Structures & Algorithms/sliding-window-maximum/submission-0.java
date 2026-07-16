class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        
        int i=0;
        int j=0;
        int[] ans = new int[nums.length - k+1];
        int z=0;
        List<Integer> list = new ArrayList<>();
        while(j<nums.length){
            while(list.size()>0 && list.get(list.size()-1)<nums[j]){
                list.remove(list.size()-1);
            }
            list.add(nums[j]);

            if(j-i+1 <k)j++;
            else if(j-i+1 == k){
                ans[z++]=list.get(0);
                if(list.get(0)==nums[i]){
                    list.remove(0);
                }
                i++;
                j++;
            }
        }
        return ans;
    }
}
