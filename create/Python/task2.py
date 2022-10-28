# n = int(input("Ввод N: "))
# m = int(input("Ввод M: "))
# def find_square(a, b):
#    p = ((a // b) * a + (b // a) * b) // (a // b + b // a)
#    q = p  - (a + b - p - 1) // 2 * 2
#    r = 2 - (a + b - p) % 2
#    conclusion = q * r
#    return conclusion
# print(find_square(n, m))

n = int(input("Ввод N: ")) #максимальный размер одной упаковки
m = int(input("Ввод M: ")) #необходимое количество ручек в заказе
p = n
sum = 0
result = []
while m != 0:
   if m < n:
      result.append(m)
      for index in result:
         print(index)
      break
   m -= p
   result.append(p)
   p -= 1
   if p < 0:
      print(0)
      break
# while sum != m:
#    sum += n
#    if m < n:
#       result.append(n)
#       m -= (m % n)
#       for index in len(result):
#          print(i)
#       break
#    n -= 1
#    if n < 0:
#       print(0)
#       break




