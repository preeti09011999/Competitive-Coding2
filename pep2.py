n = int(input())
ar = list(map(int, input().rstrip().split()))
maxm = max(ar) 
spaces = [ maxm-i for i in ar ]
for i in range(maxm):
    for j in range(len(spaces)):
        if( spaces[j]>0):
            print(' ',end = '')
            spaces[j] -= 1
        else:
            print('*', end ='')
    print()
    

