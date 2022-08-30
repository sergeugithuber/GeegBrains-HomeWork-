Console.Write("Введите число: ");
string num = Console.ReadLine();
if (num.Length >= 3)
{
   Console.WriteLine(num[2]);
}
else
{
   Console.WriteLine("Третьей цифры нет");
}