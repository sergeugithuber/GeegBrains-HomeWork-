import People.Human;

public class Wardrobe extends Object{
   private String condition = "Закрыт";

   public Wardrobe() {
   }

   public Wardrobe(String strct) {
      super(strct);
   }

   public void openWardrope(Human p) {
      if (this.condition == "Открыт") {
         System.out.println("Шкаф уже открыт");
      } else {
         this.condition = "Открыт";
         System.out.println(p.getName() + " открыл шкаф");
      }
   }

   public void closeWardrope(Human p) {
      if (this.condition == "Закрыт") {
         System.out.println("Шкаф уже закрыт");
      } else {
         this.condition = "Закрыт";
         System.out.println(p.getName() + " закрыл шкаф");
      }
   }

}
