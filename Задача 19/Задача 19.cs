string number = Console.ReadLine();

if (number.Length == 5)
{
   if (number[0] == number[4] || number[1] == number[3])
   {
      Console.WriteLine("Это число являеться палиндромом");
   }
   else
   {
      Console.WriteLine("Это число НЕ являеться палиндромом");
   }
}
else
{
   Console.WriteLine("Ваше число не является пятизначным");
}
