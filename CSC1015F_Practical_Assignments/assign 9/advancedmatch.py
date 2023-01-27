#A programme that has a recursive function called ‘match(pattern, word)’ that can be used to determine if a given pattern matches a given word.
#Rector Ratsaka
#27 April 2022

def match(pattern, word):
 if pattern== word or pattern=='*':                                  
  return True
 if word=='' or pattern=='':                         
  return False
 if pattern[0] == "*" and match(pattern[1:],word):   
  return True
 if pattern[0] == word[0] or pattern[0] =="?":       
  return match(pattern[1:] ,word[1:])
 if pattern[0] == "*":                               
  return match(pattern,word[1:])  
 