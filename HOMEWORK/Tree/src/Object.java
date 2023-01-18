public class Object {
   private String structure;

   public Object() {
   }

   public Object(String strct) {
      this.structure = strct;
   }

   public void getInfo() {
      System.out.println("Structure = " + this.structure);
   }
}
