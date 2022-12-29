package create.Java.Scince.src;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

public class Fine {
    public static void main(String[] args) {
        int i = 0;
        while (i != 20){
            if (i % 2 == 0){
                continue;
                System.out.println("sfsd");
            }
        }
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

    public static void main(String[] args) {
        
    }
    public boolean isValid(String s){
        if (s.length() == 0) return false;
        ArrayDeque<Character> stack = new ArrayDeque<>(); // CHARACTER - один символ, мы создали масиив содержащий одноимённые символы
    List<Character> adf = List.of('{');
        for (int i = 0; i < s.length(); i++) {
            char curChar = s.charAt(i);
            if(curChar == '(' || curChar == '[' || curChar == '{'){
                stack.push(curChar);
            }
            if(curChar == ')' && stack.peek() == '(' ||
                    curChar == ']' && stack.peek() == '[' ||
                    curChar == '}' && stack.peek() == '{'){
                        stack.pop();
                    } else {
                        return false;
                    }
            
        }
        return stack.isEmpty();
    }
    static String simplifyPath(String path){
        if (path == "") return "";
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        StringBuilder temp = new StringBuilder();
        boolean check = false;

        for (int i = 0; i < path.length(); i++) {
            if (path.charAt(i) == '/'){
                if (path.charAt(i + 1) == '/'){ // делаем проверку на множество >////<
                    int j = i;
                    while (path.charAt(j + 1) != '/') j++; 
                    //В этой части ожидается что встретится такая строка,
                    //которая содержит неопр. кол-во "/"
                    i = j;
                    continue;
                }
                temp.append(path.c); 
 
                check = true;
                temp.append(path.charAt(i));
            }
            
        }
    }
}