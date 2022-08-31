Console.Write("Введите число: ");
int N = int.Parse (Console.ReadLine());
int count = 0;
int num = 1;
while (count < N)
{
   Console.Write(num * num * num);
   Console.Write(" ");
   num++;
   count++;
}