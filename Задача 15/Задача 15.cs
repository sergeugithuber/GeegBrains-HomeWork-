Console.WriteLine("1-Пн, 2-Вт, 3-Ср, 4-Чт, 5-Пт, 6-Сб, 7-Вс");
Console.Write("Введите число от 1 до 7");
int num = Console.ReadLine();
if (num < 6)
{
   Console.WriteLine("Это рабочий день");
}
if (num > 5)
{
   Console.WriteLine("Это выходной день");
}