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

# import Job
# print(Job.f('a'))

# n = int(input("Ввод: "))
# with open('file.txt', 'w') as f:
#    f.write(n)

# my_list = [1.1, 1.2, 3.1, 5, 10.01]
# min = 1
# max = 0
# for i in my_list:
#     if (i - int(i)) <= min:
#         min = i - int(i)
#     if (i - int(i)) >= max:
#         max = i - int(i)  
# print(max-min)

# new_list = []
# n = int(input("Ввод: "))
# for i in range(1, n +1):
#     new_list.append(input(f'{i}: '))
# print(new_list)

# a = int(input("1 : "))
# b = int(input("2 :"))
# max = a
# if a > b:
#     max = a
# result = 0
# for i in range(1, max):
#     if a % i == 0 and b % i == 0:
#         result = i
# print(r

# sum = 0
# for i in range(3, 13):
#     sum += i
# print(sum)

# count = 0
# for a in range(1, 100):
#     for b in range(1, 100):
#         for c in range(1, 100):
#             if max(a,b) * max(c, 13) == min(a,c) * min(b, 26):
#                 count += 1
#                 print(a, b, c)
# print(count)
# sum = 0
# for i in range(1, 21):
#     sum =+ (i ** 2)
# sum_exe = sum / 2
# summ = 0
# for i in range(1 , 210):
#     summ =+ (i ** 2)
#     if summ > 21840:
#         print(i)
#         break
##############################################################################
# sum = lambda x, y: x + y
# print(sum, 1, 2)
# def mult(x, y):
#     return x * y
# def calc(op, a, b):
#     print(op(a, b))
# calc(sum, 4, 5)

# list = [i for i in range(1, 21)]
# list = [i for i in range(1, 21) if i % 3 == 0] # С Условием
# list = [(i, i) for i in range(1, 21)] # Кортеджи
# def f(x):
#     return x**2 
# list = [(i, f(i)) for i in range(1, 21)] # Преминение функции
# print(list)

# def select(f, col):
#     return [f(x) for x in col] 
# data = '1 2 4 5 3 6 2 5 3'.split() # На заметку
# res = select(int, data)
# print(res)

# li = [x for x in range(1, 21)]
# li = list(map(lambda x: x % 2, li)) # Как я понял map это работа со списком
# print(li)

# data = list(map(int, input().split()))
# print(data)

# list1 = ["zero?", "two", "three", "four", "five"]
# list2 = [0, 2, 3, 4, 5]
# list3 = ["HDD", "SSD", "SSHD"]
# data = list(zip(list1, list2, list3)) # ZIP условноый кортедж
# print(data)
# data = list(enumerate(list1)) # Нумерация элементов с 0, условный массив (кортедж)
# print(data)


# def RLE():
#    word = str(input("Ввод: "))
#    for i in word:
#       print(word)
# def lol():
#    print("Hello!")

# if __name__ == "__main__": # Работает как независимая программа
#    RLE() 

def calc(x):
   return x**2
def math(f, x):
   print(f(x))

math(calc, 10)