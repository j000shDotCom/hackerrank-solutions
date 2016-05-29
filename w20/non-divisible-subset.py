n,k = input().strip().split(' ')
n,k = [int(n),int(k)]
ns = [int(a_temp) for a_temp in input().strip().split(' ')]

mod = {}
for n in ns:
    m = n % k
    if m not in mod:
        mod[m] = []
    mod[m].append(n)

count = 0
ms = mod.keys()
for m in ms:
    if k - m in ms:
        count += max(len(mod[m]), len(mod[k-m]))
        mod[m] = []
        mod[k-m] = []
    else:
        count += len(mod[m])
print(count)

