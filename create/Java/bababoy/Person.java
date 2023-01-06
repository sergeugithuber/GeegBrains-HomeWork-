package create.Java.bababoy;

public class Person {
    private int age;
    private String name; // поля (age, name)
    
    public Person(){
    }
    //Конструктор - это функция, которая совпадает с именем коласса 
    //В данном случае это Person
    // при создании класса создаётся конструктор по умолчанию

    public Person(int age, String name){
        this.age = age;
        this.name = name;
    }

    @Override //Аннотация. Она не обязательна
    public String toString(){
        return "Person {name='" + name + '\'' + ", age=" + age + "}";
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    } 
    //ИНКАПСУЛЯЦИЯ getter, setter

    public static void main(String[] args) {
        Person some = new Person();
        Person men = new Person(23, "Vlad");

        System.out.println(men.age);
        System.out.println(men.name);
        System.out.println(some.age);
        System.out.println(some.name);

        System.out.println(men);

    }
}   
