raw = input()
raw = raw.split(" ")
for i in range(0,int(raw[1])):
    if(i == int(raw[1])-1):
        print(raw[0], end = "")
    else:
        print(raw[0], end = "<br>")
