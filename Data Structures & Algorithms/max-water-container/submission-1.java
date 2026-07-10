class Solution {
    public int maxArea(int[] heights) {
        
        int i=0;
        int n= heights.length;
        int j=n-1;
        int max = Integer.MIN_VALUE;
        while(i<j){
            if((Math.min(heights[i],heights[j]) *(j-i))>max){
                max = Math.min(heights[i],heights[j]) *(j-i);
            }
            if(heights[i]<heights[j]) i++;
            else if(heights[i]>heights[j])j--;
            else { i++; j--; }
        }
        return max;
    }
}