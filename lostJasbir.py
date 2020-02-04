# Jasbir visited USA and he is lost in the States. His phone got switched-off. As per the rules in USA, all Street names used to be in sorted ascending order but when he visited USA, he found that Trump changed the order of street names.

# (i.e road name before trump were [0,1,2,4,5,6,7] but renamed after trump to a random order like [4,5,6,7,0,1,2]).

# Jasbir wanted to visit a particular street. If he finds this street return its index, otherwise return -1.

# You may assume no duplicate name of street exists in the array.

# Your algorithm's runtime complexity must be in the order of O(log n)

n = int(input())
arr = list(map(int,input().split()))
max_ele = arr.index(max(arr))
arr = list(set(arr))
se = int(input())

## applying binary search here
lb = 0
ub = n-1
flag = False
while lb <= ub:
    mid = ( lb+ub ) // 2
    if se ==  arr[mid]:
        print(mid+max_ele+1)
        flag = True
        break
    elif se < arr[mid]:
        ub = mid - 1
    elif se > arr[mid]:
        lb = mid + 1

if flag == False:
    print(-1)