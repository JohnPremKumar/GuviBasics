N=int(input())
#test
a=[]
for i in range(N):
    b=list(map(int,input().split()))
    for x in b:
        a.append(x)
a.sort()
for y in range(len(a)):
    if y!=len(a):
        print(a[y],end=' ')
    else:
        print(a[y],end='')
