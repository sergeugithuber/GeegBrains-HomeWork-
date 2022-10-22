// void RandNum()
// {
//    int x = new Random().Next(10, 100);
//    Console.WriteLine($"Random number = {x}");
//    int x1 = x / 10;
//    int x2 = x % 10;
//    if (x1 > x2)
//    {
//       Console.WriteLine(x1);
//    }
//    else
//    {
//       Console.WriteLine(x2);
//    }
// }
// RandNum();

// string Rund300(int y)
// {
//    // int y = new Random().Next(100, 999);
//    // Console.WriteLine(y);
//    int y1 = y / 100;
//    int y2 = y % 10;
//    return $"{y1}{y2}";
// }
// int b = new Random().Next(100, 1000);
// Console.WriteLine($"Згенерировалось число: {b}");
// Console.WriteLine(Rund300(b));

// string Cratn(int a,int b)
// {
//    if (a % b == 0)
//    {
//       return "yes";
//    }
//    else
//    {
//       return "no";
//    }
// }
// Console.Write("Введите 1 число: ");
// int x = Convert.ToInt32(Console.ReadLine());
// Console.Write("Введите 2 число: ");
// int y = Convert.ToInt32(Console.ReadLine());
// Console.WriteLine(Cratn(x, y));

int sum = 0;
for (int i = 1; i < 209; i++)
{
   sum = sum + i * 2;
}
Console.WriteLine(sum);
sum = 43681;
