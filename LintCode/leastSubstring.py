def rotate(s,k,list):
    length = len(s)
    if (length == 0): return
    if (length == 1):
        list.append(s[0])
        return

    for i in range(1,len(s)):
        if ((s[i] != s[i-1]) | (i == k)):
            list.append(s[0:i])
            rotate(s[i:],k,list)
            return
    list.append(s)
    return

"""
@param s: the string s
@param k: the maximum length of substring
@return: return the least number of substring
"""
def getAns(s, k):
    list = []
    # Write your code here
    if k == 0:
        return
    length = len(s)
    if (length == 0):
        return

    rotate(s,k,list)
    return list

print(getAns("cbabbabb",3))
