# n = int(input("Ввод: "))
# range = [i for i in range(1, n + 1)]
# frog = 1
# insect = n
# print(range)
N = int(input())
M = 1537
n = N - 1
l = -1
r = n
while l < r - 1:
    m = (l + r) // 2
    if n - 5 * m < M:
        r = m
    else:
        l = m
s = r
n -= 5 * s
dist = [0] + [-1] * M
jumps = [3,4,5]
 
q = [0]
while q:
    d = q.pop()
    for i in range(3):
        if d + jumps[i] < M and dist[d + jumps[i]] == -1:
            dist[d + jumps[i]] = dist[d] + 1
            q.append(d + jumps[i])
print(-1 if dist[n] == -1 else s + dist[n])