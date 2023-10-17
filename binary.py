l = [1,2,3,4,5,6,7,8,9,10,11,12,13,14]
number = int(input())
def binary(l, number):
    if len(l) <= 1 and l[0] == number:
        return True
    elif len(l) <= 1 and l[0] != number:
        return False
    
    mid = len(l) // 2

    if number < l[mid]:
        return binary(l[:mid:], number)
    else:
        return binary(l[mid::], number)
s = binary(l, number)
print(s)
