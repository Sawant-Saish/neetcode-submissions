class Solution {
    public String minWindow(String s, String t) {

        HashMap<Character, Integer> map = new HashMap<>();
        int count = 0;
        for (char ch : t.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            count++;
        }
        int i = 0;
        int j = 0;
        int minLen = Integer.MAX_VALUE;
        int start = 0;
        while (j < s.length()) {
            if (map.containsKey(s.charAt(j))) {
                int x = map.get(s.charAt(j));
                if (x > 0) {
                    count--;
                }
                map.put(s.charAt(j), x - 1);
            }

            while (count == 0) {
                if (j - i + 1 < minLen) {
                    minLen = j - i + 1;
                    start = i;
                }
                char left = s.charAt(i);
                if (map.containsKey(left)) {
                    int x = map.get(left);
                    map.put(left, x + 1);
                    if (x >= 0) {
                        count++;
                    }
                }
                i++;
            }
            j++;
        }
        if (minLen == Integer.MAX_VALUE) {
            return "";
        }
        return s.substring(start, start + minLen);
    }
}