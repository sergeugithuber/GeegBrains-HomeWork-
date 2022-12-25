import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(4);
        a.add(2);
        a.add(3);
        ArrayList<Integer> b = new ArrayList<>();
        b.add(1);
        b.add(2);
        b.add(3);
        if (Check(a, b)) { //Input: a = [4, 2, 3] b = [1, 2, 3]
            System.out.println("True");
        } else {
            System.out.println("False");
        }  // Выполнение кода
    }
    
    static boolean Check(ArrayList<Integer> a, ArrayList<Integer> b) { //Метод
        // На вход приходят два ArrayList<Integer> напишите метод, 
        //который проверяет два массива на равенство. Нужно реализовать алгоритм, НЕ использовать метод equals.
        boolean check = false;
        if (a.size() == b.size()) {
            check = true;
            for (int i = 0; i < a.size(); i++) {
                if (a.get(i) != b.get(i)) {
                    check = false;
                    i = a.size(); //Break
                }
            }
        }
        return check;
    }
}





