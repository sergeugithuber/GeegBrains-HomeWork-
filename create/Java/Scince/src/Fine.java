package create.Java.Scince.src;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

public class Fine {
    public static void main(String[] args) {
        System.out.println(simplifyPath("/home/stack/kok/../"));
    }

    // static List<Integer> preorderTraversal(TreeNode root){
    //     ArrayList<Integer> ans = new ArrayList<>();

    //     if (root == null) return ans;
    //     ArrayDeque<TreeNode> stack = new ArrayDeque<>();
    //     stack.push(root);

    //     while (!stack.isEmpty()){
    //         TreeNode cur = stack.pop(); // pop - удаление верхней части стека; push - добавляет в верхнюю часть стека
    //         ans.add(cur.val);
    //         if (root.right)
    //     }
    // }


    // public boolean isValid(String s){
    //     if (s.length() == 0) return false;
    //     ArrayDeque<Character> stack = new ArrayDeque<>(); // CHARACTER - один символ, мы создали масиив содержащий одноимённые символы
    // List<Character> adf = List.of('{');
    //     for (int i = 0; i < s.length(); i++) {
    //         char curChar = s.charAt(i);
    //         if(curChar == '(' || curChar == '[' || curChar == '{'){
    //             stack.push(curChar);
    //         }
    //         if(curChar == ')' && stack.peek() == '(' ||
    //                 curChar == ']' && stack.peek() == '[' ||
    //                 curChar == '}' && stack.peek() == '{'){
    //                     stack.pop();
    //                 } else {
    //                     return false;
    //                 }
            
    //     }
    //     return stack.isEmpty();
    // }



    // static String simplifyPath(String path){
    //     if (path == "") return "";
    //     ArrayDeque<String> stack = new ArrayDeque<>();
    //     StringBuilder temp = new StringBuilder();
    //     boolean check = false;

    //     for (int i = 0; i < path.length(); i++) {
    //         if (path.charAt(i) == '/'){
    //             check = true; //Создаём проверку на запись
    //             temp.append(path.charAt(i));
    //         }
    //         if (check){

    //             if (path.charAt(i + 1) == '/' && path.charAt(i) != '/' || i == path.length()){
    //                 if (temp.toString() == "/."){
    //                     continue;
    //                 } else if (temp.toString() == "/..") stack.pop();
    //                 else {stack.push(temp.toString());
    //                 check = false;} 

    //             } else if (path.charAt(i + 1) == '/'){ // делаем проверку на множество >////<
    //                 int j = i;
    //                 while (path.charAt(j + 1) != '/') j++; 
    //                 //В этой части ожидается что встретится такая строка,
    //                 //которая содержит неопр. кол-во "/"
    //                 i = j;
    //                 continue;
    //             } else {
    //                 temp.append(path.charAt(i));
    //             }
    //         }
    //     }
    //     return stack.toString();
    // }
    static String simplifyPath(String path){
        if (path == null) return "";
        ArrayDeque<String> stack = new ArrayDeque<>();
        StringBuilder temp = new StringBuilder();
        boolean check = false;

        for (int i = 0; i < path.length(); i++) {
            
            //Включаем запись
            if(path.charAt(i) == '/' && check == false);
                check = true;
                temp.append(path.charAt(i));

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
            }
        }
        return stack.toString();
    }

}