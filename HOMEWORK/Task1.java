import java.util.Scanner;

/*
Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению 
приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.
*/
public class Task1 {
    
    public static Float returnFloat(){
        boolean next = false;
        System.out.println("Input the number of float");

        while (next != true){
            try (Scanner scan = new Scanner(System.in);){
                Float n = scan.nextFloat();
                return n;
            } catch(ClassCastException e) {
                System.out.println(e.getClass().getName());
                System.out.print("Repiat input: ");
            }
        }
        return null; 
    }
}
