input()
ns = list(map(int, input().split(" ")))
pivot, ns = ns[0], ns[1:]
nums, right, equal = [], [], 1
for n in ns:
    if n < pivot:
        nums.append(n)
    elif n > pivot:
        right.append(n)
    else:
        equal += 1
nums += [pivot] * equal
nums += right
[print(n, end=' ') for n in nums]
