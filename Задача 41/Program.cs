// Задача 41: Пользователь вводит с клавиатуры M чисел.
//  Посчитайте, сколько чисел больше 0 ввёл пользователь.
// 0, 7, 8, -2, -2 -> 2
// 1, -7, 567, 89, 223-> 3
Console.Clear();
Console.Write("Введите кол-во эл. массива. (рек: до 10) : ");
int M = Convert.ToInt32(Console.ReadLine());
int[] array = new int[M];
for (int i = 0; i < array.Length; i++)
{
   Console.Write($"Введите {i + 1} число: ");
   array[i] = Convert.ToInt32(Console.ReadLine());
}
int count = 0;
foreach (var item in array)
{
   if (item > 0) count++;
}
Console.WriteLine($"Кол-во эл-ов (x > 0) = {count} из {M}");




