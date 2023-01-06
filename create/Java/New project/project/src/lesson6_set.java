import java.util.HashSet;
import java.util.Set;

public class lesson6_set {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(123);
        System.out.println(set);
        System.out.println(set.contains(123));
        set.add(123);
        set.add(123);
        set.add(13);
        set.add(12);
        System.out.println(set);
    }
}
