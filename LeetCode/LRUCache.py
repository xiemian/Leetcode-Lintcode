
import collections

class LRUCache(object):
    def __init__(self, capacity):
        self.cap = capacity
        self.dd = collections.OrderedDict()
        self.len = 0

    def get(self, key):
        if (key in self.dd):
            value = self.dd[key]
            self.dd.pop(key)
            self.dd[key] = value
            return value
        else:
            return -1


    def put(self, key, value):
        if(key in self.dd):
            self.dd.pop(key)
            self.dd.update(key,value)
        else:
            if(self.len == self.cap):
                self.dd.popitem(last=False)
                self.len -= 1
            self.dd[key] = value
            self.len += 1

cache = LRUCache(2)
cache.put(1, 1)
cache.put(2, 2)
print(cache.get(1))     #returns 1
cache.put(3, 3)    #// evicts key 2
print(cache.get(2))      #// returns -1 (not found)
cache.put(4, 4)    #// evicts key 1
print(cache.get(1))      #// returns -1 (not found)
print(cache.get(3))     #// returns 3
print(cache.get(4))       #// returns 4