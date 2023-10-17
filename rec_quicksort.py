l = [7,6,4,3432,23,2,1]
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

    return quicksort(left) + quicksort(middle) + quicksort(right)

l = quicksort(l)
print(l)
