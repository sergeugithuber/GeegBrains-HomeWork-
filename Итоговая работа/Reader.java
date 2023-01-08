import java.util.ArrayList;
import java.util.List;

class Reader {
    String surname;    // Фпмилия
    String name;       // Имя
    String fatherland; // Отечество
    int readerNumber;  // читательский номер
    String faculty;    // Факультет
    String born;       // Дата рождения
    String phone;      // телефон 

    public Reader(){
    }
     
    public Reader(String surname, String name, String fatherland){
        this.surname = surname;
        this.name = name;
        this.fatherland = fatherland;
    }

    public Reader(String surname, String name, String fatherland, int readerNumber, String faculty, String born, String phone){
        this.surname = surname;
        this.name = name;
        this.fatherland = fatherland;
        this.readerNumber = readerNumber;
        this.faculty = faculty;
        this.born = born;
        this.phone = phone; 
    }

    public void takeBook(String... book){
        List<String> books = new ArrayList<>();
        String ret = "книг";
        for (String b : book) {
            books.add(b);
        }

        if (books.size() == 1 || books.size() % 10 == 1)
            ret = "книгу";

        System.out.println(this.surname + " " + this.name.charAt(0) + "." + this.fatherland.charAt(0) + ". взял " + ret
                + " " + printList(books));
    }

    public void takeBook(int number){
        String book;

        if (1 < number % 10 && number % 10 < 5) {
            book = "книги";
        } else if (number % 10 == 1) {
            book = "книгу";
        } else {
            book = "книг";
        }

        System.out.println(this.surname + " " + this.name.charAt(0) + "." + this.fatherland.charAt(0) + ". взял "
                + number + " " + book);
    }

    public void returnBook(String... book) {
        List<String> books = new ArrayList<>();
        String ret = "книги";

        for (String b : book) {
            books.add(b);
        }

        if (books.size() == 1)
            ret = "книгу";

        System.out.println(this.surname + " " + this.name.charAt(0) + "." + this.fatherland.charAt(0) + ". вернул "
                + ret + " " + printList(books));
    }
    
    public void returnBook(int number) {
        String book;

        if (1 < number % 10 && number % 10 < 5) {
            book = "книги";
        } else if (number % 10 == 1) {
            book = "книгу";
        } else {
            book = "книг";
        }

        System.out.println(this.surname + " " + this.name.charAt(0) + "." + this.fatherland.charAt(0) + ". вернул "
                + number + " " + book);
    }
    
    static String printList(List<String> al) {
        //Этот метод для вывода неопределённого кол-во строк (String...)
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < al.size(); i++) {
            if (i == al.size() - 1) {
                res.append(al.get(i));
            } else {
                res.append(al.get(i));
                res.append(", ");
            }
        }

        return res.toString();
    }
}