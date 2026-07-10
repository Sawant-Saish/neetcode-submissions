class Solution {
    public boolean isPalindrome(String s) {
        int n = s.length();
        int i = 0;
        int j = n-1;
        
        while(i<j){
            if(!(65<=s.charAt(j) && s.charAt(j)<=90 || 97<=s.charAt(j) && s.charAt(j)<=122 || 49<=s.charAt(j) && s.charAt(j)<=57)){
                j--;
            }
            if(!(65<=s.charAt(i) && s.charAt(i)<=90 || 97<=s.charAt(i) && s.charAt(i)<=122 || 49<=s.charAt(i) && s.charAt(i)<=57)){
                i++;
            }
            if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))){
                return false;
            }
            
            i++;
            j--;
        
        }

        return true;
    }
}
