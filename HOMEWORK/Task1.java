package HOMEWORK;

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        String[] words1 = {"leetcode","is","amazing","as","is"};
        String[] words2 = {"amazing","leetcode","is"};
        System.out.println(findCount(words1, words2));
    }
    
    static int findCount(String[] words1 , String[] words2){
        int count = 0;
        Map<String, Integer> map = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();

        for (String str : words1) {
            map.putIfAbsent(str, 0);
            map.put(str, map.get(str) + 1);
        }

        for (String str : words2) {
            map2.putIfAbsent(str, 0);
            map2.put(str, map2.get(str) + 1);
        }

        for (String str : words1) {
            if (map2.containsKey(str)) {
                if (map.get(str) == 1 && map2.get(str) == 1) {
                    count++;
                }
            }
        }
        return count;
    }
}

