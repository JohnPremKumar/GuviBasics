n = raw_input()
l = list(map(int,raw_input().split()))
new = list()
for i,v in enumerate(l):
    if((v == 0 or v%2 == 0) and (i%2 != 0)):
        new.append(v)
    elif(v%2!=0 and(i==0 or i%2 == 0)):
        new.append(v)
for i in new:
    print(i)
