NumbersArray = [2,4,5,99,232,232,-1,0] #can be Extendable

largest = NumbersArray[0]

for i in NumbersArray : 
    if largest < i:
        largest = i

print(largest)

