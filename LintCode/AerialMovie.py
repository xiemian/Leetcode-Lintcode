def aerial_Movie(t, dur):
    t = t - 30
    index = 0
    while(index < len(dur)):
        if(dur[index] <= 0 or dur[index] >= t):
            del(dur[index])
        else:   
            index += 1
        
    dur.sort() 
    left = 0
    right = len(dur) - 1
    mindis = 1000
    while(left < right):
        dis = t - (dur[left] + dur[right])
        if (dis == 0): return ((dur[left], dur[right]))
        if(dis < 0):
            right -= 1
        else:
            if(dis < mindis):
                result = ((dur[left], dur[right]))
                mindis = dis
            left += 1
            
    return result

t = 60
dur = [15,15,16,13]
print(aerial_Movie(t,dur))