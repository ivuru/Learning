n = int(input("数はいくつですか？"))

f = open('1.txt')
list_str=f.read().split()
f.close()

min_val=int(list_str[0])
max_val=int(list_str[0])
for i in range(1,n):
    if min_val>int(list_str[i]):
        min_val = int(list_str[i])

    if max_val<int(list_str[i]):
        max_val = int(list_str[i])

print("最小値は"+str(min_val)+"です。")
print("最大値は"+str(max_val)+"です。")