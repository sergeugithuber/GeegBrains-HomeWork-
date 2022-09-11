// Задача 38: Задайте массив вещественных чисел. Найдите разницу между максимальным и минимальным элементов массива.
// [3 7 22 2 78] -> 76
//Console.Clear();

void FillAndFindRange()
{
   int[] array = new int[10]; //кол-во элементов массива
   for (int i = 0; i < array.Length; i++)
   {
      Console.Write($"{array[i] = new Random().Next(-9, 20)} ");
   }
   int MinNum = array[0]; int MaxNum = array[0];
   for (int i = 0; i < array.Length; i++)
   {
      if (MaxNum < array[i])
      {
         MaxNum = array[i];
      }
      if (MinNum > array[i])
      {
         MinNum = array[i];
      }
   }
   int range = MaxNum - MinNum;
   Console.WriteLine($"(min = {MinNum} max = {MaxNum})");
   Console.WriteLine($"Range = {range}");
}
FillAndFindRange();






