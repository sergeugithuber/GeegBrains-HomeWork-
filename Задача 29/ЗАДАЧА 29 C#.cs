int[] FillArray()
{
   int[] array = new int[8];
   Console.Write("[");
   for (int i = 0; i < array.Length; i++)
   {
      if (i < array.Length - 1)Console.Write($"{array[i] = new Random().Next(1, 100)} ");
      else Console.Write($"{array[i]}]");
   }
   return array;
}  
FillArray();














