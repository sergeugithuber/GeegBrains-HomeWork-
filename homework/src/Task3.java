package src;

public class Task3 {
    
    public static boolean zeroNeughbors(int[] array){
        if (array.length == 0 || array.length == 1){
            return false;
        }

        for (int i = 1; i < array.length; i++) {
            if (array[i-1] == array[i]){
                return true;
            }
        }

        return false;
    }
}
