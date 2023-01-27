#A programme ’ that uses recursive functions to find all palindromic primes between two integers N, M, supplied as input. (start and end points are included).
#Rector Ratsaka
#27 April 2022

import sys
sys.setrecursionlimit (30000)

def prime(N,x=2):
    if N%x==0:    return False
    if x==(N-1):    return True
    else: return prime(N,x+1)
        
def palindrome(string):
    if len(string)<=1:
        return True
    return string[0]==string[-1] and palindrome(string[1:-1])
def palindromeprime(N,M):
    if N ==2: print(N)
    if N == 3: print(N)
    if 2<=N<=M and prime(N) and palindrome(str(N)):
        print(N)
        return palindromeprime(N+1,M)
    if N<=M: 
        return palindromeprime(N+1,M)
    
N=eval(input("Enter the starting point N:\n"))
M=eval(input("Enter the ending point M:\n"))
print("The palindromic primes are:")
palindromeprime(N,M)

    
 