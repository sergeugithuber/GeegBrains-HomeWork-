// Console.Write("Введите целое число, которое хотите возести в квадрат: ");
// int num1 = Convert.ToInt32(Console.ReadLine());
// if (num1 == 0)
// {
//    Console.WriteLine("НОЛЬ ЗАПРЕЩЁН!");
// }
// else
// {
//    int num2 = num1 * num1;
//    Console.WriteLine("Квадрат = " + num2);
// }
// //Console.WriteLine($"Квадрат {num1} = {num2}");

// Console.Write("Введите 1 число: ");
// int num1 = Convert.ToInt32(Console.ReadLine());
// Console.Write("Введите 2 число: ");
// int num2 = Convert.ToInt32(Console.ReadLine());
// if (num1 * num1 == num2)
//    {
//       Console.WriteLine("1 число являеться квадратом 2");
//    }
// else if(num2 * num2 == num1)
//    {
//    Console.WriteLine("2 число являеться квадратом 1");
// }
// else
//    {
//       Console.WriteLine("1 число НЕ являеться квадратом 2");
//    }


// Console.Write("Введите число: ");
// int num = Convert.ToInt32(Console.ReadLine());
// int dinum = num * -1;
// while(dinum <= num);
//    {
//    Console.Write($"{dinum}, ");
//    dinum++;
//    }

////////////////////////////////////////////////////////////////////////

// string num_str = Console.ReadLine();
// int len = num_str.Length;
// int num = Convert.ToInt32(num_str);
// Console.WriteLine(num);

/////////////////////////////////////////////////////////////////////

// string torpedo()
// {
//    Console.Write("Введите кординату точки X: ");
//    int x = int.Parse(Console.ReadLine());
//    Console.Write("Введите кординату точки Y: ");
//    int y = int.Parse(Console.ReadLine());
//    int result;
//    if (x > 0 && y > 0) result = 1;
//    else if (x > 0 && y < 0) result = 2;
//    else if (x < 0 && y < 0) result = 3;
//    else if (x < 0 && y > 0) result = 4;
//    else result = 0;

//    if (result != 0) return $"{result} четверть";
//    else return "Ошибка";
// }
// try
// {
//    Console.WriteLine(torpedo());
// }
// catch
// {
//    Console.WriteLine("надо вводить целые числа");
// }



// string FindDistance()
// {
//    Console.Write("Введите кординату 1 точки X: ");
//    int x1 = Convert.ToInt32(Console.ReadLine());
//    Console.Write("Введите кординату 1 точки Y: ");
//    int y1 = Convert.ToInt32(Console.ReadLine());
//    Console.Write("Введите кординату 2 точки X: ");
//    int x2 = Convert.ToInt32(Console.ReadLine());
//    Console.Write("Введите кординату 2 точки Y: ");
//    int y2 = Convert.ToInt32(Console.ReadLine());

//    double distance = Math.Sqrt(Math.Pow(x2 - x1, 2) + Math.Pow(y2 - y1, 2));
//    return $"расстояние равно {distance}";
// }
// Console.WriteLine(FindDistance());

//////////////////////////////////////////////////

// int[] array = { 1, 75, 89, 42, 9, 13 };
// for (int i = 0; i < array.Length; i++)
// {
//    Console.Write(array[i]);
// }

///////////////////////////////////////////

// Console.Write("Введите число: ");
// int count = Convert.ToInt32(Console.ReadLine());
// int result = 0;
// for (int i = 1; i < count; i++)
// {
//    result = result + 1;
//    Console.Write($"{result}, ");
// }

////////////////////////////////////////////////////

// int[] bla()
// {
//    Console.Write("Введите count: ");
//    int count = Convert.ToInt32(Console.ReadLine());
//    int[] array = new int[count];
//    for (int i = 0; i < array.Length; i++)
//    {
//       Console.Write($"{array[i] = new Random().Next(0, 100)}, ");
//    }
//    return array;
// }
// int[] array = bla();
// int MaxNum = array[0];
// int MaxInd = 0;
// for (int i = 1; i < array.Length; i++)
// {
//    if (array[i] > MaxNum) MaxNum = array[i]; MaxInd = i;
// }
// Console.Write($"{MaxNum} ===");
// Console.WriteLine($" [{MaxInd}]");
//////////////////////////////////////////////////

