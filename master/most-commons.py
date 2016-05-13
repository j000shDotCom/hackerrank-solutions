from collections import Counter
c = Counter(input())
for (char, count) in c.most_common(3):
    print(char, count)
