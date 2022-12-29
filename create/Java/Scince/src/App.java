public class App {
    public static void main(String[] args) throws Exception {
        int i = 0;
        while (i != 20){
            if (i % 2 == 0){
                continue;
            }
            System.out.println(i);
            i++;
        }
        System.out.println("Hello, World!");
        
    }
}
