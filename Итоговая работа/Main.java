public class Main{
    public static void main(String[] args) {
        Reader person1 = new Reader("Пупкин", "Вася", "Кашильников", 15245, "Инженерия", "01.30.1991", "33423444");
        person1.takeBook("Энциклопедия");
        person1.takeBook(21);
        person1.returnBook("Приключения", "Фантастика", "Энциклопедия");
        person1.returnBook(1);
        Reader person2 = new Reader("NULL", "FALSE", "TRUE");
        Reader[] reads = {person1, person2};
    }

}