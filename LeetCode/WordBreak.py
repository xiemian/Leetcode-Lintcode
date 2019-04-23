def wordBreak(s, wordDict):
    length = len(s)
    tmp = [False] * (length+1)
    tmp[0] = True
    for i in range(0,length):
        for j in range(i+1,length+1):
            if (~tmp[j] and (s[i:j] in wordDict) and tmp[i]):
                tmp[j] = True
    return tmp[length]

s = "catsandog"
wordDict = ["cats", "dog", "sand", "and", "cat"]
print(wordBreak(s,wordDict))