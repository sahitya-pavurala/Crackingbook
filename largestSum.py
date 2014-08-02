l1 = [2,-8,3,-2,4]
maxsum = 0
psum = 0
l2 = []
for i in l1:
    psum +=i
    l2.append(i)
    if maxsum < psum:
        maxsum = psum        
    elif psum < 0:
        psum = 0
        l2 = []

print l2        
print maxsum
