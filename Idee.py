inp = int(input())
op = [] 
for i in range(1,4):
  op.append(i * inp)
print(" ".join(map(str, op)))
