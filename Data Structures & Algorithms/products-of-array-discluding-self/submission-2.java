class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] flag = new int[n];
        int product=1;
        int flag1 = 0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                flag[i]=1;
                flag1 ++;
                continue;
            }
            product *= nums[i];
        }

        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            if(flag1==1){
                if(flag[i]==1){
                    ans[i]=product;
                }else{
                    ans[i]=0;
                }
            }
            else if(flag1>1){
                ans[i]=0;
            }
            else{
                ans[i]=(product)/nums[i];
            }
        }

        return ans;
    }
}  
