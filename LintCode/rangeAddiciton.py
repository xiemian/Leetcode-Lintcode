def getModifiedArray(length, updates):
    # Write your code here
    result = [0] * length
    num = [0] * (length + 1)
    
    for i in range(len(updates)):
        num[updates[i][0]] += updates[i][2]
        num[updates[i][1] + 1] -= updates[i][2]
        
    for i in range(length):
        print(num[i])
        
    for i in range(length):
        if i == 0:
            result[i] = 0 + num[i]
        else:
            result[i] = result[i-1] + num[i]

    return result

updates = [[1,3,2],[2,4,3],[0,2,-2]]
print(getModifiedArray(5,updates))