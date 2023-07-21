import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import classes.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Director dir = new Director("Ben", "Kholod", "Hola", 45, "+7998642323", "руководитель программистов", 250000);
        Worker wizard = new Worker("Воланд", "Коровьёв", "Маг", 2023, "+00000000000", "маг", 50);
        Worker buttom = new Worker("Иван", "Николаевич", "Бездомный", 23, "+993939194", "поэт", 12000);

        System.out.println(dir.salary);
        System.out.println();
        List<Worker> workers = new ArrayList<>();
        workers.add(dir);
        workers.add(wizard);
        workers.add(buttom);

        for (int i = 0; i < workers.size(); i++) {
            workers.get(i).upSalary(10000);
        }

        System.out.printf("%s зарплата: %d", dir.status, dir.salary);
        System.out.println();
    
        //Приминение компоратора
        Collections.sort(workers); //Сортировка по зарплате
        System.out.println(workers);

        MaxAgeComparator ageComparator = new MaxAgeComparator();
        Collections.sort(workers, ageComparator); //Сортировка по возрасту
        System.out.println(workers);
    }
}
