import java.util.ArrayList;
import java.util.List;

class Reader {
    String surname;
    String name;
    String fatherland;
    int readerNumber;
    String faculty;
    String born;
    String phone; 

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
        for (String b : book) {
            books.add(b);
        }
        System.out.println(this.surname + " " + this.name.charAt(0) + "." + this.fatherland.charAt(0) + ". взял книгу(и): " + printList(books));
    }

    public void takeBook(int number){
        String book = " ";

        if (1 < number % 10 && number % 10 < 5) {
            book = "книги";
        } else if (number % 10 == 1) {
            book = "книгу";
        } else {
            book = "книг";
        }

        System.out.println(this.surname + " " + this.name.charAt(0) + "." + this.fatherland.charAt(0) + " взял " + number + " " + book);
    }

    static String printList(List<String> al) {
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