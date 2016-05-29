n,k = input().strip().split(' ')
n,k = [int(n),int(k)]
ns = [int(a_temp) for a_temp in input().strip().split(' ')]

ms = set()
for n in ns:
    found = False
    for m in ms:
        if not found and (n + m) % k == 0:
            found = True
    if not found:
       ms.add(n)
print(len(ms))
