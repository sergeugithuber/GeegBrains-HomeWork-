import time
print("Задание 5:\n\n")  
#Даны цены на товары. Необходимо вывести эти цены с указанием их "ценности".
#То есть рубли и копейки

prices = [57.8, 46.51, 97, 0.05, 49, 129.99, 83.23, 789.82, 802.2, 1000000.00, 81.34]
def print_price(list):
   count = 1 # нужен для просмотра кол-ва товаров
   for i in list:
      safe = "" # Обнуление строки
      for j in str(i):
         if j != '.':
            safe += j
         else:
            safe += " руб. "
      print(f"{count}) {safe} коп.") # вывод полученой строки. Когда весь цикл закончится, получится полноценный вывод
      count += 1
print_price(prices)


time.sleep(3)
# Задание 1:
# Дан список: ['в', '5', 'часов', '17', 'минут', 'температура', 'воздуха', 'была', '+5', 'градусов']
# Необходимо его обработать — обособить каждое целое число 
# (вещественные не трогаем) кавычками (добавить кавычку до и кавычку после 
# элемента списка, являющегося числом) и дополнить нулём до двух целочисленных разрядов:
# ['в', '"', '05', '"', 'часов', '"', '17', '"', 'минут', 'температура', 'воздуха', 'была', '"', '+05', '"', 'градусов']
# Сформировать из обработанного списка строку:
# в "05" часов "17" минут температура воздуха была "+05" градусов
print("Задание 1:\n")
def get_sign(x):
    if x[0] in '+-':
        return x[0]

list = ['в', '5', 'часов', '17', 'минут', 'температура', 'воздуха', 'была', '+5', 'градусов']
i = 0
while i < len(list):
   sign = get_sign(list[i])
   if list[i].isdigit() or (sign and list[i][1:].isdigit()): # проверка на число или знак
      if sign:
         list[i] = sign + list[i][1:].zfill(2) #zfill добавляет 0 перед числом
      else:
         list[i] = list[i].zfill(2)
      list.insert(i, '"')
      list.insert(i + 2, '"')
      i += 2
   i += 1
print(" ".join(list))