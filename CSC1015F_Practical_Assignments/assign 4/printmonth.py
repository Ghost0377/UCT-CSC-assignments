# Calendar.
# Rector Ratsaka
# 15 March 2022

# numdays is number of days in a month
month = input("Enter the month ('January', ..., 'December'):\n")

#some months do not have equal number of days in a month
if month == 'January' or month == 'March' or month == 'May' or month == 'July' or month == 'August' or month == 'October' or month == 'December':
  numdays = 31
elif month == 'April' or month == 'June' or month == 'September' or month == 'November':
  numdays = 30
elif month == 'February':
  numdays = 28

# n is start day
day = input("Enter the start day ('Monday', ..., 'Sunday'):\n")
if day == 'Monday':
  n = 0
elif day == 'Tuesday':
  n =1  
elif day == 'WEdnesday':
  n = 2
elif day == 'Thursday':
  n = 3
elif day == 'Friday':
  n = 4
elif day == 'Saturday':
  n = 5
elif day == 'Sunday':
  n = 6

print(month)
print('Mo Tu We Th Fr Sa Su')

currentdate = 1  #first day

for i in range(6): #rows
  for j in range(7): #columns
    if currentdate <= numdays:
      if n == 0:
        if currentdate < 10:
          print(' '+str(currentdate), end=' ')
          currentdate += 1
        else:
          print(currentdate, end=' ')
          currentdate += 1
      elif i == 0 and n > j:
        print(end=' '*3)
      else:
        if currentdate < 10:
          print(' '+str(currentdate), end=' ')
          currentdate += 1
        else:
          print(currentdate, end=' ')
          currentdate += 1
  print()
    
    
        
 






