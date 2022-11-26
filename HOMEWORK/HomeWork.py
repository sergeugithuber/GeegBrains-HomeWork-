# Задание 1 & 2: переводчик чисел
def num_translate(word):
    result = "" #вывод функции
    check = False 
    list = ["O", "T", "F", "S", "E", "N", "Z"]
    dict = {
        "one" : "один",
        "two" : "два",
        "three" : "три",
        "four" : "четыре",
        "five" : "пять",
        "six" : "шесть",
        "seven" : "семь",
        "eight" : "восемь",
        "nine" : "девять",
        "zero" : "ноль"
    }
    if word[0] in list:
        check = True

    word = word.lower() #Обработка исключений

    if word not in dict:
        result = "None"
    else:
        if check:
            result = dict[word].title()
        else:
            result = dict[word]
    return(result)


view_user = str(input("Your number: "))
print(num_translate(view_user))