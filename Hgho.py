p=input()
b=[int(m) for m in input().split()]
d=[]
flag=0
for i in set(b):
    if(b.count(i)!=1):
        d.append(i)
        flag=1
if(flag==1):
    print(*sorted(d))
else:
    print("unique")
#
