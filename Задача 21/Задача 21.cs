Console.Write("Введите кординату x A: ");
double xa = double.Parse (Console.ReadLine());
Console.Write("Введите кординату y A: ");
double ya = double.Parse (Console.ReadLine());
Console.Write("Введите кординату z A: ");
double za = double.Parse (Console.ReadLine());
Console.Write("Введите кординату x B: ");
double xb = double.Parse (Console.ReadLine());
Console.Write("Введите кординату y B: ");
double yb = double.Parse (Console.ReadLine());
Console.Write("Введите кординату z B: ");
double zb = double.Parse (Console.ReadLine());

double result = Math.Sqrt(Math.Pow((xa-xb), 2) + 
 Math.Pow((ya-yb), 2) + 
 Math.Pow((za-zb), 2));

Console.WriteLine($"Расстояние: {result}");