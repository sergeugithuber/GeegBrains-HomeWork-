import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

class WriteUserData {
    static Scanner scan = new Scanner(System.in);
    static AnalizData ad = new AnalizData();
    
    public static String getName1(){
        System.out.print("Введите свою Фамилию: ");
        while(true){
            try {
                String famaly = scan.next();
                ad.analizName(famaly);
                return famaly;
            } catch (LimitExeption e) {
                System.out.println("Повторите свою Фамилию");
            }
        }
    }

    public static String getName2(){
        System.out.print("Введите своё Имя: ");
        while(true){
            try {
                String firstName = scan.next();
                ad.analizName(firstName);
                return firstName;
            } catch (LimitExeption e) {
                System.out.println("Повторите своё Имя");
            }
        }
    }

    public static String getName3(){
        System.out.print("Введите своё Отечество: ");
        while(true){
            try {
                String firstName = scan.next();
                ad.analizName(firstName);
                return firstName;
            } catch (LimitExeption e) {
                System.out.println("Повторите своё Отечество");
            }
        }
    }

    public static String getPhone(){
        System.out.print("Введите свой номер телефона без форматирования\nПример: {12345678900} (11 цифр): ");
        while (true) {
            try {
                String phone = scan.next();
                ad.analizPhone(phone);
                return phone;
            } catch (LimitExeption e) {
                System.out.print("Превышен лимит, повторите попытку: ");
            } catch (NotEquelsPhoneExeption e){
                System.out.print("Номер не соответствует требованиям, повторите номер: ");
            }
        }
    }

    public String getDataBurn(){
        System.out.print("Введите свою дату рождения, в формате: {dd.mm.yyyy}");
        
        while (true) {
            String dataBurn = scan.next();
            if(dataBurn.length() != 10){
                System.out.println("Неполный ввод даты");
                continue;
            }

            StringBuilder pars = new StringBuilder(dataBurn);
            for (int i = 0; i < pars.length(); i++) {
                
            }
        }
    }

    public static Integer getFloor(){
        System.out.println("Введите свой пол\n{0} - мужской, {1} - женский");

        while (true) {
            try {
                Integer floor = scan.nextInt();
                ad.analizFloor(floor);
                return floor;
            } catch (FloorExeption e) {
                System.out.println("{0} - мужской, {1} - женский");
                return 0;
            } catch (InputMismatchException e) {
                System.out.println("{0} - мужской, {1} - женский");
            }
        }
    }

    public static void startProgram(){
        boolean machine = true;

        while(machine == true){
            try (FileWriter fw = new FileWriter("data.txt", true)){
                String famaly = getName1();
                String firstName = getName2();
                String lastName = getName3();
                String phone = getPhone();
                Integer floor = getFloor();

                fw.write(famaly);
                fw.write(firstName);
                fw.write(lastName);
                fw.write(phone);
                fw.write(floor);
                
                System.out.println("Сохранено");
            } catch (IOException e) {
                System.out.print(e.getClass().getName());
            }
        }
    }
}