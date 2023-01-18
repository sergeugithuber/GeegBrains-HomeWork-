public class App {
    public static void main(String[] args) throws Exception {
        Human man = new Human("Вася", "Пупкин", "ребёнок", "брат");
        man.getInfo();
        Wardrobe v = new Wardrobe("wood");
        v.getInfo();
        v.openWardrope(man);
        v.closeWardrope(man);
        v.closeWardrope(man);
        System.out.println();
        
        Cat cat = new Cat("Барсик", "Кис-кис");
        cat.callFor(man);
    }
}
