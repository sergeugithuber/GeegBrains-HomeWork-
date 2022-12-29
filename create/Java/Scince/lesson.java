package create.Java.Scince;

import java.util.ArrayDeque;
import java.util.LinkedList;

public class lesson {
    int WALL = 1;
    int GATE = 0;
    int EMPTY = Integer.MAX_VALUE;
    public static void main(String[] args) {
        // ArrayDeque<Integer> ad = new ArrayDeque<>(); // Очередь
        // LinkedList<Integer> ll = new LinkedList<>(); // один элемент ссылается на следующий и т.д.
        // // в этих массивах не стоит удалять элементы, т.к. происходит сдвиг,
        // //который снижает производительность
        // ad.add(4);
        // ad.add(3);
        // ad.add(7);
        // System.out.println(ad);
        // ad.poll(); // удаление первого элемента
        // System.out.println(ad);
        // ll.add(4);
        // ll.add(3);
        // ll.add(7);
        // System.out.println(ll);
        // ll.poll(); // удаление первого элемента
        // System.out.println(ll);
        int max = Integer.MAX_VALUE;
        System.out.println(max);
        
    }    
    public void wallsAndGates(int[][] rooms){
        ArrayDeque<int[]> deque = new ArrayDeque<>(); // массив хранящий массивчики
        int[][] steps = {{0, 1}, {1, 0}, {-1, 0}, {0, -1}};

        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                if (rooms[i][j] == GATE){   // глобальные переменные можно использовать только в public
                    deque.add(new int[] {i, j}); //Создание массива на месте
                }
            }
        }
        while (!deque.isEmpty()){
            int[] curPoint = deque.poll();
            int curRow = curPoint[0];
            int curCol = curPoint[1];
            for (int[] step : steps) {
                int newRow = curRow + step[0];
                int newCol = curCol + step[1];
                if (newRow >= 0 && newRow < rooms.length 
                        && newCol >= 0 && newCol < rooms[0].length
                        && rooms[newRow][newCol] == EMPTY){
                            rooms[newRow][newCol] = rooms[curRow][curCol] + 1;
                            deque.add(new int[] {newRow,newCol});
                    }
            }
        }
    }
}
