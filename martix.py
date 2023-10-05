l = []
a = int(input("Enter the number of rows : "))
b = int(input("Enter the number of columns : "))
print("Enter the elements of matrix : ")
for i in range(a):
    l.append([int(i) for i in input().split()])
for i in range(len(l)):
    for j in range(b):
        print(l[i][j], end = " ")
    print()
