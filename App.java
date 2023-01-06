import java.util.ArrayDeque;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(simplifyPath("/home/"));
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
            } else temp.append(path.charAt(i));

            //Конец записи
            if (path.charAt(i) == '/'){
                check = false; 
                if (temp.toString() == "/.") continue;
                else if (temp.toString() == "/..") stack.pop();
                else stack.push(temp.toString());
                temp = new StringBuilder();
            }
        }
        StringBuilder res = new StringBuilder();
        while (!stack.isEmpty()){
            res.append(stack.pollLast());
        }
        return res.toString();
    }
}
