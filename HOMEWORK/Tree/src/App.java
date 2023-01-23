import Anim.Animal;
import Anim.Cat;
import Anim.Dog;
import People.Man;
import People.Woman;

public class App {
    public static void main(String[] args) throws Exception {
        Man man = new Man("Вася", "Пупкин", "сын", "брат");
        man.getInfo();
        Wardrobe v = new Wardrobe("wood");
        v.getInfo();
        v.openWardrope(man);
        v.closeWardrope(man);
        v.closeWardrope(man);
        System.out.println();
        
        Cat cat = new Cat("Барсик", "Кис-кис");
        cat.callFor(man);

        Dog dog = new Dog("Bobby", "*whistling");    
        System.out.println(Animal.kingdom);

        Woman woman = new Woman("Настя", "Пупкина", "дочь", "сестра");
        dog.callFor(woman);
    }
}
