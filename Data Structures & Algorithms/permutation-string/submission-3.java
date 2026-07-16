class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            map.put(s1.charAt(i), map.getOrDefault(s1.charAt(i), 0) + 1);
        }
        int count = map.size(); // ye kind of flag hai ,to check weather all the elements frequence is used or not.
        int i = 0;   
        int j = 0;

        while (j < s2.length()) {
            if (map.containsKey(s2.charAt(j))) {
                char ch = s2.charAt(j);
                map.put(ch, map.get(ch) - 1);
                if (map.get(ch) == 0)
                    count--;
            }

            if (j - i + 1 < s1.length()) {
                j++;
            }
            else if (j - i + 1 == s1.length()) {
                if (count == 0)
                    return true;
                if (map.containsKey(s2.charAt(i))) {
                    char ch = s2.charAt(i);
                    if (map.get(ch) == 0)
                        count++;
                    map.put(ch, map.get(ch) + 1);
                }
                i++;
                j++;
            }
        }

        return false;
    }
}