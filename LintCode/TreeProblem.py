def treeProblem(fa, val):
    list = []
    length = len(fa)
    for i in range(length):
        list.append([val[i],1])
    for i in range(length-1,0,-1):
        list[fa[i]-1][0] += list[i][0]
        list[fa[i]-1][1] += list[i][1]
    
    max = 0
    index = 1000000
    count = 100000
    for i in range(len(list)):
        if list[i][0]/list[i][1] > max:
            max = list[i][0]/list[i][1]
            index = i
            count = list[i][1]
        elif list[i][0]/list[i][1] == max:
            if list[i][1] < count:
                index = i
                count = list[i][1]
    return index+1


fa=[-1,1,2,2,3,5,5]
val=[74,94,100,91,61,94,93]
print(treeProblem(fa,val))