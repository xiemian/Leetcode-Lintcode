def reverseWords(s):
    flag = False
    s = s + " "
    re = ""
    for i in range(len(s)):
        if not flag and s[i] != " ":
            start = i
            flag = True
        elif flag and s[i] == " ":
            re = s[start:i] + " " + re
            flag = False
    return re[0:len(re)-1]

print(reverseWords(" the sky is blue"))