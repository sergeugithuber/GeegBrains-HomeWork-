#Напишите программу, удаляющую из текста все слова, содержащие ""абв"".
#====================================
# text = input("Ввод (через пробел):\n")
# def delete_abc(data):
#    data = data.split()
#    result = ""
#    for i in data:
#       if "абв" not in i:
#          result += i + " "
#    return result
# print(delete_abc(text))
#====================================
# Реализуйте RLE алгоритм: реализуйте модуль сжатия и восстановления данных.
#==============================
def RLE(data):
   count = 1
   result = ''
   prev_char = ''
   if not data: return ''
   for char in data:
      if char != prev_char:
         if prev_char:
            result += f'{count}{prev_char}'
         count = 1
         prev_char = char
      else:
         count += 1
   else:
      result += f'{count}{prev_char}'
      return result
text = input("Input: ")
data_input = RLE(text)
print(f'Conclusion: {data_input}')
