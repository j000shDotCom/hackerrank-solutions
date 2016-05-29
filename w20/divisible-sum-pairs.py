#!/bin/python3

import sys

n,k = input().strip().split(' ')
n,k = [int(n),int(k)]
a = [int(a_temp) for a_temp in input().strip().split(' ')]

def pair_sum(k, ns):
    count = 0
    if len(ns) < 2:
        return count
    h = ns[0]
    t = ns[1:]
    
    for n in t:
        if (h+n) % k == 0:
            count += 1
    return count + pair_sum(k, t)

print(pair_sum(k, a))
