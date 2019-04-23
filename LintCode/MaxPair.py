def getAns(a, b, x):
    a.sort()
    b.sort()
    for i in range(len(b)-1,0,-1):
        if (b[i] > x):
            b.pop()
    for i in range(len(a)-1,0,-1):
        if (a[i] > x):
            a.pop()
    list = []
    indexa = 0
    indexb = len(b) - 1
    sumTemp = 0
    while(indexa < len(a) and indexb >= 0):
        if (a[indexa] + b[indexb] > x):
            indexb -= 1
            continue
        else:
            if (a[indexa] + b[indexb] < sumTemp):
                indexa += 1
                continue
            elif (a[indexa] + b[indexb] > sumTemp):
                list.clear()
                sumTemp = a[indexa] + b[indexb]
            
            list.append((a[indexa], b[indexb]))
            indexa += 1
 
    return list


a = [2,3,4,5,6]
b = [4,5,7]
print(getAns(a,b,8))