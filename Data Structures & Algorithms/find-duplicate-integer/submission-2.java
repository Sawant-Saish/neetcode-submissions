class Solution {
    public int findDuplicate(int[] nums) {

        int slow = nums[0];
        int fast = nums[0];
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        slow = nums[0];

        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }
}

// this is the Flyods detection algo --- fast and slow pointers.. it is easy once you know that it is the question of fast and slow pointers

// it has to cilck... so for now this is kind of parent question so remember this for this question.