// Console.WriteLine("ВВедите число");
// int x = Convert.ToInt32(Console.ReadLine());
// int i=0;
// int z=0;
// while (x!=0) 
// {
//     i = (i*10)+(x%2);
//     if (i==0)
//     {
//         z ++;
//     }
//     x = x/2;
// }
// x = i;
// i = 0;
// while (x >0)
// {
//     i = (i*10) + (x%10);
//     x = x/10;
// }

// while (z !=0 )
// {
//     i = i * 10;
//     z--;
// }
// Console.WriteLine($"{i}");

///////////////////////////////////////////////
// int[] FillArray (int count)
// {
//    int[] array = new int[count];
//    for (int i = 0; i < array.Length; i++)
//    {
//       array[i] = new Random().Next(-9, 10);
//       if (i != array.Length - 1) Console.Write($"{array[i]}, ");
//       else Console.Write($"{array[i]}");
//    }
//    return array;
// }
// int[] ReverseArray(int[] array)
// {
//    Console.WriteLine("");
//    for (int i = 0; i < array.Length; i++)
//    {
//       array[i] = -array[i];
//       Console.Write($"{array[i]}, "); 
//    }
//    return array;
// }
// try
// {
//    Console.Write("Введите количество: ");
//    int count = Convert.ToInt32(Console.ReadLine());
//    int[] mas = FillArray(count);
//    ReverseArray(mas);
// }
// catch
// {
//    Console.WriteLine("ERROR");
// }

///////////////////////////////////////////////////////////////////

// int[] FillArray ()
// {
//    int[] array = new int[20];
//    Console.Write("[");
//    for (int i = 0; i < array.Length; i++)
//    {
//       array[i] = new Random().Next(-50, 100);
//       if (i != array.Length - 1) Console.Write($" {array[i]} ");
//       else Console.Write($"{array[i]} ]");
//    }
//    return array;
// }
// int FindNumInRange(int[] array)
// {
//    int count = 0;
//    foreach (int item in array)
//    {
//       if (10 <= item && item <= 99) count++;
//    }
//    return count;
// }
// int[] mas = FillArray();
// Console.WriteLine("");
// Console.WriteLine($"Кол-во = {FindNumInRange(mas)}");

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


// int[] array = new int[3]; int n = 1;
// for (int i = 0; i < array.Length; i++)
// {
//    Console.Write($"Введите {n}e число: "); array[i] = Convert.ToInt32(Console.ReadLine()); n++;

// }
// int max = array[0]; int sum = array[0];
// for (int i = 1; i < array.Length; i++)
// {
//    if (max < array[i]) max = array[i];
//    else sum = sum + array[i];
// }
// if (max < sum) Console.WriteLine("Треугольник СУЩЕСТВУЕТ.");
// else Console.WriteLine("Треугольник НЕ СУЩЕСТВУЕТ");

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

// void FillArray(int[,] matrix)
// {
//    for (int i = 0; i < matrix.GetLength(0); i++)
//    {
//       for (int j = 0; j < matrix.GetLength(1); j++)
//       {
//          matrix[i, j] = new Random().Next(1, 10);
//          Console.Write($"{matrix[i, j]} ");
//       }
//       Console.WriteLine();
//    }
// }
// int a = Convert.ToInt32(Console.ReadLine());
// int b = Convert.ToInt32(Console.ReadLine());
// int[,] MTA = new int[a, b];
// FillArray(MTA);

////////////////////////////////////////////////////////////////////////////////////

