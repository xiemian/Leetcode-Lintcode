class BSTNode:
    value = -1
    left = None
    right = None
    def __init__(self, value):
        self.value = value

def makeTree(node,tree,listNode):
    if node < tree.value:
        listNode.append(0)
        if tree.left != None:
            makeTree(node,tree.left,listNode)
        else:
            tree.left = BSTNode(node)
    else:
        listNode.append(1)
        if tree.right != None:
            makeTree(node,tree.right,listNode)
        else:
            tree.right = BSTNode(node)

def bstDistance(numbers, node1, node2):
    if (len(numbers) < 2): return -1   
    if (node1 not in numbers or node2 not in numbers):
        return -1
    listNode1 = []
    listNode2 = []
    tmp = []
    count = 0
    tree = BSTNode(numbers[0])
    if numbers[0] == node1 or numbers[0] == node2:
        count = 1
    del numbers[0]
    for number in numbers:
        if node1 == number:
            makeTree(node1,tree,listNode1)
            count += 1
        elif node2 == number:
            makeTree(node2,tree,listNode2)
            count += 1
        else:
            if count < 2:
                makeTree(number,tree,tmp)
            else:
                break

    countEqual = 0
    minLength = min(len(listNode1),len(listNode2))
    print(minLength)
    for i in range(minLength):
        if listNode1[i] == listNode2[i]:
            countEqual += 1
        else:
            break
    print(listNode1)
    print(listNode2)
    print(countEqual)
    return len(listNode1)+len(listNode2)-2*countEqual

numbers = [6,5,16,17,4,11,7,13,19,20,18,2,1]
node1 = 13
node2 = 20
print(bstDistance(numbers,node1,node2))