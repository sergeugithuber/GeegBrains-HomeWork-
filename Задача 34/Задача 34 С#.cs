// Задача 34: Задайте массив заполненный случайными положительными трёхзначными числами. 
// Напишите программу, которая покажет количество чётных чисел в массиве.
// [345, 897, 568, 234] -> 2

Console.Clear();
int[] FillArray (int min,int max)
{
   int[] array = new int[10];
   Console.Write("[");
   for (int i = 0; i < array.Length; i++)
   {
      array[i] = new Random().Next(min, max);
      if (i != array.Length - 1) Console.Write($" {array[i]} ");
      else Console.Write($"{array[i]} ]");
   }
   return array;
}
int FindCount(int[] array)
{
   int count = 0;
   foreach (int item in array)
   {
      if (item % 2 ==0) count++;
   }
   return count;
}
int[] mas = FillArray(100, 1000);
Console.WriteLine("");
Console.WriteLine($"Кол-во = {FindCount(mas)}");