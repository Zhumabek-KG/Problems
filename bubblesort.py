l = [int(i) for i in input().split()]
for i in range(len(l)):
    for j in range(len(l)):
        if l[i] < l[j]:
            s = l[j]
            l[j] = l[i]
            l[i] = s
print(l)
