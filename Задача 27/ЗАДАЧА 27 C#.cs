Console.Write("Введите волшебное число: "); int a = Convert.ToInt32(Console.ReadLine());
int result = 0;
int pereh = 0;
int b = Convert.ToString(a).Length;
for (int i = 0; i < b; i++)
{
   pereh = a - a % 10;
      result = result + (a - pereh);
      a = a / 10;
}
Console.WriteLine(result);

