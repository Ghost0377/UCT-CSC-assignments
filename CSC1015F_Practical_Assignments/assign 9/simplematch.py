#A programme that contains a recursive function called ‘match(pattern, word)’, that can be used to determine if a given pattern matches a given word.
#Rector Ratsaka
#26 April 2022

def match(pattern, word):
 if pattern==word :                            #if pattern==word then they match(base)
  return True
 if pattern=='' or word=='':                   #if one of them is empty then they do not match 
  return False
 if pattern[0]==word[0] or pattern[0]=='?':    #if 1st letter of pattern and word match or pattern is ?,remove those matching letters and check again
  return match(pattern[1:], word[1:]) 
 


 
 
