import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = { 2, 5, 6 };
        System.out.println(merge(nums1, 3, nums2, 3));
    }
    
    static ArrayList<Integer> merge(int[] nums1, int m, int[] nums2, int n) {
        ArrayList<Integer> array = new ArrayList<>(m + n);
        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] != 0) {
                array.add(nums1[i]);
            } else {
                continue;
            }
        }
        for (int j = 0; j < nums2.length; j++) {
            if (nums2[j] != 0) {
                array.add(nums2[j]);
            }
            else {
                continue;
            }
        }
        // ^^^ Добавляем элементы из nums, игнорируя 0 ^^^ //
        int temp = 0;
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.size() - 1; i++) {
                if (array.get(i) > array.get(i + 1)) {
                    temp = array.get(i);
                    array.set(i, temp); // temp = array.get(i)
                    array.set(i, array.get(i + 1));
                    array.set(i + 1, temp);
                    sorted = false;
                }

            }
        }
        // ^^^ Сортировка пузырьком ^^^ //
        return array;
    }   
}











