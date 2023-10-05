l, sum, answer = [int(i) for i in input().split()], int(input()), []
for i in range(len(l)):
    for j in range(len(l)):
        if l[i] + l[j] == sum and i != j and (l[j], l[i]) not in answer:
            answer.append((l[i], l[j]))
print(answer)
