package Anim;
import People.Human;

public class Cat implements Animal{
   private String name;
   String call;

   String type;
   String category;
   String squad;
   String family;
   String genus;
   String view;

   public Cat() {
   }
   
   public Cat(String name, String call) {
      this.name = name;
      this.call = call;
   }

   public void callFor(Human p) {
      System.out.println("''" +  p.getName() + " зовёт " + name + "''");
      System.out.println("-" + this.call);
      System.out.println(name + " отозвался");
   }

   

   @Override
   public void classification(String type, String category,String squad,
          String family, String genus, String view) {
      this.type = type;
      this.category = category;
      this.squad = squad;
      this.family = family;
      this.genus = genus;
      this.view = view;
   }

   @Override
   public void name(String name) {
      this.name = name;
   }

   
}
