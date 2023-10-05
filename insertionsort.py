l = [int(i) for i in input().split()]
for i in range(len(l)):
    key = l[i]
    j = i - 1
    while j >= 0 and l[j] > key:
        l[j + 1] = l[j]
        j = j - 1
    l[j + 1] = key
print(l)
