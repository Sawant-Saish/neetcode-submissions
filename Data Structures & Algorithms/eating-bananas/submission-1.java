class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;

        for(int pile : piles){
            high = Math.max(pile, high);
        }

        int res = high; // Store the best valid eating rate found so far

        while(low<=high){
                int mid = low+(high-low)/2;

                int time = 0;
                for(int pile : piles){
                    time += (pile + mid - 1)/mid; // This is similar to Math.ceil( pile/mid ), but for better optimisation we use this.
                }

                if(time<=h){
                    res = mid;
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
        }
        return res;
    }
}



