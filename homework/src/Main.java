package src;

public class Main {
    public static void main(String[] args) throws Exception {
        int[] array = {2, 8, 2, 3, 5};

        System.out.println(Task1.countOfEvenNumbers(array));

        System.out.println(Task2.rasnostMaxAndMinInArray(array));

        int[] newArray = {0, 0, 1, 67};
        System.out.println(Task3.zeroNeughbors(newArray));
    }
}
