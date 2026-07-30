class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hSet = new HashSet<Integer>();
        for(Integer num : nums) {
            hSet.add(num);
        }

        int longest =0;

        for(int num : hSet){
            if(!hSet.contains(num-1)) {
                int length =1;
                while(hSet.contains(num+length)) {
                    length++;
                }
                longest = Math.max(longest, length);
            }
        }

        return longest;
    }
}
