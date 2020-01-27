# Input -
# The first line contains an integer, n , denoting the size of the array.
# The second line contains n space-separated integers representing the array's elements. 
# Output -
# Sum of elements in the array
int(input())
ar = list(map(int, input().rstrip().split()))
gtn = 0
for i in range(len(ar)):
    gtn = gtn + ar[i]
print(gtn)
