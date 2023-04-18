package People;
import java.util.ArrayList;

public class Man implements Human{
    private String name;
    private String famaly; //Фамилия
    private String position;
    private String relationship;
    private ArrayList<String> children;


    @Override
    public String getName() {
        return this.name;
    }

    public Man(String name, String famaly, String position, String relationship) {
        this.name = name;
        this.famaly = famaly;
        this.position = position;
        this.relationship = relationship;
    }


    @Override
    public void childrenAdd(String... child) {
        for (String ch : child) {
            this.children.add(ch);
        }
    }


    @Override
    public void getInfo() {
        System.out.println(String.format("Name = %s, famaly = %s, position = %s, relationship = %s", name, famaly,
            position, relationship));
    }
}
