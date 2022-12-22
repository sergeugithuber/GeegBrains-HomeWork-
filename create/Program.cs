// int[] array1 = new int[10];
// int[] array2 = new int[10];
// int[] sum = new int[10];
// for (int i = 0; i < array1.Length; i++)
// {
//    array1[i] = new Random().Next(0, 10);
//    Console.Write($"{array1[i]} ");
// }
// Console.WriteLine();
// for (int i = 0; i < array2.Length; i++)
// {
//    array2[i] = new Random().Next(0, 10);
//    Console.Write($"{array2[i]} ");
// }
// Console.WriteLine();
// for (int i = 0; i < sum.Length; i++)
// {
//     sum[i] = array1[i] - array2[i];
//     if (sum[i] < 0) sum[i] = sum[i] * -1;
//    Console.Write($"{sum[i]} ");
// }
// double a = 1223131;
// Console.WriteLine(a);
// Console.WriteLine ("Our result is {0:0.0000} ",a);

////////////////////////////////////////////////////////////////////////////////////

// // Задача 47. Задайте двумерный массив размером m×n,
// // заполненный случайными вещественными числами.
// // m = 3, n = 4.
// // 0,5 7 -2 -0,2
// // 1 -3,3 8 -9,9
// // 8 7,8 -7,1 9

// Console.Write("Введите кол-во строк: "); int m = Convert.ToInt32(Console.ReadLine());
// Console.Write("Введите кол-во столбцов: "); int n = Convert.ToInt32(Console.ReadLine());
// double[,] matrix = new double[m, n];
// FillArray(matrix);

// void FillArray(double[,] matrix)
// {
//    for (int i = 0; i < matrix.GetLength(0); i++)
//    {
//       Console.WriteLine();
//       for (int j = 0; j < matrix.GetLength(1); j++)
//       {
//          matrix[i, j] = Convert.ToDouble(new Random().Next(-100, 100)) / 10;

//          Console.Write($"{matrix[i, j]} ");
//       }
//    }
// }

////////////////////////////////////////////////////////////////////////////////////////////////

// // Задача 50. Напишите программу, которая на вход принимает позиции элемента в двумерном массиве, и возвращает 
// // значение этого элемента или же указание, что такого элемента нет.
// // Во вводе первая цифра - номер строки, вторая - столбца. Цифры не больше 9.
// // Например, задан массив:
// // 1 4 7 2
// // 5 9 2 3
// // 8 4 2 4
// // 17 -> такого числа в массиве нет
// Console.Clear();
// int x = ReadInt("Введите индекс строки: ");
// int y = ReadInt("Введите индекс столбца: ");
// int[,] num = new int[5, 6];
// FillArray(num);

// if (x < num.GetLength(0) && y < num.GetLength(1)) Console.WriteLine(num[x, y]);
// else Console.WriteLine($"{x};{y} -> такого числа в массиве нет");
// void FillArray(int[,] array) // Заполнение массива
// {
//     for (int i = 0; i < array.GetLength(0); i++)
//     {
//         for (int j = 0; j < array.GetLength(1); j++)
//         {
//             array[i, j] = new Random().Next(1, 10);
//             Console.Write(array[i, j] + " ");
//         }
//       Console.WriteLine();
//    }
// }
// int ReadInt(string message) // Ввод
// {
//     Console.Write(message);
//     return Convert.ToInt32(Console.ReadLine());
// }

//////////////////////////////////////////////////////////////////////////////////////////

// Задача 52. Задайте двумерный массив из целых чисел. Найдите среднее арифметическое элементов в каждом столбце.

// Например, задан массив:
// 1 4 7 2
// 5 9 2 3
// 8 4 2 4
// Среднее арифметическое каждого столбца: 4,6; 5,6; 3,6; 3

// Console.Write("Введите кол-во строк: "); int m = Convert.ToInt32(Console.ReadLine());
// Console.Write("Введите кол-во столбцов: "); int n = Convert.ToInt32(Console.ReadLine());
// int[,] matrix = new int[m, n];
// FillArray(matrix);

// void FillArray(int[,] matrix)
// {
//    for (int i = 0; i < matrix.GetLength(0); i++)
//    {
//       for (int j = 0; j < matrix.GetLength(1); j++)
//       {
//          matrix[i, j] = new Random().Next(0, 10);

//          Console.Write($"{matrix[i, j]} ");
//       }
//       Console.WriteLine();
//    }
// }
// Console.WriteLine();
// int sum = 0;
// for (int i = 0; i < matrix.GetLength(0); i++)
// {
//    for (int j = 0; j < matrix.GetLength(1); j++)
//    {
//       sum = sum + matrix[i, j];
//       if (j == matrix.GetLength(0))
//       {
//          double sqrt = Convert.ToDouble(sum) / matrix.GetLength(1);
//          Console.WriteLine($"Среднее значение {i + 1} столбца = {sqrt:F3}");
//          sum = 0;
//       }
//    }
// }

// Console.WriteLine("Всё окей!");