public class HomeworkForExeption {
    
    //Реализуйте метод, принимающий в качестве аргументов два 
    //целочисленных массива, и возвращающий 
    //новый массив, каждый элемент которого равен разности элементов 
    //двух входящих массивов в той же ячейке. Если длины массивов 
    //не равны, необходимо как-то оповестить пользователя.
    public static int[] difference(int[] a, int[] b){
        if (a.length == 0 || b.length == 0){
            throw new RuntimeException("Array is empty");
        }
        if (a.length != b.length){
            throw new RuntimeException("length first array is not equls length second array");
        }

        int[] res = new int[a.length];
        for(int i = 0; i < a.length; i++){
            res[i] = a[i] - b[i];
        }
        return res;
    }   

    //Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий 
    //новый массив, каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке. 
    //Если длины массивов не равны, необходимо как-то оповестить пользователя. Важно: При выполнении метода 
    //единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше.
    public static int[] division(int[] a, int[] b){
        if (a.length == 0 || b.length == 0){
            throw new RuntimeException("1array or 2array is empty");
        }
        if (a.length != b.length){
            throw new RuntimeException("length first array is not equls length second array");
        }

        int[] res = new int[a.length];
        for(int i = 0; i < a.length; i++){
            if(b[i] == 0){
                throw new RuntimeException("divider can not be zero");
            }
            res[i] = a[i] / b[i];
        }
        return res;
    }
}
