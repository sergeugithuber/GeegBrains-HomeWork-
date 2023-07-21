package classes;

public class Director extends Worker {

    public Director(String zeroName, String firstName, String secondName, int age, String numberOfPhone, String status,
            int salary) {
        super(zeroName, firstName, secondName, age, numberOfPhone, status, salary);
    }

    @Override
    public void upSalary(int count){
        salary += 0;
    }

}
