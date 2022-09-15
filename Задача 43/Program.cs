// Задача 43. Напишите программу, которая найдёт точку пересечения двух прямых, 
// заданных уравнениями y = k1 * x + b1, y = k2 * x + b2;
// значения b1, k1, b2 и k2 задаются пользователем.
// b1 = 2, k1 = 5, b2 = 4, k2 = 9 -> (-0,5; 5,5)
Console.Clear();
int[] OneLine = new int[2];
int[] TwoLine = new int[2];
int[] Point = new int[2];
for (int i = 0; i < OneLine.Length; i++)
{
   if(i==0) Console.Write($"Введите коэффициент 1k: ");
   else Console.Write($"Введите коэффициент 1b: ");
   OneLine[i] = Convert.ToInt32(Console.ReadLine());
}
for (int i = 0; i < TwoLine.Length; i++)
{
   if(i==0) Console.Write($"Введите коэффициент 2k: ");
   else Console.Write($"Введите коэффициент 2b: ");
   TwoLine[i] = Convert.ToInt32(Console.ReadLine());
}
Point[0] = (TwoLine[1] - OneLine[1]) / (OneLine[0] - TwoLine[0]);
Point[1] = Point[0] * OneLine[0] + OneLine[1];
 if (OneLine[0] == TwoLine[1] && OneLine[1] == TwoLine[1]) 
  {
 Console.Write($"Прямые совпадают");
  }
 else if (OneLine[0] == TwoLine[0] && OneLine[1] != TwoLine[1]) 
  {
 Console.Write($"Прямые параллельны");
  }
 else 
  {
 Console.Write($"Точка пересечения прямых: ({Point[0]}, {Point[1]})");
  }
