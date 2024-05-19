package Interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution1 {

    public static void main(String[] args) {
        String P = "abada";
        String Q = "bacad";
        Solution1 solution1 = new Solution1();
        int result = solution1.solution(P, Q);
        System.out.println(result);
    }// Output: 2


    public int solution(String p, String q) {
        Map<Character, Integer> charToIndex = new HashMap<>();
        for (int i = 0; i < 26; i++) {
            charToIndex.put((char) (i + 'a'), i);
        }
        List<Pair<Integer, Integer>> pairs = new ArrayList<>();
        int mask = 0;
        int res = 0;
        for (int i = 0; i < p.length(); i++) {
            char c1 = p.charAt(i);
            char c2 = q.charAt(i);
            if (c1 == c2) {
                res++;
                mask |= (1 << charToIndex.get(c1));
            } else {
                pairs.add(new Pair<>(charToIndex.get(c1), charToIndex.get(c2)));
            }
        }
        Map<String, Integer> cache = new HashMap<>();
        return res + t(pairs, mask, 0, cache);
    }


    private static int t(List<Pair<Integer, Integer>> pairs, int mask, int i, Map<String, Integer> cache) {
        String key = i + "," + mask;
        if (cache.containsKey(key)) {
            return cache.get(key);
        }
        if (i == pairs.size()) {
            return 0;
        }
        Pair<Integer, Integer> pair = pairs.get(i);
        int j = pair.getKey();
        int k = pair.getValue();
        if (((mask >> j) & 1) == 1 || ((mask >> k) & 1) == 1) {
            int result = t(pairs, mask, i + 1, cache);
            cache.put(key, result);
            return result;
        }
        int result = 1 + Math.min(t(pairs, mask + (1 << j), i + 1, cache),
                t(pairs, mask + (1 << k), i + 1, cache));
        cache.put(key, result);
        return result;
    }

    private static class Pair<T, U> {
        private final T key;
        private final U value;

        public Pair(T key, U value) {
            this.key = key;
            this.value = value;
        }

        public T getKey() {
            return key;
        }

        public U getValue() {
            return value;
        }
    }
}

