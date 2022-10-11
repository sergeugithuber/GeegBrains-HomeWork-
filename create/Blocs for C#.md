Console.Write("Введите кол-во строк: "); int m = Convert.ToInt32(Console.ReadLine());
Console.Write("Введите кол-во столбцов: "); int n = Convert.ToInt32(Console.ReadLine());
int[,] matrix = new int[m, n];
FillArray(matrix);

void FillArray(int[,] matrix) // Заполнение массива случ. числами
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