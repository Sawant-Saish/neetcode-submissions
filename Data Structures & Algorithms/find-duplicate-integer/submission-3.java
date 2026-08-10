class Solution {
    public int findDuplicate(int[] nums) {
        int slow = 0;
        int fast = 0;

        while (true) {
            slow = nums[slow];
            fast = nums[nums[fast]];

            if (slow == fast) {
                slow = 0;
                while (slow != fast) {
                    slow = nums[slow];
                    fast = nums[fast];
                }
                return slow;
            }
        }
    }
}


// this is the Flyods detection algo --- fast and slow pointers.. it is easy once you know that it is the question of fast and slow pointers

// it has to cilck... so for now this is kind of parent question so remember this for this question.