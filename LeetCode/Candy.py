class Solution(object):
    def candy(self):
        #ratings = [1,3,4,5,2]
        ratings = [1,0,2]
        lenR = len(ratings)
        result = [1] * lenR
        for i in range(1,lenR):
            if ratings[i] > ratings[i-1]:
                result[i] = result[i-1] + 1
        #print(result)
        for i in range(lenR - 2,-1,-1):
            if (ratings[i] > ratings[i+1]) & (result[i] <= result[i+1]):
                result[i] = result[i+1] + 1
        #print(result)
        rr = 0
        for i in range(len(result)):
            rr += result[i]

        #print(rr)
        return rr
        



candy = Solution()
candy.candy()