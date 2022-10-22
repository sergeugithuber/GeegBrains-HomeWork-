# with open('file.txt', 'r') as f:
# #    s = f.readline().split(',')
#    print(f)
# # for i in range(len(s) - 1):
# #    if int(s[i] + 1) != int(s[i+1]):
# #       print(int(i+1))

from turtle import begin_fill


s = [1,4,5,2,3,9,8,11,0]
s.sort()
begin = s[0]
end = s[0]
for i, j in enumerate(s):
   print(f'i = {i}')
   print(f'j = {j}')