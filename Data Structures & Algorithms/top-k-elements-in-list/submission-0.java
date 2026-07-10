class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer,Integer> map = new HashMap<>();
        int[] result = new int[k];
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int i = 0; i < k; i++) {
            int maxFreq = 0;
            int ans = 0;
            for (Map.Entry<Integer,Integer> e : map.entrySet()) {
                if (e.getValue() > maxFreq) {
                    maxFreq = e.getValue();
                    ans = e.getKey();
                }
            }
            result[i] = ans;
            map.remove(ans);
        }

        return result;
    }
}
