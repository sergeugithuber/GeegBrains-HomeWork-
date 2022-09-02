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


string num_str = Console.ReadLine();
int len = num_str.Length;
int num = Convert.ToInt32(num_str);
Console.WriteLine(num);