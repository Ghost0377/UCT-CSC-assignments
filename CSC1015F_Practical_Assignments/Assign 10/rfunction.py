"""DEBUG"""
# Reverse a string, Hussein Suleman, 18 march 2015.
 new_sent = ""
 for i in range (len (sentence)-1,-1,-1):
  new_sent = new_sent + sentence[i]
 return new_sent
 sent = input ("Enter a sentence: ")
 print (reverse_string (sent))
 print (reverse_string (sent+sent))