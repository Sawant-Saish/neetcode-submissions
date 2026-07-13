class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int flag=0;
        for(int i=0;i<m;i++){
            if(matrix[i][n-1]<target){
                continue;
            }else{
                for(int j=0;j<n;j++){
                    if(matrix[i][j]==target){
                        flag =1;
                        break;
                    }
                }
            }
        }

        if(flag==0){
            return false;
        }else{
            return true;
        }
    }
}
