l = [int(i) for i in input().split()]
for s in range(len(l)):
    min = s
    for i in range(s+1, len(l)):
        if l[i] < l[min]:
            min = i
    
    if l[s] != l[min]:
        l[s], l[min] = l[min], l[s]
print(l)
