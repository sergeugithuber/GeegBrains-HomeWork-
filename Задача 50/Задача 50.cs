// Задача 50. Напишите программу, которая на вход принимает позиции элемента в двумерном массиве, и возвращает 
// значение этого элемента или же указание, что такого элемента нет.
// Во вводе первая цифра - номер строки, вторая - столбца. Цифры не больше 9.
// Например, задан массив:
// 1 4 7 2
// 5 9 2 3
// 8 4 2 4
// 17 -> такого числа в массиве нет
Console.Clear();
int x = ReadInt("Введите индекс строки: ");
int y = ReadInt("Введите индекс столбца: ");
int[,] num = new int[5, 6];
FillArray(num);

if (x < num.GetLength(0) && y < num.GetLength(1)) Console.WriteLine(num[x, y]);
else Console.WriteLine($"{x};{y} -> такого числа в массиве нет");
void FillArray(int[,] array) // Заполнение массива
{
    for (int i = 0; i < array.GetLength(0); i++)
    {
        for (int j = 0; j < array.GetLength(1); j++)
        {
            array[i, j] = new Random().Next(1, 10);
            Console.Write(array[i, j] + " ");
        }
      Console.WriteLine();
   }
}
int ReadInt(string message) // Ввод
{
    Console.Write(message);
    return Convert.ToInt32(Console.ReadLine());
}







