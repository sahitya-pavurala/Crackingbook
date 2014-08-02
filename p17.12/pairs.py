value = 9
list1 = [1,2,3,4,5,6,7,8]
for i in list1:
     if i < value:
         for j in list1:
             if i + j == value:
                 results = [i,j]
                 list1.remove(i)
                 list1.remove(j)
     print results
