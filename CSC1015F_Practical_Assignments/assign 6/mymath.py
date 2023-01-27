#y Python program that calculates the number of k-permutations of n items.
#Rector Ratsaka
#01 April 2022

def get_integer(s): #accepts an integer, s, from the user.
   n = input ("Enter {0}:\n".format(s))
   while not n.isdigit ():
      n = input ("Enter {0}:\n".format(s))  
   return eval (n) #this will work for value of n and k because of s.
        
def calc_factorial(n):
   nfactorial = 1
   for i in range (1, n+1):
      nfactorial *= i
   return nfactorial
if __name__ == '__main__':
   main()