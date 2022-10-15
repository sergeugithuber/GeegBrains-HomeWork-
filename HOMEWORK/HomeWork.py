# # Напишите программу, которая принимает на вход 
# число N и выдает набор произведений чисел от 1 до N.
# Пример:
# - пусть N = 4, тогда [ 1, 2, 6, 24 ] (1, 1*2, 1*2*3, 1*2*3*4)
##################################################################
# n = int(input("Ввод: "))
# def f(n):
#    result = 1
#    for i in range(1, n+1):
#       result *= i
#    return result
# print(f(n))

# ДОП. задача на алгоритмы с реальных собеседований
# Даны два массива:
# [1, 2, 3, 2, 0] и [5, 1, 2, 7, 3, 2]
# Надо вернуть их пересечение
# [1, 2, 2, 3]
###################################
# array1 = [1, 2, 3, 2, 0]
# array2 = [5, 1, 2, 7, 3, 2]
# ArrayFinal = []
# for i in array1:
#    for j in array2:
#       if i == j:
#          ArrayFinal.append(i)
#          array2.remove(j)
# print(ArrayFinal)

# Напишите программу, которая принимает на вход
# вещественное число и показывает сумму его цифр.
# Пример:
# - 6782 -> 23
# - 0,56 -> 11
###########################
# n = input()
# sum = 0
# for i in n:
#    if i.isdigit():
#       sum += int(i)
# print(sum)

# Задайте список из n чисел последовательности 
# $(1+\frac 1 n)^n$ и выведите на экран их сумму.
# Пример:
# - Для n = 6: {1: 4, 2: 7, 3: 10, 4: 13, 5: 16, 6: 19}
########################################################
# n = int(input("Ввод: "))
# list = []
# for i in range(1, n + 1):
#    list.append(((1 + 1 / i) ** i))
# print(sum(list))

# Реализуйте алгоритм перемешивания списка.
##########################################
import random
list = [1, 7, 3, 9, 10, 228]
random.shuffle(list)
print(list)