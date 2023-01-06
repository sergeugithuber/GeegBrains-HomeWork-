public class Main{
    public static void main(String[] args) {
        Reader person1 = new Reader("Пупкин", "Вася", "Кашильников", 15245, "Инженерия", "01.30.1991", "+323222 (999) 588-849-56");
        person1.takeBook("Весёлая собачонка");
        person1.takeBook(22);
    }
}