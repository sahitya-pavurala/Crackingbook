a = 25
countof5 = 0
def countof5(a):
    count = 0
    while(a%5 == 0):
        count = count +1
        a = a/5
    return count

countfull = 0
for i in range(2,a+1):
    countfull += countof5(i)

print countfull


