import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import javax.lang.model.type.IntersectionType;

public class Lesson5 {
    public static void main(String[] args) {
        
        // System.out.println("a".hashCode());
        
        // Map<Integer, String> map = new HashMap<Integer, String>();
        // map.put(1, "one");
        // map.put(2, "two");
        // map.put(null, "!null");
        // System.out.println(map);
        // System.out.println(Objects.hash('a'));

        // Map<String, Integer> str = new HashMap<>();
        // String words = "asd asd sdfs  gfdj hello ksj vdv sdfjs asd asd";
        // String[] list = words.split(" ");
        // for (String word : list) {
        //     // if (str.containsKey(word)) {
        //     //     str.put(word, str.get(word) + 1);
        //     // } else  {
        //     //     str.put(word, 1);
        //     // }
        //     str.putIfAbsent(word, 0);
        //     str.put(word, str.get(word) + 1);
        // }
        // System.out.println(str);


        // Set<String> set = new HashSet<>();
        // String text = "hoo fdd fwasda abama tramp lol this is fun fun";
        // String[] str = text.split(" ");
        // for (String word : str) {
        //     if (set.contains(word)){
        //         System.out.println("true");
        //         return;
        //     } 
        //     set.add(word);
        // }
        // System.out.println("false");
        int[] num2 = {1, 2, 2,1};
        int[] num1 = {2, 2};
        int[] res = isert(num1, num2);
        for (int i : res) {
            System.out.println(i);
        }
    }   

    static int[] isert(int[] nums1, int[] nums2){
        if (nums1.length > nums2.length){
            return intersect(nums1, nums2);
        }
        Set<Integer> set = new HashSet<>();
        for (int num : nums1) {
            set.add(num);
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int num : nums2) {
            if (set.contains(num)){
                list.add(num);
                set.remove(num);
            }
        }

        int[] res = new int[list.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}
