// Задача 36: Задайте одномерный массив, заполненный случайными числами.
// Найдите сумму элементов, стоящих на нечётных позициях.
// [3, 7, 23, 12] -> 19
// [-4, -6, 89, 6] -> 0
Console.Clear();
int[] FillArray (int min,int max) // min и max служат диапозоном для Random [min, max)
{
   int[] array = new int[10];
   for (int i = 0; i < array.Length; i++)
   {
      array[i] = new Random().Next(min, max); Console.Write($" {array[i]} ");
   }
   return array;
}
int FindSum(int[] array)
{
   int sum = 0;
   foreach (int item in array)
   {
      if (item % 2 == 1) sum = sum + item;
   }
   return sum;
}
Console.WriteLine($"Сумма нечётных = {FindSum(FillArray(0, 10))}");

