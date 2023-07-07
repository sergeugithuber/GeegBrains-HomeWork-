package src;

public class Task2 {
    
    public static int rasnostMaxAndMinInArray(int[] array){
        if (array.length == 0){
            return 0;
        }
        
        return findMaxInArray(array) - findMinInArray(array);
    }

    private static int findMaxInArray(int[] array){
        if (array.length == 0){
            return 0;
        }

        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        return max;
    }

    private static int findMinInArray(int[] array){
        if (array.length == 0){
            return 0;
        }

        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        
        return min;
    }
}
