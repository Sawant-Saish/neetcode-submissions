class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        char[] arr = new char[n];
        int j=-1;
        for(int i=0;i<n;i++){
            char ele = s.charAt(i);
            if(ele == '[' || ele=='(' || ele=='{'){
                arr[++j]=ele;
            }else if(ele == '}'){
                if(j==-1 || arr[j]!='{') return false;
                else{
                    j--;
                }
            }
            else if(ele == ')'){
                if(j==-1 ||arr[j]!='(') return false;
                else{
                    j--;
                }
            }
            else if(ele == ']'){
                if(j==-1 ||arr[j]!='[') return false;
                else{
                    j--;
                }
            }
        }
        if(j==-1){
            return true;
        }
        return false;
    }
}
