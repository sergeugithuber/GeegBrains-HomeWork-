Console.Write("Введите трёхзначное число:");
string num = Console.ReadLine();

if (num.Length == 3)
{
   Console.WriteLine(num[1]);
}
else
{
   Console.WriteLine("Ваше число не является трёхзначным");
}
