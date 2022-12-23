from re import sub
s = int(input())
n = input()
x = int(n)%2 ==0
n = sub('(3|6|9)' , '' , n)
print("YNEOS"[not x or len(n)==s::2])