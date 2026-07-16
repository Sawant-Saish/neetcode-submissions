class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        
        int i=0;
        int j=0;
        int[] ans = new int[nums.length - k+1];
        int z=0;
        Deque<Integer> dq = new LinkedList<>();


        while(j<nums.length){
            while (!dq.isEmpty() && nums[dq.peekLast()] <= nums[j]) {
                dq.pollLast();
            }
            dq.offerLast(j);

            if(j-i+1 <k)j++;
            else if(j-i+1 == k){
                ans[z++]=nums[dq.peekFirst()];
                if(dq.peekFirst()==i){
                    dq.pollFirst();
                }
                i++;
                j++;
            }
        }
        return ans;
    }
}
