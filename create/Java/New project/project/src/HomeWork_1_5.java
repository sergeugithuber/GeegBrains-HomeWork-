import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class HomeWork_1_5 {
    public static void main(String[] args) {
        String[] words1 = {"leetcode","is","amazing","as","is"};
        String[] words2 = {"amazing","leetcode","is"};
        System.out.println(findCount(words1, words2));
    }
    
    static int findCount(String[] words1 , String[] words2){
        if (words1.length == 0 || words2.length == 0) return 0;
        if (words1.length > words2.length){
            String[] temp = words1;
            words1 = words2;
            words2 = temp;
        }

        Map<String, Integer> map = new HashMap<>();
        for (String str : words1) {
            map.putIfAbsent(str, 0);
            map.put(str, map.get(str) + 1);
            if (map.get(str) > 2){
                map.remove(str);
            }
        }
        System.out.println(map);
        
        for (String str : words2) {
            map.putIfAbsent(str, 0);
            map.put(str, map.get(str) + 1);
            if (map.get(str) != 2){
               map.remove(str);
            }
        }
        
        List<String> keyList = new ArrayList<>(map.keySet());
        for (int i = 0; i < keyList.size(); i++) {
            if (map.get(keyList.get(i)) != 2){
                map.remove(keyList.get(i));
            }
            
        }
        
        return map.size();

        
    }
}