// int[,] FillArray (int m, int n)
//             {
//                 int[,] array = new int[m,n];
//                 for (int i=0;i<m;i++)
//                     {
//                         for (int j=0;j<n;j++)
//                             array[i,j] = new Random().Next(1,100);
//                     }
//                 return array;
//             }
//         Console.Write ("Введите количество строк двумерного массива ");
//         int m = Convert.ToInt32 (Console.ReadLine());
//         Console.Write ("Введите количество стобцов двумерного массива ");
//         int n = Convert.ToInt32 (Console.ReadLine());       
//         int[,] mas = FillArray(m,n);

// void PrintArray(int[,] table)
//             {
//             for (int i = 0; i < table.GetLength(0); i++)
//                 {
//                     for (int j = 0; j < table.GetLength(1); j++)
//                         {
//                             Console.Write(table[i,j] + "\t" );
//                         }
//                     Console.WriteLine();
//                 }
//             }
// int[,] FillArray (int m, int n)
//             {
//                 int[,] array = new int[m,n];
//                 for (int i=0;i<m;i++)
//                     {
//                         for (int j=0;j<n;j++)
//                             array[i,j] = new Random().Next(1,100);
//                     }
//                 return array;
//             }
//         Console.Write ("Введите количество строк двумерного массива ");
//         int m = Convert.ToInt32 (Console.ReadLine());
//         Console.Write ("Введите количество стобцов двумерного массива ");
//         int n = Convert.ToInt32 (Console.ReadLine());       
//         int[,] mas = FillArray(m,n);
//         PrintArray(mas);
// int[] mas2=new int[10];
// for (int z=0; z<10;z++)
// {
//     int count=0;
//     for (int i=0; i<m;i++)
//     {
//         for (int j=0; j<n; j++)
//         {
//             if (mas[i,j]==z) count++;
//         }
//     }
//   mas2[z]=count;
// }
// for (int i=0; i<10; i++)
// {
//     if (mas2[i]!=0) Console.WriteLine($"{i} встречается {mas2[i]} раз(а) ");

// }
// int[] mas3=new int[10];
//     for (int i=0; i<m;i++)
//     {
//         for (int j=0; j<n; j++)
//         {
//             mas2[mas[i,j]]++;
//         }
//     }

// for (int i=0; i<10; i++)
// {
//     if (mas2[i]!=0) Console.WriteLine($"{i} встречается {mas2[i]} раз(а) ");

// }
// Console.Write("Введите кол-во столбцов: ");
// int m = Convert.ToInt32(Console.ReadLine());
// Console.Write("Введите кол-во чисел в строке: ");
// int n = Convert.ToInt32(Console.ReadLine());
// int[,] mat = new int[m, n];
// for (int i = 0; i < mat.GetLength(0); i++)
// {
//     for (int j = 0; j < mat.GetLength(1); j++) 
//     {
//       mat[i, j] = new Random().Next(0, 100);
//       if (mat[i,j] > 9) Console.Write($"{mat[i, j]} ");
//       else Console.Write($"<{mat[i, j]}> ");
//    }
//    Console.WriteLine();
// }

// int[,] mat = new int[4, 4];
// int num = 1;
// for (int i = 0; i < mat.GetLength(0); i++)
// {
//     if (i == 3)
//     for (int j = 0; j < mat.GetLength(1); j++) 
//     {
//       mat[i, j] = num++;
//       Console.Write($" {mat[i, j]} ");

//    }
//     Console.WriteLine();
// }

// int a = Convert.ToInt32(Console.ReadLine());
// while (a >= 0)
//    {
//    Console.WriteLine($"{a} - 7");
//    a = a - 7;
//    }

int[,,] m = new int[3, 3, 3];
        int sum = 0;
        int n = 1;

        for (int x = 0; x < 3; x++)
            for (int y = 0; y < 3; y++)
                for (int z = 0; z < 3; z++)
                    m[x, y, z] = n++;

        sum = m[0, 0, 0] + m[1, 1, 1] + m[2, 2, 2];

        Console.WriteLine("Sum of first diagonal: " + sum);

        Console.ReadLine();
