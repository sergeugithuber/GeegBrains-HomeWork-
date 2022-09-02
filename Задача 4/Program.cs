Console.Write("Введите 1 число: ");
int a = Convert.ToInt32(Console.ReadLine());
Console.Write("Введите 2 число: ");
int b = Convert.ToInt32(Console.ReadLine());
Console.Write("Введите 3 число: ");
int c = Convert.ToInt32(Console.ReadLine());
if (a > b && a > c)
{
   Console.WriteLine($"{a} больше {b} и {c}");
}
else if (b > a && b > c)
{
   Console.WriteLine($"{b} больше {a} и {c}");
}
else if (c > a && c > b)
{
   Console.WriteLine($"{c} больше {a} и {b}");
}
else
{
   Console.WriteLine("2 или 3 числа одинаковы");
}