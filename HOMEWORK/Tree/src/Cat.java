public class Cat extends Animal{
   String name;
   String call;

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
}
