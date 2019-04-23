def fill(ll,s,record,index,ss):
    if(index < 0):
        ll.append(ss)
        return
    for i in range(len(record[index])):
        tmp = s[record[index][i]:index+1] + " " + ss
        fill(ll,s,record,record[index][i]-1,tmp)
    return

def wordBreak(s, wordDict):
    ll = []
    length = len(s)
    record = [[] for i in range(length)]
    tmp = [False] * (length+1)
    tmp[0] = True
    for i in range(0,length):
        for j in range(i+1,length+1):
            if ((s[i:j] in wordDict) and tmp[i]):
                tmp[j] = True
                record[j-1].append(i)
    for i in range(len(record[length-1])):
        ss = s[record[length-1][i]:]    
        fill(ll,s,record,record[length-1][i]-1,ss)
    return ll



s = "ab"
wordDict = ["a","b"]
print(wordBreak(s, wordDict))