# from array import array


# def Proverka(a, b):
#    if a**2 == b or b**2 == a:
#       return "yes"
#    else:
#       return "no"
# a = int(input("1 число = "))
# b = int(input('2 число = '))
# print(Proverka(a, b))

# from macpath import split


# array = [10, 2, 4, 55, 31]
# def Find(array):
#    max = 0
#    for i in array:
#       if i > max:
#          max = i
#    return max
# print(Find(array))
# ben = list(map(int, input(), split()))

# N = int(input("Введите число: "))
# reN = -N
# while reN <= N:
#    print(reN, end= " ")
#    reN += 1

# number = input('Введите дробь: ')
# print(number[2])

# duration = int(input("Введите кол-во времени в секундах: "))
# m = duration // 60
# duration %= 60
# h = m // 60
# m %= 60
# d = h // 24
# h %= 24
# print(d, "day")
# print(h, "hour")
# print(m, "min")
# print(duration, "sec")

# from datetime import datetime 
# now = datetime.now() 
# current_time = now.strftime("%H:%M:%S") 
# print("Current Time =", current_time)

# создание несуществующего файла
# from fileinput import close


# countries = ['Russia', 'USA', 'China', 'France']
# data = open('file.txt', 'w')
# data.writelines(countries)
# data.write("\nHello There")
# data.close()




# with open('file.txt', 'w') as data:
#    data.writelines(countries)
#    data.write('\nCLOSE')

# path = 'file.txt'
# data = open('file.txt', 'r')
# for i in data:
#    print(i)
# data.close

import Job
print(Job.f('a'))