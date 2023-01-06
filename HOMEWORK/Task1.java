package HOMEWORK;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class Task1{
   
public static void main(String[] args) throws Exception {
     String path = "////home//self//..//.//sda/sdds/sdf///sdf";
     System.out.println(simplifyPath(path));
   }
    
   static String simplifyPath(String path) {
      if (path == "") return "/";
      
      Deque<String> stack = new LinkedList<>();
      Set<String> skip = new HashSet<>(Arrays.asList("..", ".", ""));
      String result = "";

      for (String dir : path.split("/")) {
         if (dir.equals("..") && !stack.isEmpty()){
            stack.pop();
         } else if (!skip.contains(dir)) {
            stack.push(dir);
         }
      }

      for (String dir : stack) {
         result = "/" + dir + result;
      }

      return result;
   }
}










