a = list(map(int, input().rstrip().split()))
b = list(map(int, input().rstrip().split()))
counta = 0
countb = 0
for i in range(len(a)):
    if(a[i]>b[i]):
        counta = counta + 1
    elif(a[i]<b[i]):
        countb = countb + 1
print(counta , end = " ")
print(countb)

