package src;

public class Task1 {
    
    public static int countOfEvenNumbers(int[] array){
        if (array.length == 0) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] % 2 == 0){
                count += 1;
            }
        }
        return count;
    }
}
