# 1. Take as input N, number of elements in array.
# 2. Take N inputs - Ai - as elements of array A.
# 3. Take as input K.
# 4. Print the longest sub-array sum of whose elements is divisible by k.


n = int(input())
arr = list(map(int, input().split()))
k = int(input())
lb = 0
ub = len(arr)
flag = True
while True:
    sub_sequence = arr[lb:ub]
    if sum(sub_sequence) % k == 0 :
        print(*sub_sequence,sep=' ')
        break
    else:
        tmp = sub_sequence
        if sum(tmp[lb+1:ub]) % k == 0 :
            lb += 1
        elif sum(tmp[lb:ub-1]) % k == 0:
            ub -= 1
        else:
            if flag:
                lb += 1
                flag = False
            else:
                ub -= 1
                flag = True
