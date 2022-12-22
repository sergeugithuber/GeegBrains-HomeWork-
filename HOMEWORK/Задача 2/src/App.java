import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        int[] nums = new int[] {0,1,2,2,3,0,4,2};
        int val = 2;
        System.out.println(removeElement(nums, val));
    }

    static ArrayList<Integer> removeElement(int[] nums, int val) {
       
        ArrayList<Integer> res = new ArrayList<>(nums.length - 1);
        for (int i : nums) {
            if (i != val) {
                res.add(i);
            }
        }
        return res;
    }
}   







