class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int[] feq = new int[26];
        
        int i=0,j=0,len=0,maxv=0,maxf=0;

        while(j<n){
            feq[s.charAt(j)-'A']++;
            maxf = Math.max(maxf,feq[s.charAt(j)-'A']);

            while((j-i+1)-maxf > k){
                feq[s.charAt(i)-'A']--;
                i++;
            }

            maxv = Math.max(maxv,j-i+1);
            j++;
        }
        return maxv;
    }
}
