import math

def nearestRestaurant(restaurant, n):
    tmp = []
    result = []
    if(len(restaurant) == 0 or n == 0 or len(restaurant) < n): return result
    if(len(restaurant) == n): return restaurant   
    for i in range(len(restaurant)):
        tmp.append(math.sqrt(restaurant[i][0]**2+restaurant[i][1]**2))
    tmp.sort()
    k = tmp[n-1]
    for i in range(len(restaurant)):
        if(math.sqrt(restaurant[i][0]**2+restaurant[i][1]**2) <= k):
            result.append(restaurant[i])
            if(len(result) == n):
                break
    return result

n = 3
List = [[0,1],[1,2],[2,2],[1,0]]
print(nearestRestaurant(List,n))