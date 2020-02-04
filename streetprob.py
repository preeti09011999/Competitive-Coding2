n = int(input())
ar = list(map(int, input().rstrip().split()))
ele = int(input())
for i in range(n):
    if(ele == ar[i]):
        print(i)