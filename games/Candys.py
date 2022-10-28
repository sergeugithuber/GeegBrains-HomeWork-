# Создайте программу для игры с конфетами человек против человека.
# Условие задачи: На столе лежит 2021 конфета. 
# Играют два игрока делая ход друг после друга. Первый ход определяется жеребьёвкой. 
# За один ход можно забрать не более чем 28 конфет. Все конфеты оппонента достаются сделавшему последний ход. 
# Сколько конфет нужно взять первому игроку, чтобы забрать все конфеты у своего конкурента?
# a) Добавьте игру против бота
# b) Подумайте как наделить бота ""интеллектом""
#=====================================================
from random import randint

candys = 100
count= 0
player = 1
count1 = 0
count2 = 0
while candys > 0:
   if player == 1:
      take_candy = int(input("Ходит 1 игрок: "))
      if 1 > take_candy or take_candy > 28:
         while take_candy > 0 and take_candy < 29:
            print("Необходимо ввести число от 1 до 29")
            take_candy = int(input("Ходит 1 игрок: "))
      player -= 1
      count1 += 1
      candys -= take_candy
      continue
   if player == 0:
      take_candy = int(input("Ходит 2 игрок: "))
      if 1 > take_candy or take_candy > 28:
         while take_candy > 0 and take_candy < 29:
            print("Необходимо ввести число от 1 до 29")
            take_candy = int(input("Ходит 2 игрок: "))
      player += 1
      count2 += 1
      candys -= take_candy
      continue
   print(f'осталось {candys} конфет')
   print("") #Отступ 
print(count1)
print(count2)

