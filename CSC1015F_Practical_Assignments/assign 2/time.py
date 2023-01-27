#Checking validity of time.
#RTSREC001
#28 February 2022

h = int(input("Enter the hours:\n"))
m = int(input("Enter the minutes:\n"))
s = int(input("Enter the seconds:\n"))
if (0 <= h <= 23) and ( 0 <= m <= 59) and (0 <= s <= 59 ):
 print("your time is valid")
else: 
 print("your time is invalid")