int[] array1 = new int[10];
int[] array2 = new int[10];
int[] sum = new int[10];
for (int i = 0; i < array1.Length; i++)
{
   array1[i] = new Random().Next(0, 10);
   Console.Write($"{array1[i]} ");
}
Console.WriteLine();
for (int i = 0; i < array2.Length; i++)
{
   array2[i] = new Random().Next(0, 10);
   Console.Write($"{array2[i]} ");
}
Console.WriteLine();
for (int i = 0; i < sum.Length; i++)
{
    sum[i] = array1[i] - array2[i];
    if (sum[i] < 0) sum[i] = sum[i] * -1;
   Console.Write($"{sum[i]} ");
}
double a = 1223131;
Console.WriteLine(a);
Console.WriteLine ("Our result is {0:0.0000} ",a);
