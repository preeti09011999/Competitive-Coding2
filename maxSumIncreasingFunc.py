# Given an array A, You have to find out Maximum Sum Increasing Subsequence.
# For example: A:[1,12,2,4,99,12,14] then the resultant  array would be:[1,12,99].
# You have to print the sum of that maximum sum Increasing Subsequence.
# Taget time complexity : O(n^2)

n = int(input())
arr = list(map(int, input().split()))
sum = 0
counter = 0

for i in arr:
    if i > counter:
        counter = i
        sum += counter
print(sum)
