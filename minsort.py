l1 = [1,2,4,7,10,11,7,12,6,7,16,18,19]
i =  len(l1)
x = 0
##if i % 2 == 0:
##    m = i/2
##    n = i/2 +1
##    left = i/2 -2
##    right = i/2 + 1
##else:
m = i/2 
n = m
left = i/2 - 1
right = i/2 + 1
leftcount =  m
rightcount = n
while (x != i/2-1):
    if l1[left] >= l1[leftcount]:
        m = left
    if l1[right] <= l1[rightcount]:
        n = right
    if l1[n] <= l1[left]:
        m = left
    if l1[m] >= l1[right]:
        n = right
    x += 1
    left -= 1
    right += 1
    

print m,n
