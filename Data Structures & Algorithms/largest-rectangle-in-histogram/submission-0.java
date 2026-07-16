class Solution {
    public int largestRectangleArea(int[] heights) {
        int[] nsl = NSL(heights);
        int[] nsr = NSR(heights);

        int max=0;

        for(int i=0;i<heights.length;i++){
            int width = nsr[i]-nsl[i]-1;
            int area = heights[i]*width;
            max = Math.max(max,area);
        }
        return max;
    }

    public static int[] NSL(int[] arr){
        int[] left = new int[arr.length];
        Stack<int[]> s = new Stack<>();

        for(int i=0;i<arr.length;i++){
            if(s.isEmpty()){
                left[i]=-1;
            }
            else if(!s.isEmpty() && s.peek()[0]<arr[i]){
                left[i]=s.peek()[1];
            }
            else if(!s.isEmpty() && s.peek()[0]>=arr[i]){
                while(!s.isEmpty() && s.peek()[0]>=arr[i]){
                    s.pop();
                }
                if(s.isEmpty()){
                    left[i]=-1;
                }
                else{
                    left[i]=s.peek()[1];
                }
            }
            s.push(new int[]{arr[i],i});
        }

        return left;
    }


    public static int[] NSR(int[] arr){
        int[] right = new int[arr.length];
        Stack<int[]> s = new Stack<>();

        for(int i=arr.length-1;i>=0;i--){
            if(s.isEmpty()){
             right[i]=arr.length;
            }
            else if(!s.isEmpty() && s.peek()[0]<arr[i]){
             right[i]=s.peek()[1];
            }
            else if(!s.isEmpty() && s.peek()[0]>=arr[i]){
                while(!s.isEmpty() && s.peek()[0]>=arr[i]){
                    s.pop();
                }
                if(s.isEmpty()){
                 right[i]=arr.length;
                }
                else{
                 right[i]=s.peek()[1];
                }
            }
            s.push(new int[]{arr[i],i});
        }

        return right;
    }
}
