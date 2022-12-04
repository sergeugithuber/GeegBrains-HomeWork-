# Реализуйте классы MinStat, MaxStat, AverageStat, которые будут находить минимум, максимум и среднее арифметическое последовательности целых чисел.
# Экземпляры классов инициализируются без аргументов. Метод add_number должен добавлять в статистику число, 
# которое будет учтено при вычислении финального результата методом result. Для экземпляров MinStat и MaxStat result должен возвращать целое число, 
# для AverageStat — число типа float (это число будет сравниваться с правильным ответом до седьмой значащей цифры).
# Если в последовательности отсутствуют числа и статистические величины вычислить невозможно, метод result должен возвращать None.

class AverageStat:
    list =[]

    def add_number(self, number):
        self.list.append(number)

    def _print_list(self):
        print(self.list)

    def reset(self):
        self.list = []

    def result(self):
        sum = 0 
        for i in self.list:
            sum += i
        return sum / len(self.list)


class MaxStat(AverageStat):
    def result(self):
        list_sort = sorted(self.list)
        return list_sort[-1]


class MinStat(AverageStat):
    def result(self):
        list_sort = sorted(self.list)
        return list_sort[0]

a = AverageStat()
b = MaxStat()
c = MinStat()
a.add_number(3)
a.add_number(-2)
a.add_number(10)
a.add_number(7)
a.add_number(5)
a.add_number(3)
print(b.result())
print(c.result())
print(a.result())