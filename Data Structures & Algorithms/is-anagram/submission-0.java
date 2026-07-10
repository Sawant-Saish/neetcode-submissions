class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> hmap = new HashMap<>();
        HashMap<Character,Integer> tmap = new HashMap<>();

        for(char ch : s.toCharArray()){
            if(hmap.containsKey(ch)){
                hmap.put(ch, hmap.get(ch) + 1);
            }
            else{
                hmap.put(ch, 1);
            }
        }

        for(char ch : t.toCharArray()){
            if(tmap.containsKey(ch)){
                tmap.put(ch, tmap.get(ch) + 1);
            }
            else{
                tmap.put(ch, 1);
            }
        }

        if(tmap.equals(hmap)){
            return true;
        }else{
            return false;
        }
    }
}