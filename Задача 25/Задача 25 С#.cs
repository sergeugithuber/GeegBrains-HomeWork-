int Natural(int a,int  b)
{
   int Stepen = 1;
   for (int i = 0; i < b; i++)
   {
      Stepen = Stepen * a;
   }
   return Stepen;
}
try
{
   Console.Write("Введите число a: "); int a = Convert.ToInt32(Console.ReadLine());
   Console.Write("Введите число b: "); int b = Convert.ToInt32(Console.ReadLine());
   Console.WriteLine(Natural(a, b));
}
catch
{
   Console.WriteLine("ERROOOOR");
}






