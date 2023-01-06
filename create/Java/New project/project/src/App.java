import java.util.ArrayDeque;

public class App {
    public static void main(String[] args) throws Exception {
        String path = "////home//self//..///sda/";
        System.out.println(simplifyPath(path));
    }
    
    static String simplifyPath(String path){
        if (path == null) return "";
        ArrayDeque<String> stack = new ArrayDeque<>();
        StringBuilder temp = new StringBuilder();
        boolean check = false;

        for (int i = 0; i < path.length(); i++) {

            //Включаем запись
            if(path.charAt(i) == '/' && check == false){
                check = true;
                temp.append(path.charAt(i)); 
            }

            //Проход по символам
            if(path.charAt(i) == '/' && temp.length() == 1) {
                continue;
            } else if (path.charAt(i) == '/' && temp.length() > 1){
                check = false;
            } else temp.append(path.charAt(i));

            //Заполнение стека
            if ((path.charAt(i) == '/' || 
                i == path.length() - 1 || 
                path.charAt(i) != '/') && 
                check == false){    

                String check_str = temp.toString();
                if (check_str.equals("/.")) continue;
                else if (check_str.equals("/..")) stack.pop();
                else stack.push(check_str);
                temp = new StringBuilder();
            }
        }
        StringBuilder res = new StringBuilder();
        while (!stack.isEmpty()){
            res.append(stack.pollLast());
        }
        return res.toString();
    }
    public static boolean NullCheck(Object x){
        if (x == null) return true;
        else return false;
    }
}
