// Задача 52. Задайте двумерный массив из целых чисел. Найдите среднее арифметическое элементов в каждом столбце.

// Например, задан массив:
// 1 4 7 2
// 5 9 2 3
// 8 4 2 4
// Среднее арифметическое каждого столбца: 4,6; 5,6; 3,6; 3

Console.Write("Введите кол-во строк: "); int m = Convert.ToInt32(Console.ReadLine());
Console.Write("Введите кол-во столбцов: "); int n = Convert.ToInt32(Console.ReadLine());
int[,] matrix = new int[m, n];
FillArray(matrix);

void FillArray(int[,] matrix)
{
   for (int i = 0; i < matrix.GetLength(0); i++)
   {
      for (int j = 0; j < matrix.GetLength(1); j++)
      {
         matrix[i, j] = new Random().Next(0, 10);

         Console.Write($"{matrix[i, j]} ");
      }
      Console.WriteLine();
   }
}
Console.WriteLine();
int sum = 0;
for (int i = 0; i < matrix.GetLength(0); i++)
{
   for (int j = 0; j < matrix.GetLength(1); j++)
   {
      sum = sum + matrix[i, j];
      if (j == matrix.GetLength(0))
      {
         double sqrt = Convert.ToDouble(sum) / matrix.GetLength(1);
         Console.WriteLine($"Среднее значение {i + 1} столбца = {sqrt:F3}");
         sum = 0;
      }
   }
}







