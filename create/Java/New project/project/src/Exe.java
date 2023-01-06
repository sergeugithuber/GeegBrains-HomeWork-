import java.util.Arrays;
import java.util.HashSet;

public class Exe {
    
    public static void main(String[] args) {
        
        Worker w1 = new Worker();
        w1.id = 999;
        w1.salary = 1_000_000;
        w1.name = "Orange";
        w1.Famaly = "Dimon";

        Worker w2 = new Worker();
        w2.id = 999;
        w2.salary = 1_000_000;
        w2.name = "Orange";
        w2.Famaly = "Dimon";

        Worker w3 = new Worker();
        w3.id = 923;
        w3.salary = 1000;
        w3.name = "Lola";
        w3.Famaly = "Dimon";

        Worker w4 = new Worker();
        w4.id = 1234;
        w4.salary = -10;
        w4.name = "Dimon";
        w4.Famaly = "Limon";
        
        System.out.println(w1);
        System.out.println(w1.hashCode());
        System.out.println(w1 == w2);
        System.out.println(w1.equals(w2));
        //var workers = new HashSet<Worker>(Arrays.asList(w1, w2, w3));
    }
}
