package classes;

public class Worker implements Comparable<Worker>{
    public String zeroName; //Имя
    public String firstName; //Фамилия
    public String secondName; //Отечество
    public int age;             //Возраст
    public String numberOfPhone; //номер телефона
    public String status;       //Должность (менеджер, секретарь)
    public int salary;

    public Worker(String zeroName, String firstName, String secondName, int age, String numberOfPhone, String status, int salary){
        this.zeroName = zeroName;
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.numberOfPhone = numberOfPhone;
        this.status = status;
        this.salary = salary;
    }

    public void upSalary(int count){
        salary += count;
    }

    public int getAge(){
        return this.age;
    }

    private int getSalary(){
        return this.salary;
    }

    @Override
    public int compareTo(Worker o) {
        return this.getSalary() - o.getSalary();
        // throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    }

    @Override
    public String toString(){
        return "Имя: " + zeroName + " Фамилия: " + firstName + " Отечество: " + secondName + "Возраст: " + age +  " номер телефона: " + numberOfPhone + " Должность: " + status + " Зарплата: " + salary + "\n";
    }
}
