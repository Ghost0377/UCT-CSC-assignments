# Columns.
# Rector Ratsaka
# 06 March 2022

n = eval(input('Enter a number:\n'))
if -6<n<2:
  for c in range(n, n+41, 7):
    if 0<=c<=9:
      print('',c)
    else:
      print(c)