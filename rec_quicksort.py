l = [32, 324 , 2, 234, 0, 234323]
def quicksort(l):
    if len(l) <= 1:
        return l
    
    left = []
    right = []
    middle = []
    dot = l[-1]

    for i in range(len(l)):
        if l[i] < dot:
            left.append(l[i])
        elif l[i] > dot:
            right.append(l[i])
        else:
            middle.append(l[i])

    return quicksort(left) + middle + quicksort(right)

l = quicksort(l)
print(l)