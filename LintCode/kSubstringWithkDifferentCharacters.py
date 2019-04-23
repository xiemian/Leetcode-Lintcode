def KSubstring(stringIn, K):
    # Write your code here
    length = len(stringIn)
    dict = {}
    index = 0
    list = []
    for i in range(length):
        if (stringIn[i] in dict and dict[stringIn[i]] >= index):
            index = dict[stringIn[i]] + 1
        else:
            if(i - index + 1 == K):
                list.append(stringIn[index:i+1])
                index += 1
        dict[stringIn[i]] = i
    return len(set(list))

print(KSubstring("aaaabbbbaaaabbbbaaaabbbb",2))
