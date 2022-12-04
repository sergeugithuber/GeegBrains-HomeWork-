# class Car:
#    def __init__(self, color, year, max_speed):
#       self.color = color
#       self.year = year
#       self.max_speed = max_speed

#    def __add__(self, other):
#          return Car("", 2000, self.max_speed + other.max_speed)

# bmw = Car("black", 2018, 250)
# audi = Car("yellow", 2016, 240)
# moskvich = Car("green", 1989, 500)
# print((bmw + audi + moskvich).max_speed)

# class Car:
#     def __init__(self, color, year, max_speed):
#         self.color = color
#         self.year = year
#         self.max_speed = max_speed

#     def __add__(self, other):
#         return self.max_speed + other.max_speed

#     def __radd__(self, other):
#         return self.max_speed + other


# bmw = Car('black', 2019, 250)
# audi = Car('black', 2019, 250)
# moskvich = Car('black', 2019, 250)
# volvo = Car('black', 2019, 250)
# print(bmw + volvo + audi)

class FoodInfo:
   def __init__(self, proteins, fats, carbohydrates):
      self.proteins = proteins
      self.fats = fats
      self.carbohydrates = carbohydrates
   
   def get_proteins(self):
      return self.proteins
   def get_fats(self):
      return self.fats
   def get_carbohydrates(self):
      return self.carbohydrates
   
   def __add__(self, other):
      return FoodInfo(
         self.proteins + other.proteins,
         self.fats + other.fats,
         self.carbohydrates + other.carbohydrates
      )

food1 = FoodInfo(1, 2, 3)
food2 = FoodInfo(10, 20, 30)
food3 = food1 + food2
prin
print(food3.get_proteins())
import sympy
