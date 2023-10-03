str = "This is just a text. this is for a problem, is good"
subtr = "just"
ans = []
for i in range(len(str)):
    if subtr[0] == str[i]:
        for j in range(1, len(subtr)):
            if subtr[j] == str[i + j]:
                if j == len(subtr) - 1:
                    ans.append(i)
            else:
                break
print(ans)
