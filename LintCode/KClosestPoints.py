
class Point:
    def __init__(self, a=0, b=0):
        self.x = a
        self.y = b

def kClosest(points, origin, k):
    list = []
    index = 0
    for point in points:
        dis = (point[0] - origin[0])**2 + (point[1] - origin[1])**2
        list.append((dis,point[0],index))
        index += 1
    list.sort()
    result = []
    for i in range(k):
        result.append(points[list[i][2]])
    return result


points = [[4,6],[4,7],[4,4],[2,5],[1,1]]
origin = [0, 0]
k = 3
print(kClosest(points,origin,k))