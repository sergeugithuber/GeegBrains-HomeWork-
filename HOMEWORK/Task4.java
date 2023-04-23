import java.util.Scanner;

public class Task4 {
    
    public static void inputForUser(){
        try (Scanner scan = new Scanner(System.in)) {
            String text = scan.next();
            if (text == null){
                throw new RuntimeException("Текст не может быть пустым");
            }
        }
    }
}
