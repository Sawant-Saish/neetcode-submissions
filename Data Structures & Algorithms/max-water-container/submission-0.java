class Solution {
    public int maxArea(int[] heights) {
        

        int n= heights.length;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<n ; i++){
            for(int j=i+1; j<n ; j++){
                if((Math.min(heights[i],heights[j]) * (j-i)) > max){
                    max = (Math.min(heights[i],heights[j]) * (j-i));
                }
            }
        }
        return max;
    }
}
